package com.vmt.learner.service;

import java.util.List;

import com.vmt.learner.entity.Student;

public interface StudentService {
    Student addStudent(Student student);
    List<Student> getAllStudents();
    Student getStudentById(int id);
    Student updateStudent(int id, Student student);
    void deleteStudent(int id);

}
