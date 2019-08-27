package com.gosee.ie.repository;

import com.gosee.ie.model.VehicleColor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Repository
public interface VehicleColorRepository extends JpaRepository<VehicleColor, Long> {

    @Query("Select v from VehicleColor v where v.isActive = 1")
    public List<VehicleColor> findAllByIsActive();

    @Query("select v from VehicleColor v where v.vehicleColorId=?1 and v.isActive=1")
    public Optional<VehicleColor> findByIsActive(Long id);

    @Transactional
    @Modifying
    @Query("update VehicleColor v set v.isActive = 0 where v.isActive = ?1")
    public void deleteByIsActive(Long id);
}
