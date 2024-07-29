package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Student;

import jakarta.transaction.Transactional;
@Transactional
@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {
@Query("select s from Student s where s.percent>:per")
	public List<Student> getStud(float per);
/*
 * @Modifying
	@Query("update Emp e set e.sal = :sal where e.empno = :empno")
	public int updateSal(int empno,float sal);
 * */
}
