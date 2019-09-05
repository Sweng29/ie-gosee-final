package com.gosee.ie.service;

import com.gosee.ie.model.Role;
import com.gosee.ie.model.User;
import com.gosee.ie.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public void register(User user){
        user.setActive(1);
        Set<Role> roles = new HashSet<Role>();
        Role role = new Role();
        role.setRole("ROLE_SELLER");
        roles.add(role);
        user.setRoles(roles);
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        userRepository.save(user);
    }
}
