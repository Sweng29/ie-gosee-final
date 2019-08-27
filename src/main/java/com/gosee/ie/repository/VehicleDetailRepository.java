package com.gosee.ie.repository;

import com.gosee.ie.model.VehicleDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Repository
public interface VehicleDetailRepository extends JpaRepository<VehicleDetail, Long> {

    @Query("Select v from VehicleDetail v where v.isActive = 1")
    public List<VehicleDetail> findAllByIsActive();

    @Query("select v from VehicleDetail v where v.vehicleDetailId=?1 and v.isActive=1")
    public Optional<VehicleDetail> findByIsActive(Long id);

    @Transactional
    @Modifying
    @Query("update VehicleDetail v set v.isActive = 0 where v.isActive = ?1")
    public void deleteByIsActive(Long id);

    @Query("Select v from VehicleDetail v where v.isActive = 1 and v.category")
    public List<VehicleDetail> findAllByIsActiveAAndAndCategory_CategoryId(Long categoryId);
}
