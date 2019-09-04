package com.gosee.ie.repository;

import com.gosee.ie.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query("Select u from User u where u.active = 1 and u.email = ?1")
    public User findByEmailAndActive(String email);

    @Query("Select u from User u where u.email = ?1 and u.password= ?2")
    public User findByEmailAndPassword(String email, String password);

}
