package com.employeewage;

public class EmployeeWage {
	public static int SalHour;
	public static int fullday;
	public static int isFullTime;
	public static int empHrs;
	public static int isPartTime;
	
	String nameOfCompany; int wage, noWorkingDays, hoursPerMonth ;

	public EmployeeWage() {
		// Default Constructor
	}

	

	public EmployeeWage(String nameOfCompany, int wage, int noWorkingDays, int hoursPerMonth) {
		
		this.nameOfCompany = nameOfCompany;
		this.wage = wage;
		this.noWorkingDays = noWorkingDays;
		this.hoursPerMonth = hoursPerMonth;
	}



	@Override
	public String toString() {
		return "EmployeeWage [nameOfCompany=" + nameOfCompany + ", wage=" + wage + "]";
	}



	public void companyWage() {
		int totalCompanyWage;
		int empCheck = (int) Math.floor(Math.random() * 10) % 2;
		if(empCheck == isPartTime)
		{
			empHrs=8;
		}
		else {
			empHrs=4;
		}
		totalCompanyWage = noWorkingDays * hoursPerMonth * wage* empHrs;
		System.out.println("Total Emplotee wage for " + nameOfCompany + " is " + totalCompanyWage);

	}

	public void employeeWage(int flag) {

		if (flag == 1) {
			int WageperMonth = fullday * 20 * SalHour;
			System.out.println("WageperMonth is " + WageperMonth);
		} else {
			System.out.println("Employee is absent");
		}
	}

	public static void main(String[] args) {
		int max = 1;
		int min = 0;
		int flag = 0;
		// int SalHour = 20, fullday = 8;
		int partTime = 8;
		//EmployeeWage employeeWage = new EmployeeWage(20, 8);
		int a = (int) (Math.random() * (max - min + 1) + min);
		System.out.println("Random no is " + a);
		if (a == 1) {
			flag = 1;
		}
		if (flag == 1) {
			System.out.println("Employee Present");
		}
		if (flag == 0) {
			System.out.println("Employee Absent");
		}

		if (flag == 1) {
			int DailyWage = fullday * SalHour;
			System.out.println("DailyWage is " + DailyWage);
		}

		int mn = 0, mx = 1;
		int choice = (int) (Math.random() * (mx - mn + 1) + mn);
		switch (choice) {
		case 0:
			int fullTime = 8;
			System.out.println("Fulltime wage is " + fullTime * SalHour);
			break;
		case 1:
			int HalfTime = 4;
			System.out.println("Halftime wage is " + HalfTime * SalHour);
			break;

		default:
			break;
		}
		// UC5
		if (flag == 1) {
			int WageperMonth = fullday * 20 * SalHour;
			System.out.println("WageperMonth is " + WageperMonth);
		}
		//employeeWage.employeeWage(flag);

		EmployeeWage morningstar = new EmployeeWage("morningStar", 30, 5, 45);
		morningstar.companyWage();
		EmployeeWage tiaa = new EmployeeWage("Tiaa", 50, 5, 45);
		tiaa.companyWage();
		System.out.println(morningstar);
		System.out.println(tiaa);

	}

}
