package homework.library.storage;

import employee.Employee;

public class EmployeeStorage {
    private Employee[] employees = new Employee[10];
    private int size = 0;

    public void addEmployee(Employee employee) {
        if (size == employees.length) {
            extend();
        }
        employees[size++] = employee;
    }

    private void extend() {
        Employee[] tmp = new Employee[size + 10];
        System.arraycopy(employees, 0, tmp, 0, size);
        employees = tmp;
    }

    public void printEmployee() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }

    public Employee searchEmployeeByEmployeeId(String employeeId) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeID().equals(employeeId)) {
                return employees[i];
            }
        }
        return null;
    }

    public Employee searchEmployeeByCompanyName(String company) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getCompany().equals(company)) {
                return employees[i];
            }
        }
        return null;
    }
}
