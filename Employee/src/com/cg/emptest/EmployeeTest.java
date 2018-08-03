package com.cg.emptest;

import java.util.Scanner;

import com.cg.employee.Employee;

public class EmployeeTest {
	public static void main(String[] args) {
		Scanner get = new Scanner(System.in);

		System.out.println("Enter Number of Employees");
		int no_Emp = get.nextInt();
		String empId, name;
		double monthlyBasicSal;

		// Array of objects for N employees
		Employee[] emp = new Employee[no_Emp];

		for (int i = 0; i < no_Emp; i++) {
			emp[i] = new Employee();// Instantiating the class
			System.out.println("Enter detials of Employee " + (i + 1));

			System.out.println("Enter ID of employee");
			empId = get.next();

			System.out.println("Enter Name of employee");
			name = get.next();

			System.out.println("Enter monthly basic salary of employee");
			monthlyBasicSal = get.nextDouble();

			emp[i].setId(empId);
			emp[i].setMonthlyBasic(monthlyBasicSal);
			emp[i].setName(name);
		}
		for (int i = 0; i < no_Emp; i++) {
			emp[i].calc();// invoking calc from Employee_Details

			System.out.println("Salary Detials of Employee " + (i + 1));

			System.out.println("Employee ID: " + emp[i].getId());
			System.out.println("Employee Name: " + emp[i].getName());
			System.out.println("AnnualBasic: " + emp[i].getAnnualBasic());
			System.out.println("MonthlyGrossSalary: " + emp[i].getMonthlyGrossSalary());
			System.out.println("AnnualGrossSalary: " + emp[i].getAnnualGrossSalary());
			System.out.println("MonthlyDeductions: " + emp[i].getMonthlyDeductions());
			System.out.println("MonthlyTakeHome: " + emp[i].getMonthlyTakeHome());
			System.out.println("AnnualTakeHome: " + emp[i].getAnnualTakeHome());
		}
	}
}
