package com.farhan.q1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the number of elements in th array : ");
			int n = sc.nextInt();
			int arr[] = new int[n];
			System.out.println("Enter the elements in the array : ");
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			System.out.println("Enter the index of the array element you want to access: ");
			int i = Integer.parseInt(sc.next());
			System.out.println(arr[i]);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getClass().getSimpleName());
		}
		sc.close();
	}
}
