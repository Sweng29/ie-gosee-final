package com.gosee.ie.service;

import com.gosee.ie.model.TransmissionType;
import com.gosee.ie.repository.TransmissionTypeRepository;
import com.gosee.ie.util.GenericDAO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TransmissionTypeService implements GenericDAO<TransmissionType> {

    private TransmissionTypeRepository transmissionTypeRepository;

    public TransmissionTypeService(TransmissionTypeRepository transmissionTypeRepository) {
        this.transmissionTypeRepository = transmissionTypeRepository;
    }

    @Override
    public List<TransmissionType> findAll() {
        return transmissionTypeRepository.findAll();
    }

    @Override
    public Optional<TransmissionType> findById(Long id) {
        return transmissionTypeRepository.findById(id);
    }

    @Override
    public List<TransmissionType> findAllByIsActive() {
        return transmissionTypeRepository.findAllByIsActive();
    }

    @Override
    public Optional<TransmissionType> findByIdIsActive(Long id) {
        return transmissionTypeRepository.findByIsActive(id);
    }

    @Override
    public TransmissionType saveOrUpdate(TransmissionType entity) {
        return transmissionTypeRepository.save(entity);
    }

    @Override
    public Boolean deleteById(Long id) {
        transmissionTypeRepository.deleteById(id);
        return true;
    }

    @Override
    public Boolean deleteByIdIsActive(Long id) {
        transmissionTypeRepository.deleteByIsActive(id);
        return true;
    }
}
