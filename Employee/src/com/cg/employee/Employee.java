//class with all the calculating functions
package com.cg.employee;

public class Employee {
	private String Id;
	private String name;
	private double monthlyBasic;
	private double pf;
	double HRA = monthlyBasic * 0.5;
	static final int medical = 1250;
	static final int conveallow = 800;
	double ESIC;
	double PTax;

	// setting values of pf,ESIC,PTax
	public void calc() {
		if (monthlyBasic > 6500) {
			pf = .1 * monthlyBasic;
		} else {
			pf = 0;
		}
		if (monthlyBasic <= 5000) {
			ESIC = .0475 * monthlyBasic;
		} else {
			ESIC = 0;
		}
		if (getMonthlyGrossSalary() < 10000) {
			PTax = 50;
		} else {
			PTax = 100;
		}
	}

	// Getter and Setters
	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMonthlyBasic() {
		return monthlyBasic;
	}

	public void setMonthlyBasic(double monthlyBasic) {
		this.monthlyBasic = monthlyBasic;
	}

//Different fuctions for salary calculation
	public double getAnnualBasic() {
		return 12 * monthlyBasic;
	}

	public double getMonthlyGrossSalary() {
		return monthlyBasic + HRA + medical + conveallow;
	}

	public double getAnnualGrossSalary() {
		return 12 * getMonthlyGrossSalary();
	}

	public double getMonthlyDeductions() {
		return pf + ESIC + PTax;
	}

	public double getMonthlyTakeHome() {
		return getMonthlyGrossSalary() - getMonthlyDeductions();
	}

	public double getAnnualTakeHome() {
		return 12 * getMonthlyTakeHome();
	}

}
