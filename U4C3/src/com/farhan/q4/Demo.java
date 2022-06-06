package com.farhan.q4;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter username : ");
		String username = sc.next();
		System.out.println("Enter password : ");
		String password = sc.next();
		System.out.println("Enter mobile number : ");
		String mobileNumber = sc.next();
		System.out.println("Enter email : ");
		String email = sc.next();

		if (username.matches("[a-zA-Z]{3,8}")) {
			if (password.matches("[a-zA-Z0-9]{3,8}")) {
				if (mobileNumber.matches("[+][9][1][6789][0-9]{9}")) {
					if (email.matches("[a-z][a-z0-9]*[@][a-z]+[.][c][o][m]")) {
						Customer c = new Customer();
						c.setEmail(email);
						c.setMobileNumber(mobileNumber);
						c.setPassword(password);
						c.setUsername(username);
						System.out.println("username : " + c.getUsername());
						System.out.println("password : " + c.getPassword());
						System.out.println("mobile number : " + c.getMobileNumber());
						System.out.println("email : " + c.getEmail());
					} else
						System.out.println("Invalide email");
				} else
					System.out.println("Invalid mobile number");
			} else
				System.out.println("Invalid password");
		} else
			System.out.println("Invalid username");

		sc.close();
	}
}
