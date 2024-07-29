package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Student;
import com.example.demo.services.StudentService;

@RestController
public class StudentController {
	@Autowired
StudentService sservice;
	@GetMapping("/getallstudent")
	public List<Student> getAll(){
		return sservice.getAll();
	}
	@GetMapping("/getstudent")
	public Student getStudent(@RequestParam("id") int id) {
		return sservice.getStudent(id);
	}
	@GetMapping("/getstudentt/{id}")
	public Student getStudent1(@PathVariable int id) {
		return sservice.getStudent(id);
	}
	//-------------------
	@DeleteMapping("/deletestudent")
	public String deleteStudent(@RequestParam("id") int id) {
		if(sservice.deleteStudent(id)) {
			return "Data Deleted...";
		}
		return "id not exist....";
	}
	//--------------------
	@PostMapping("/saveStudent")
	public Student saveStudent(@RequestBody Student s) {
		return sservice.save(s);
	}
	
	//*************
	@GetMapping("/getstudbyper")
	public List<Student> getStudents(@RequestParam("percent") float percent){
		return sservice.getStudents(percent);
	}
	
	
	
}
