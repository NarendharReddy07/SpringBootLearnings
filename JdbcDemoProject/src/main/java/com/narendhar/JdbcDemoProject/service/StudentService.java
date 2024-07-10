package com.narendhar.JdbcDemoProject.service;


import com.narendhar.JdbcDemoProject.model.Student;
import com.narendhar.JdbcDemoProject.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StudentService {
    private StudentRepo repo;

    public StudentRepo getRepo() {
        return repo;
    }

    @Autowired
    public void setRepo(StudentRepo repo) {
        this.repo = repo;
    }

    public void addStudent(Student s){
        repo.save(s);
    }
    public List<Student>  getStudents(){
        return repo.findAll();
    }

}
