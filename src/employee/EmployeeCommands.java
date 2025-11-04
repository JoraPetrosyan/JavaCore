package employee;

public interface EmployeeCommands {

    String EXIT = "0";
    String ADD_EMPLOYEE = "1";
    String PRINT_All_EMPLOYEE = "2";
    String SEARCH_EMPLOYEE_BY_EMPLOYEE_ID = "3";
    String SEARCH_EMPLOYEE_BY_COMPANY_NAME = "4";
    String SEARCH_EMPLOYEES_BY_POSITION_LEVEL = "6";

    static void printAuthorAndBookCommands() {
        System.out.println("Pleas input " + EXIT + " for EXIT");
        System.out.println("Pleas input " + ADD_EMPLOYEE + " for ADD_EMPLOYEE");
        System.out.println("Pleas input " + PRINT_All_EMPLOYEE + " for PRINT_All_EMPLOYEE");
        System.out.println("Pleas input " + SEARCH_EMPLOYEE_BY_EMPLOYEE_ID + " for SEARCH_EMPLOYEE_BY_EMPLOYEE_ID");
        System.out.println("Pleas input " + SEARCH_EMPLOYEE_BY_COMPANY_NAME + " for SEARCH_EMPLOYEE_BY_COMPANY_NAME");
        System.out.println("Pleas input " + SEARCH_EMPLOYEES_BY_POSITION_LEVEL + " for SEARCH_EMPLOYEES_BY_POSITION_LEVEL");

    }
}
