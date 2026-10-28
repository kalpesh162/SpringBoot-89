package com.example.studentmanagement.service;

import java.util.List;

import com.example.studentmanagement.model.Student;

public interface StudentService {

	Student addStudent(Student student);

	List<Student> getAllStudents();

	Student getStudentById(int id);

	Student updateStudent(int id, Student student);

	void deleteStudent(int id);

}
