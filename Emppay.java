//Challenge 1:
// You are building a payroll system for a company that has two types of employees: salaried employees and hourly employees. The payroll system needs to calculate the monthly salary for each employee based on their specific type and hours worked. Additionally, the system should demonstrate polymorphism by calculating the monthly salary for different types of employees.

import java.util.*;

import com.sun.tools.javac.Main;

class Employee
  {
    Scanner sc=new Scanner(System.in);
    int empID;
    String name;
    double salary;
    Employee()
    {
      this.empID=empID;
      this.name=name;
      this.salary=salary;
    }
    public void calculateSalary()
    {
      System.out.println("Employee pay details are as follows");
    }
  }
class SalariedEmployee extends Employee
  {
    public void calculateSalary()
    {
      System.out.println("Employee ID: "+empID);
      System.out.println("Employee name: "+name);
      System.out.println("The monthly salary is "+salary);
    }
  }
class HourlyEmployee extends Employee
  {
    public void calculateSalary()
    {
      System.out.println("Enter the hourly rate for the employee");
      double hourlyrate=sc.nextDouble();
      System.out.println("Enter the total number of hours worked for the whole month");
      double hours=sc.nextDouble();
      salary=hourlyrate*hours;
      System.out.println("Employee ID: "+empID);
      System.out.println("Employee name: "+name);
      System.out.println("The monthly salary is "+salary);      
    }
  }

class Emppay
  {
    public static void main(String ar[])
    {
      Scanner sc=new Scanner(System.in);
      SalariedEmployee sa=new SalariedEmployee();
      HourlyEmployee he=new HourlyEmployee();
      System.out.println("Enter the salaried employee details ");
      System.out.print("Employee ID: ");
      sa.empID=sc.nextInt();
      System.out.print("Employee name: ");
      sa.name=sc.next();
      sc.nextLine();
      System.out.print("Salary: ");
      sa.salary=sc.nextDouble();
      sa.calculateSalary();
      System.out.println("Enter the hourly employee details");
      System.out.print("Employee ID: ");
      he.empID=sc.nextInt();
      System.out.print("Employee name: ");
      he.name=sc.next();
      sc.nextLine();
      he.calculateSalary();
    }
  }