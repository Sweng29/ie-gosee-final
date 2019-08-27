package com.gosee.ie.service;

import com.gosee.ie.model.VehicleColor;
import com.gosee.ie.repository.VehicleColorRepository;
import com.gosee.ie.util.GenericDAO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleColorService implements GenericDAO<VehicleColor> {

    private VehicleColorRepository vehicleColorRepository;

    public VehicleColorService(VehicleColorRepository vehicleColorRepository) {
        this.vehicleColorRepository = vehicleColorRepository;
    }

    @Override
    public List<VehicleColor> findAll() {
        return vehicleColorRepository.findAll();
    }

    @Override
    public Optional<VehicleColor> findById(Long id) {
        return vehicleColorRepository.findByIsActive(id);
    }

    @Override
    public List<VehicleColor> findAllByIsActive() {
        return vehicleColorRepository.findAllByIsActive();
    }

    @Override
    public Optional<VehicleColor> findByIdIsActive(Long id) {
        return vehicleColorRepository.findByIsActive(id);
    }

    @Override
    public VehicleColor saveOrUpdate(VehicleColor entity) {
        return vehicleColorRepository.save(entity);
    }

    @Override
    public Boolean deleteById(Long id) {
        vehicleColorRepository.deleteById(id);
        return true;
    }

    @Override
    public Boolean deleteByIdIsActive(Long id) {
        vehicleColorRepository.deleteByIsActive(id);
        return true;
    }
}
