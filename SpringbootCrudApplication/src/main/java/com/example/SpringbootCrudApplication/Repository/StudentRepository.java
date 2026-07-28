package com.example.SpringbootCrudApplication.Repository;

import com.example.SpringbootCrudApplication.Entity.Student;
import com.example.SpringbootCrudApplication.Service.StudentService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
