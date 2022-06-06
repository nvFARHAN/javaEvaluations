package com.farhan.q2;

public class PermanentEmployee extends Employee {
	private double basicPay;

	public PermanentEmployee(int employeeId, String employeeName, double basicPay) {
		super(employeeId, employeeName);
		this.basicPay = basicPay;
		this.calculateSalary();
	}

	@Override
	void calculateSalary() {
		// TODO Auto-generated method stub
		double PFAmount = basicPay * 0.12;
		double salary = basicPay - PFAmount;
		this.setSalary(salary);
	}

}
