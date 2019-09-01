package com.gosee.ie.controller;

import com.gosee.ie.exception.ResourceNotFoundException;
import com.gosee.ie.model.Category;
import com.gosee.ie.model.FileUpload;
import com.gosee.ie.service.CategoryService;
import com.gosee.ie.service.FileUploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import javax.validation.constraints.Min;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;
    @Autowired
    private FileUploadService fileUploadService;

    @GetMapping
    public ResponseEntity findAllByIsActive() {
        return ResponseEntity.ok().body(categoryService.findAllByIsActive());
    }

    @GetMapping(value = "/category/{id}")
    public ResponseEntity<Category> findByIdAndIsActive(@PathVariable @Min(1) Long id) throws ResourceNotFoundException {
        if (id != null) {
            Category category = categoryService.findByIdIsActive(id).orElseThrow(() -> new ResourceNotFoundException("Category not found on :: " + id));
            return ResponseEntity.ok().body(category);
        }
        return ResponseEntity.notFound().build();
    }

    /*@PostMapping*/
    public ResponseEntity saveCategory(@Valid @RequestBody Category category) {
        category.setIsActive((short) 1);
        return ResponseEntity.ok().body(categoryService.saveOrUpdate(category));
    }

    @PostMapping
    public ResponseEntity saveCategoryWithImage(@ModelAttribute Category category) {
        if (category.getImageFile() != null) {
            FileUpload fileUpload = fileUploadService.storeFile(category.getImageFile());
            String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath()
                    .path("/downloadFile/")
                    .path(fileUpload.getFileUploadId().toString())
                    .toUriString();

            category.setIsActive((short) 1);
            category.setFileUpload(fileUpload);
            categoryService.saveOrUpdate(category);
            return ResponseEntity.ok().body(category);
        }
        return ResponseEntity.badRequest().build();
    }

    @PutMapping("/category/{id}")
    public ResponseEntity updateCategory(@Valid @RequestBody Category category, @PathVariable @Min(1) Long id) throws ResourceNotFoundException {

        if (id != null) {
            Category category1 = categoryService.findByIdIsActive(id).orElseThrow(() -> new ResourceNotFoundException("Category not found on :: " + id));
            category1 = category;
            category1.setName(category.getName());
            category1.setIsActive((short) 1);
            category1.setCategoryId(id);
            return ResponseEntity.ok().body(categoryService.saveOrUpdate(category1));
        }

        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/category/{id}")
    public ResponseEntity deleteById(@PathVariable @Min(1) Long id) {
        if (id != null) {
            categoryService.deleteByIdIsActive(id);
            return ResponseEntity.ok().body("Record deleted successfully!");
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/category/{id}/subcategories")
    public ResponseEntity findSubcategoriesByCategoryId(@PathVariable @Min(1) Long id)
    {
        if(id != null)
        {
            return ResponseEntity.ok().body(categoryService.findAllSubcategoriesByCategoryId(id));
        }
        return ResponseEntity.notFound().build();
    }

}
