package employee.demo;

import employee.EmployeeCommands;
import employee.PositionLevel;
import employee.model.Employee;
import employee.storage.EmployeeStorage;

import java.util.Scanner;

public class EmployeeDemo implements EmployeeCommands {
    private static Scanner scanner = new Scanner(System.in);
    private static EmployeeStorage employeeStorage = new EmployeeStorage();

    public static void main(String[] args) {
        boolean isRun = true;
        while (isRun) {
            EmployeeCommands.printAuthorAndBookCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_EMPLOYEE:
                    addEmployee();
                    break;
                case PRINT_All_EMPLOYEE:
                    employeeStorage.printEmployee();
                case SEARCH_EMPLOYEE_BY_EMPLOYEE_ID:
                    System.out.println("Please input employeeId");
                    String employeeId = scanner.nextLine();
                    Employee employee = employeeStorage.searchEmployeeByEmployeeId(employeeId);
                    System.out.println(employee);
                case SEARCH_EMPLOYEE_BY_COMPANY_NAME:
                    System.out.println("Please input company");
                    String company = scanner.nextLine();
                    Employee companyName = employeeStorage.searchEmployeeByCompanyName(company);
                    System.out.println(companyName);
                case SEARCH_EMPLOYEES_BY_POSITION_LEVEL:
                    System.out.println("Pleas input employee position from this list: JUNIOR,MIDDLE,SENIOR,LEAD");
                    PositionLevel position = PositionLevel.valueOf(scanner.nextLine().toUpperCase());
                    Employee positionLevel = employeeStorage.searchEmployeeByPositionLevel(position);
                    System.out.println(positionLevel);
            }
        }
    }

    private static void addEmployee() {
        try {
            System.out.println("Pleas input employee's name");
            String name = scanner.nextLine();
            System.out.println("Pleas input employee's surname");
            String surname = scanner.nextLine();
            System.out.println("Pleas input employee's employeeID");
            String employeeID = scanner.nextLine();
            System.out.println("Pleas input employee's salary");
            int salary = Integer.parseInt(scanner.nextLine());
            System.out.println("Pleas input employee's company");
            String company = scanner.nextLine();
            System.out.println("Pleas input employee's position from this list: JUNIOR,MIDDLE,SENIOR,LEAD");
            PositionLevel position = PositionLevel.valueOf(scanner.nextLine().toUpperCase());
            Employee employee = new Employee(name, surname, employeeID, salary, company, position);
            employeeStorage.addEmployee(employee);
            System.out.println("Employee added successfully");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
