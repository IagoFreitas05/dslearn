package com.devsuperior.dslearnbds.services;

import com.devsuperior.dslearnbds.entities.User;
import com.devsuperior.dslearnbds.repositories.UserRepository;
import com.devsuperior.dslearnbds.services.exceptions.ForbiddenException;
import com.devsuperior.dslearnbds.services.exceptions.UnathorizedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AuthService {
    @Autowired
    private UserRepository userRepository;
    @Transactional(readOnly = true)
    public User authenticated(){
        try{
              String username = SecurityContextHolder.getContext().getAuthentication().getName();
              return userRepository.findByEmail(username);
        }catch(Exception e){
            throw new UnathorizedException("Invalid user");
        }
    }

    public void validateSelfOrAdmin(Long userid){
        User user = authenticated();
        if(!user.getId().equals(userid) && !user.hasHole("ROLE_ADMIN") ){
            throw new ForbiddenException("Access Denied");
        }
    }
}