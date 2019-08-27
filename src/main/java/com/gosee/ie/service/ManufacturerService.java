package com.gosee.ie.service;

import com.gosee.ie.model.Manufacturer;
import com.gosee.ie.repository.ManufacturerRepository;
import com.gosee.ie.util.GenericDAO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ManufacturerService implements GenericDAO<Manufacturer> {

    private ManufacturerRepository manufacturerRepository;

    public ManufacturerService(ManufacturerRepository manufacturerRepository) {
        this.manufacturerRepository = manufacturerRepository;
    }


    @Override
    public List<Manufacturer> findAll() {
        return manufacturerRepository.findAll();
    }

    @Override
    public Optional<Manufacturer> findById(Long id) {
        return manufacturerRepository.findById(id);
    }

    @Override
    public List<Manufacturer> findAllByIsActive() {
        return manufacturerRepository.findAllByIsActive();
    }

    @Override
    public Optional<Manufacturer> findByIdIsActive(Long id) {
        return manufacturerRepository.findByIsActive(id);
    }

    @Override
    public Manufacturer saveOrUpdate(Manufacturer entity) {
        return manufacturerRepository.save(entity);
    }

    @Override
    public Boolean deleteById(Long id) {
        manufacturerRepository.deleteById(id);
        return true;
    }

    @Override
    public Boolean deleteByIdIsActive(Long id) {
        manufacturerRepository.deleteByIsActive(id);
        return true;
    }
}
