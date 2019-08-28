package com.gosee.ie.service;

import com.gosee.ie.model.VehicleDetail;
import com.gosee.ie.repository.VehicleDetailRepository;
import com.gosee.ie.util.GenericDAO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleDetailService implements GenericDAO<VehicleDetail> {

    private VehicleDetailRepository vehicleDetailRepository;

    public VehicleDetailService(VehicleDetailRepository vehicleDetailRepository) {
        this.vehicleDetailRepository = vehicleDetailRepository;
    }

    @Override
    public List<VehicleDetail> findAll() {
        return vehicleDetailRepository.findAll();
    }

    @Override
    public Optional<VehicleDetail> findById(Long id) {
        return vehicleDetailRepository.findById(id);
    }

    @Override
    public List<VehicleDetail> findAllByIsActive() {
        return vehicleDetailRepository.findAllByIsActive();
    }

    @Override
    public Optional<VehicleDetail> findByIdIsActive(Long id) {
        return vehicleDetailRepository.findByIsActive(id);
    }

    @Override
    public VehicleDetail saveOrUpdate(VehicleDetail entity) {
        return vehicleDetailRepository.save(entity);
    }

    @Override
    public Boolean deleteById(Long id) {
        vehicleDetailRepository.deleteById(id);
        return true;
    }

    @Override
    public Boolean deleteByIdIsActive(Long id) {
        vehicleDetailRepository.deleteByIsActive(id);
        return true;
    }

    public List<VehicleDetail> findAllByCategoryId(Long categoryId) {
        return vehicleDetailRepository.findAllByCategoryId(categoryId);
    }
}
