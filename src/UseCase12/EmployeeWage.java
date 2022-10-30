package UseCase12;

import UseCase10.EmpWageBuilder;

public class EmployeeWage {
    public EmployeeWage()
    {

        System.out.println("Welcome to Employee Wage Computation Program....**");
    }

    public static void main(String[] args) {

        //Initializing the constructor by creating the object of the class.
        UseCase12.EmployeeWage employee = new UseCase12.EmployeeWage();

        //Calculating employee wage for different companies.
        System.out.println("Calculate the salary for different company : ............");
        EmpWageBuilder empWageBuilder = new EmpWageBuilder();
        empWageBuilder.addCompanyEmployeeWage("dMart", 28, 2, 10);
        empWageBuilder.addCompanyEmployeeWage("Relience", 10, 4, 20);
        empWageBuilder.computeEmpWage();
    }}

