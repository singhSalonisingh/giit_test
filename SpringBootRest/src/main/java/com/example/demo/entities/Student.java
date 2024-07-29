package com.example.demo.entities;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	@Id
	@Column
	int id;
	
	@Column
	String name;
	
	@Column
	String city;
	
	@Column
	@JsonFormat(pattern="yyyy-MM-dd")
	Date bdate;
	
	@Column
	float percent;
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Student(int id, String name, String city, Date bdate, float percent) {
	super();
	this.id = id;
	this.name = name;
	this.city = city;
	this.bdate = bdate;
	this.percent = percent;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public Date getBdate() {
	return bdate;
}
public void setBdate(Date bdate) {
	this.bdate = bdate;
}
public float getPercent() {
	return percent;
}
public void setPercent(float percent) {
	this.percent = percent;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", city=" + city + ", bdate=" + bdate + ", percent=" + percent
			+ "]";
}


}
