package net.kalpesh.restapi.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@RestController
public class HelloController {

	@RequestMapping(value = { "/hello", "/show" }, method = RequestMethod.GET)
	@ResponseBody
	public String sayHello() {
		return "Hello";
	}

	@RequestMapping(value = "/welcome/{name}", method = RequestMethod.GET)
	@ResponseBody
	public String sayWelcome(@PathVariable String name) {
		return "Hello " + name.toUpperCase();
	}

	@RequestMapping(value = "/hi", method = RequestMethod.GET)
	@ResponseBody
	public String sayHi(@RequestParam("name") String name) {
		return "Hello " + name.toUpperCase();
	}

	@RequestMapping(value = "/cool", method = RequestMethod.GET)
	@ResponseBody
	public String sayHi1(String name) {
		return "Hello " + name.toUpperCase();
	}

	// http://localhost:8080/get?id=5 @RequestParam
	@RequestMapping(value = "/get", method = RequestMethod.GET)
	@ResponseBody
	public String sayHi2(int id) {
		return "Hello " + id;
	}

	@RequestMapping(value = "/sum/{A}", method = RequestMethod.GET)
	@ResponseBody
	public String multipleArgs(@PathVariable int A[]) {
		int sum = 0;
		for (int i = 0; i < A.length; i++)
			sum += A[i];

		return String.valueOf(sum);

	}

	@RequestMapping(value = "/numbers", method = RequestMethod.GET)
	@ResponseBody
	public List<Integer> getAllNumbers(@RequestBody List<Integer> list) {
		return list;
	}

}
