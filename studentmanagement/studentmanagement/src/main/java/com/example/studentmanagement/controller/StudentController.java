package com.example.studentmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.studentmanagement.model.Student;
import com.example.studentmanagement.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	private StudentService service;

	@Autowired
	public StudentController(StudentService service) {
		this.service = service;
	}

	@PostMapping("/add")
	public Student addStudent(@RequestBody Student student) {
		return service.addStudent(student);
	}

	@GetMapping("/all")
	public List<Student> getAllStudents() {
		return service.getAllStudents();
	}

	@GetMapping("/{id}")
	public Student getStudentById(@PathVariable int id) {
		return service.getStudentById(id);
	}

	@PutMapping("/update/{id}")
	public Student updateStudent(@PathVariable int id, @RequestBody Student student) {
		return service.updateStudent(id, student);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteStudent(@PathVariable int id) {
		service.deleteStudent(id);
		return "Student with ID " + id + " deleted successfully.";
	}

}
