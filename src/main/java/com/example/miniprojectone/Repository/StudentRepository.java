package com.example.miniprojectone.Repository;

import com.example.miniprojectone.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
