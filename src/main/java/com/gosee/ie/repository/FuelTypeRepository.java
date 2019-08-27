package com.gosee.ie.repository;

import com.gosee.ie.model.FuelType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Repository
public interface FuelTypeRepository extends JpaRepository<FuelType, Long> {

    @Query("Select f from FuelType f where f.isActive = 1")
    public List<FuelType> findAllByIsActive();

    @Query("select c from FuelType c where c.fuelTypeId=?1 and c.isActive=1")
    public Optional<FuelType> findByIsActive(Long id);

    @Transactional
    @Modifying
    @Query("update FuelType c set c.isActive = 0 where c.fuelTypeId = ?1")
    public void deleteByIsActive(Long id);

}
