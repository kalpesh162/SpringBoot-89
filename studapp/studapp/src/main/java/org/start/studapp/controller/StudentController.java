package org.start.studapp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
/*
@Controller
@ResponseBody
*/
import org.start.studapp.entity.Student;

@RestController
public class StudentController {

	// @RequestMapping(value = "/get" , method = RequestMethod.GET)
	@GetMapping("/get")
	public Student getStudent() {
		Student student = new Student(11, "Hello", 77.77);
		return student;
	}

	@GetMapping("/all")
	public List<Student> getAllStudents() {
		Student student1 = new Student(11, "Hello", 47.77);
		Student student2 = new Student(12, "Anup", 57.77);
		Student student3 = new Student(13, "Amol", 67.77);
		Student student4 = new Student(14, "Vedant", 77.77);
		Student student5 = new Student(15, "Pavan Ji", 87.77);
		List<Student>list=new ArrayList<Student>();
		list.add(student1);
		list.add(student2);
		list.add(student3);
		list.add(student4);
		list.add(student5);
		return list;
	}

}
