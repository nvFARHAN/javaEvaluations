package com.farhan.q2;

public class Loan {
	public double calculateLoanAmount(Employee employeeObj) {
		double amount = 0;
		if (employeeObj instanceof PermanentEmployee)
			amount = 0.15 * employeeObj.getSalary();
		if (employeeObj instanceof TemporaryEmployee)
			amount = employeeObj.getSalary() / 10;
		return amount;
	}

	private Loan() {

	}

	public static Loan getLoan() {
		return new Loan();
	}
}
