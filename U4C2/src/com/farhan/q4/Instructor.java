package com.farhan.q4;

public class Instructor extends Person {
	int instructorId;
	int salary;
	@Override
	public String toString() {
		return "Instructor [instructorId=" + instructorId + ", salary=" + salary + ", person=" + super.toString() + "]";
	}
	
}
