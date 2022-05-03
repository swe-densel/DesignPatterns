package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDirectory implements Employee{
    private List<Employee> employeeList = new ArrayList<>();

    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }

    public void removeEmployee(Employee employee){
        employeeList.remove(employee);
    }

    @Override
    public void printEmployee() {
        for (Employee employee : employeeList){
            employee.printEmployee();
        }
    }
}
