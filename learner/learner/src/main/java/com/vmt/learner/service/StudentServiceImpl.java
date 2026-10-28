package com.vmt.learner.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vmt.learner.entity.Student;
import com.vmt.learner.exception.StudentNotFoundException;
import com.vmt.learner.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	// repository

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public Student addStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public List<Student> getAllStudents() {

		return studentRepository.findAll();
	}

	@Override
	public Student getStudentById(int id) {

		Optional<Student> optional = studentRepository.findById(id);

		return optional.get();
	}

	@Override
	public Student updateStudent(int id, Student updatedStudent) {
		Optional<Student> studentOptional = studentRepository.findById(id);
		if (studentOptional.isPresent()) {
			Student existingStudent = studentOptional.get();
			existingStudent.setName(updatedStudent.getName());
			existingStudent.setAge(updatedStudent.getAge());
			existingStudent.setCourse(updatedStudent.getCourse());
			return studentRepository.save(existingStudent);
		} else {
			throw new StudentNotFoundException("Student not found with ID: " + id);
		}

	}

	@Override
	public void deleteStudent(int id) {
		studentRepository.deleteById(id);
	}

}
