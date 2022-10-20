package lab_09_01;

import java.util.Arrays;
import java.util.List;

public class EmployeeTest {



    public static void main(String[] args) {

        Employee firstEmployee = new FullTimeEmployee();
        Employee secondEmployee = new FullTimeEmployee();
        Employee firstCpntractor = new Contractor();
        List<Employee> employeeList = Arrays.asList(firstEmployee,secondEmployee, firstCpntractor );

        int totalSalary = EmployeeController.calculateTotalSalary(employeeList);
        System.out.println(totalSalary);


    }
}
