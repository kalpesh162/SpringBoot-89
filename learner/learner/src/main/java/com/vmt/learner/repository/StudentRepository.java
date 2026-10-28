package com.vmt.learner.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vmt.learner.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
