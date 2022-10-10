package lab_09_01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeTest {

    final static int EMPLOYEE_SALARY = 50000;
    final static int CONTRACTOR_SALARY = 40000;

    public static void main(String[] args) {

        Employee firstEmployee = new Employee();
        firstEmployee.setName("Employee One");
        firstEmployee.setSalary(EMPLOYEE_SALARY);
        Employee secondEmployee = new Employee();
        secondEmployee.setSalary(EMPLOYEE_SALARY);
        secondEmployee.setName("Employee Two");
        Contractor contractor = new Contractor();
        contractor.setName("Contractor One");
        contractor.setSalary(CONTRACTOR_SALARY);

        List<Employee> employeeList = new ArrayList<>();
        employeeList = Arrays.asList(firstEmployee, secondEmployee, contractor );

        System.out.println(Arrays.asList(employeeList));
        System.out.println("Total salary: " +  new EmployeeController().calculateTotalSalary(employeeList));
    }
}
