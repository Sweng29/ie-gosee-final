package com.gosee.ie.service;

import com.gosee.ie.model.FuelType;
import com.gosee.ie.repository.FuelTypeRepository;
import com.gosee.ie.util.GenericDAO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FuelTypeService implements GenericDAO<FuelType> {

    private FuelTypeRepository fuelTypeRepository;

    public FuelTypeService(FuelTypeRepository fuelTypeRepository) {
        this.fuelTypeRepository = fuelTypeRepository;
    }

    @Override
    public List<FuelType> findAll() {
        return fuelTypeRepository.findAll();
    }

    @Override
    public Optional<FuelType> findById(Long id) {
        return fuelTypeRepository.findById(id);
    }

    @Override
    public List<FuelType> findAllByIsActive() {
        return fuelTypeRepository.findAllByIsActive();
    }

    @Override
    public Optional<FuelType> findByIdIsActive(Long id) {
        return fuelTypeRepository.findByIsActive(id);
    }

    @Override
    public FuelType saveOrUpdate(FuelType entity) {
        return fuelTypeRepository.save(entity);
    }

    @Override
    public Boolean deleteById(Long id) {
        fuelTypeRepository.deleteById(id);
        return true;
    }

    @Override
    public Boolean deleteByIdIsActive(Long id) {
        fuelTypeRepository.deleteByIsActive(id);
        return true;
    }
}
