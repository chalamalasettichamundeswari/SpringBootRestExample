package com.springboot.springweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.springweb.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
