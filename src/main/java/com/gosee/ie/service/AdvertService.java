package com.gosee.ie.service;

import com.gosee.ie.model.AdvertDetails;
import com.gosee.ie.util.GenericDAO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdvertService implements GenericDAO<AdvertDetails> {
    @Override
    public List<AdvertDetails> findAll() {
        return null;
    }

    @Override
    public Optional<AdvertDetails> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<AdvertDetails> findAllByIsActive() {
        return null;
    }

    @Override
    public Optional<AdvertDetails> findByIdIsActive(Long id) {
        return Optional.empty();
    }

    @Override
    public AdvertDetails saveOrUpdate(AdvertDetails entity) {
        return null;
    }

    @Override
    public Boolean deleteById(Long id) {
        return null;
    }

    @Override
    public Boolean deleteByIdIsActive(Long id) {
        return null;
    }
}
