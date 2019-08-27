package com.gosee.ie.repository;

import com.gosee.ie.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

    @Query("Select c from Category c where c.isActive = 1")
    public List<Category> findAllByIsActive();

    @Query("select c from Category c where c.categoryId=?1 and c.isActive=1")
    public Optional<Category> findByIsActive(Long id);

    @Transactional
    @Modifying
    @Query("update Category c set c.isActive = 0 where c.categoryId = ?1")
    public void deleteByIsActive(Long id);

}
