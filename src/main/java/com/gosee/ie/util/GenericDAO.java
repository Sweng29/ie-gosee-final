package com.gosee.ie.util;

import java.util.List;
import java.util.Optional;

public interface GenericDAO<T> {

    public List<T> findAll();

    public Optional<T> findById(Long id);

    public List<T> findAllByIsActive();

    public Optional<T> findByIdIsActive(Long id);

    public T saveOrUpdate(T entity);

    public Boolean deleteById(Long id);

    public Boolean deleteByIdIsActive(Long id);

}
