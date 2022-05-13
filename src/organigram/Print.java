package organigram;

import java.util.List;

public class Print {

    static void printCreateOrgMssg() {
        System.out.println("Enter the name of the Organization below");
    }

    static void printCreateBranchMssg() {

        System.out.println("To create a branch enter the name of the branch below");
    }

    static void printBranchLocMssg() {
        System.out.println("Enter the location of the branch");
    }

    static void printCreateDeptMssg() {
        System.out.println("Enter the name of the Department");
    }

    static void printEmpFirstNameMssg() {
        System.out.println("Enter the firstname of the Employee");
    }

    static void printEmpSecNameMssg() {
        System.out.println("Enter the lastname of the Employee");
    }

    static void printEmpPhoneMssg() {
        System.out.println("Enter the phone Number of the Employee");
    }

    static void printEmpEmailMssg() {
        System.out.println("Enter the email of the Employee");
    }

    /*static void printAddDeptOption() {
        System.out.println("To add the newly created department, choose one of the branches displayed");
    }*/

    static void printChoice(String deptOrBranch, String choice) {
        System.out.printf("To chose the %s with the name, %s enter 0 for yes, " +
                "and 1 for no%n", deptOrBranch, choice);
    }

    static void printBranches(List<Branch> branches) {
        System.out.println(branches);
    }
    static void printDepartments(List<Department> departments) {
        System.out.println(departments);
    }

    static void printEmployees(List<Employee> employees) {
        System.out.println(employees);
    }

    static void printCreationScreen() {
        System.out.println("\nThis is the creation screen");
        System.out.println("Enter 0 to create a branch");
        System.out.println("Enter 1 to create a department and add it to " +
                "one of the branches in the organisation");
        System.out.println("Enter 2 to create an employee");
    }

    static void printViewScreen() {
        System.out.println("\nThis is the View screen");
        System.out.println("Enter 0 to view all branches in the organisation");
        System.out.println("Enter 1 to view all the departments in a branch");
        System.out.println("Enter 2 to view all the employees in a department");
    }

    static void printNavigationScreen() {
        System.out.println("\nThis is the Navigation screen");
        System.out.println("Enter 0 for view actions");
        System.out.println("Enter 1 for creation actions");
        System.out.println("Enter 2 to exit the Organigram");
    }

    static void printNoChoiceMade() {
        System.out.println("No choice / wrong choice made, exiting");
    }
}
