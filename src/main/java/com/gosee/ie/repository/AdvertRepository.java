package com.gosee.ie.repository;

import com.gosee.ie.model.AdvertDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdvertRepository extends JpaRepository<AdvertDetails, Long> {

    @Query(value = "select a from AdvertDetails a where a.isActive = 1 and a.advertType = ?1")
    List<AdvertDetails> findAllByAdvertType(String advertType);
    /*@Query(value = "select a from AdvertDetails a join User where a.isActive = 1 and u.userId = ?1")
    List<AdvertDetails> findAllByUser(Long userId);
    @Query(value = "select a from AdvertDetails a")
    List<AdvertDetails> findAllByVehicleDetailCategoryId(Long categoryId);*/
}
