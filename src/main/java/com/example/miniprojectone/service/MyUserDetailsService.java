package com.example.miniprojectone.service;

import com.example.miniprojectone.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MyUserDetailsService implements UserDetailsService {


    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        return new User("username", "password", new ArrayList<>());
    }
}
