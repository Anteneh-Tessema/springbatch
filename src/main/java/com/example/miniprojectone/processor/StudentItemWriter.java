package com.example.miniprojectone.processor;

import com.example.miniprojectone.model.Student;
import com.example.miniprojectone.Repository.StudentRepository;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StudentItemWriter implements ItemWriter<Student> {


    @Autowired
    private StudentRepository studentRepository;


    @Override
    public void write(List<? extends Student> students) throws Exception {
        System.out.println("Data Saved for Students: " + students);
        studentRepository.save(students);
    }
}
