package com.gosee.ie.repository;

import com.gosee.ie.model.Manufacturer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Repository
public interface ManufacturerRepository extends JpaRepository<Manufacturer, Long> {

    @Query("Select m from Manufacturer m where m.isActive = 1")
    public List<Manufacturer> findAllByIsActive();

    @Query("select m from Manufacturer m where m.manufacturerId=?1 and m.isActive=1")
    public Optional<Manufacturer> findByIsActive(Long id);

    @Transactional
    @Modifying
    @Query("update Manufacturer m set m.isActive = 0 where m.manufacturerId = ?1")
    public void deleteByIsActive(Long id);

}
