package com.gosee.ie.repository;

import com.gosee.ie.model.TransmissionType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Repository
public interface TransmissionTypeRepository extends JpaRepository<TransmissionType, Long> {

    @Query("Select t from TransmissionType t where t.isActive = 1")
    public List<TransmissionType> findAllByIsActive();

    @Query("select t from TransmissionType t where t.transmissionTypeId=?1 and t.isActive=1")
    public Optional<TransmissionType> findByIsActive(Long id);

    @Transactional
    @Modifying
    @Query("update TransmissionType t set t.isActive = 0 where t.transmissionTypeId = ?1")
    public void deleteByIsActive(Long id);
}
