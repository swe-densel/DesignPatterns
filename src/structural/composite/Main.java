package structural.composite;

public class Main {
    public static void main(String[] args) {
        Developer developer1 = new Developer();
        Developer developer2 = new Developer();
        Supervisor supervisor = new Supervisor();
        Manager manager = new Manager();

        EmployeeDirectory employeeDirectory = new EmployeeDirectory();
        employeeDirectory.addEmployee(developer1);
        employeeDirectory.addEmployee(developer2);

        EmployeeDirectory supervisorDirectory = new EmployeeDirectory();
        employeeDirectory.addEmployee(supervisor);

        EmployeeDirectory managerDirectory = new EmployeeDirectory();
        managerDirectory.addEmployee(manager);

        EmployeeDirectory companyDirectory = new EmployeeDirectory();
        companyDirectory.addEmployee(employeeDirectory);
        companyDirectory.addEmployee(supervisorDirectory);
        companyDirectory.addEmployee(managerDirectory);
        companyDirectory.printEmployee();

    }
}
