package com.example.miniprojectone.service;

import com.example.miniprojectone.Repository.StudentRepository;
import com.example.miniprojectone.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repository;

    public List<Student> getAllStudents(){
        return (List<Student>) repository.findAll();
    }
}
