package lab_09_01;

import java.util.List;

public class EmployeeController {

    public int calculateTotalSalary(List<Employee> employeeList){
        int totalSalary = 0;
        for (Employee employee : employeeList) {
            totalSalary += employee.getSalary();
        }
        return totalSalary;
    }

}
