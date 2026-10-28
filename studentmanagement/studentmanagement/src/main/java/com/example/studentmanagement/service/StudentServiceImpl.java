package com.example.studentmanagement.service;

import java.rmi.StubNotFoundException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.studentmanagement.exception.StudentNotFoundException;
import com.example.studentmanagement.model.Student;

@Service
public class StudentServiceImpl implements StudentService {

	private List<Student> students = new ArrayList<Student>();
	private static int studentIdCounter = 1;

	@Override
	public Student addStudent(Student student) {
		student.setId(studentIdCounter++);
		if (students.add(student))
			return student;
		else
			return null;
	}

	@Override
	public List<Student> getAllStudents() {
		return students;
	}

	@Override
	public Student getStudentById(int id) {
		for (Student student : students)
			if (student.getId() == id)
				return student;

		throw new StudentNotFoundException("Student not founf exception  " + id);
	}

	@Override
	public Student updateStudent(int id, Student updatedStudent) {
		/*
		 * Student student2 = getStudentById(id); int index =
		 * students.indexOf(student2); students.set(index, student);
		 */
		Student student2 = getStudentById(id);
		student2.setName(updatedStudent.getName());
		student2.setAge(updatedStudent.getAge());
		student2.setCourse(updatedStudent.getCourse());

		return student2;

	}

	@Override
	public void deleteStudent(int id) {
		Student student2 = getStudentById(id);
		students.remove(student2);

	}

}
