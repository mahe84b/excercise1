package com.training_session_lambdas;

/*
Example : -	You have a list of Employees, say 20. Where an employee is defined as:
class Employee {
       private String name;
       private int salary;
       private int yearsOfExperience;
}

-	Use a lambda expression to calculate bonus for every employee, give a 10% to each employee (using Function interface).
-	Select all employees who get a bonus greater than a given value (final filter) by using a Predicate interface.
-	Consume the result using the Consumer functional interface.

*/

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Function;


public class Main {

    private static Object Employee;

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList();

        employeeList.add(new Employee("Rajesh", 5000, 1));
        employeeList.add(new Employee("Mahesh", 10000, 2));
        employeeList.add(new Employee("Suresh", 15000, 4));
        employeeList.add(new Employee("Kamlesh", 20000, 5));
        employeeList.add(new Employee("Naresh", 30000, 6));


        Predicate<Employee> employeePredicate = emp -> (emp.getSalary() > 10000 && emp.getExperience() > 1);

        Float percentage = 0.10f;

        Function <Float, Float> salaryBonus = salary -> (salary * percentage) ;

        System.out.println("Use a lambda expression to calculate bonus for every employee, give a 10% to each employee (using Function interface)");

        for(Employee employee:employeeList) {
            if(employeePredicate.test(employee)) {
                System.out.println("Salary Hiked for employee : " + employee.getName());
                employee.setBonus(salaryBonus.apply(employee.getSalary()));
                System.out.println("New Salary for employee after Bonus : " + employee.getBonus());
            }
            else {
                System.out.println("Salary isn't Hiked for employee : " + employee.getName());
            }
        }


        System.out.println("Select all employees who get a bonus greater than a given value (final filter) by using a Predicate interface.)");

        Predicate<Employee> employeeBonusPredicate = emp -> (emp.getBonus() > 2000);

        for(Employee employee:employeeList) {
            if(employeeBonusPredicate.test(employee)) {
                System.out.println("Salary Hiked for employee : " + employee.getName());
                System.out.println("Bonus : " + employee.getBonus());
            }
        }

        Consumer<String> printEmployee = printString -> System.out.println(printString);

        System.out.println("Consume the result using the Consumer functional interface.");

        for(Employee employee:employeeList) {
            if(employeeBonusPredicate.test(employee)) {
                printEmployee.accept("Salary Hiked for employee : " + employee.getName());
                printEmployee.accept("Bonus : " + employee.getBonus());
            }
        }
    }
}
