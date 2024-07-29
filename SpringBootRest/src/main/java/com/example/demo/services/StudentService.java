package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Student;
import com.example.demo.repositories.StudentRepo;

@Service
public class StudentService {
	@Autowired
StudentRepo srepo;

public List<Student> getAll(){
	return srepo.findAll();
}


public Student getStudent(int id ) {
	Optional<Student> ost= srepo.findById(id);
	Student s=null;
	try {
		s=ost.get();
	}
	catch(Exception ex) {
		ex.printStackTrace();
	}
	return s;
}

public boolean deleteStudent(int id) {
	if(srepo.existsById(id)) {
		srepo.deleteById(id);
		return true;
	}
	else
		return false;
}

public Student save(Student s) {
	return srepo.save(s);
}


//***********
public List<Student> getStudents(float percent){
	return srepo.getStud(percent);
}
}
