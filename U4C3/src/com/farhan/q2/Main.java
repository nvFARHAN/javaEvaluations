package com.farhan.q2;

public class Main {
	public static void main(String[] args) {
		Loan loan = Loan.getLoan();
		double amount = 0;
		PermanentEmployee e1 = new PermanentEmployee(121, "Farhan", 2000);
		amount = loan.calculateLoanAmount(e1);
		System.out.println("Loan amount for permanent employee : " + amount);
		TemporaryEmployee e2 = new TemporaryEmployee(125, "Kajal", 9, 100);
		amount = loan.calculateLoanAmount(e2);
		System.out.println("Loan amount for temporary employee : " + amount);
		amount = loan.calculateLoanAmount(null);
		System.out.println("Loan amount for null value : " + amount);
	}
}
