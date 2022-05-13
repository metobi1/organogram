package organigram;

import java.util.Scanner;

import static organigram.Print.*;

public class Organigram {

    private static final Scanner scanner =
            new Scanner(System.in);
    private static Organization organization;
    private static boolean exit = false;

    static void runOrganigram() {

        setupOrganisation();

        while (!exit) {
            navigateOrganigram();
        }
    }

    static void setupOrganisation() {

        organization = createOrganisation();
        Branch branch = createBranch();
        organization.addBranch(branch);

        Department department = createDept();
        branch.addDepartment(department);

        Employee employee = createEmployee();
        Employee employee2 = createEmployee();

        department.addEmployee(employee);
        department.addEmployee(employee2);

        branch.setBranchHead(employee);
        department.setDeptHead(employee2);
    }

    static void viewActions() {

        printViewScreen();
        String chooseAction = scanner.nextLine();

        switch (chooseAction) {
            case "0":
                printBranches(organization.getBranches());
                break;
            case "1":
                Branch branch = getBranch();
                if (branch != null) {
                    printDepartments(branch.getDepartments());
                }
                break;
            case "2":
                Branch branch1 = getBranch();
                if (branch1 != null) {
                    Department department = getDept(branch1);
                    if (department != null) {
                        printEmployees(department.getEmployees());
                    }
                }
                break;
            default:
                printNoChoiceMade();
                break;
        }
    }

    static void createActions() {

        printCreationScreen();
        String chooseAction = scanner.nextLine();

        switch (chooseAction) {
            case "0":
                Branch branch = createBranch();
                organization.addBranch(branch);
                break;
            case "1":
                Department department = createDept();
                Branch branch1 = getBranch();
                if (branch1 != null) {
                    branch1.addDepartment(department);
                }
                break;
            case "2":
                Employee employee = createEmployee();
                Branch branch2 = getBranch();
                Department department1;
                if (branch2 != null) {
                    department1 = getDept(branch2);
                    if (department1 != null) {
                        department1.addEmployee(employee);
                    }
                }
                break;
            default:
                printNoChoiceMade();
                break;
        }
    }

    static void navigateOrganigram() {
        printNavigationScreen();
        String chooseAction = scanner.nextLine();

        switch (chooseAction) {
            case "0":
                viewActions();
                break;
            case "1":
                createActions();
                break;
            case "2":
                exit = true;
        }
    }

    static Department getDept(Branch branch) {

        for (int i = 0; i < branch.getDepartments().size(); i++) {

            Department department = branch.getDepartments().get(i);
            String deptName =  department.getName();
            printChoice("Department", deptName);
            String choice = scanner.nextLine();

            if ("0".equals(choice)) {
                return department;
            }
        }
        return null;
    }

    static Branch getBranch() {

        for (int i = 0; i < organization.getBranches().size(); i++) {

            Branch branch = organization.getBranches().get(i);
            String branchName =  branch.getName();
            printChoice( "Branch", branchName);
            String choice = scanner.nextLine();

            if ("0".equals(choice)) {
                return branch;
            }
        }
        return null;
    }

    static Organization createOrganisation() {
        printCreateOrgMssg();
        return new Organization(scanner.nextLine());
    }

    static Branch createBranch() {
        printCreateBranchMssg();
        String name = scanner.nextLine();

        printBranchLocMssg();
        String location = scanner.nextLine();
       return new Branch(name, location);
    }

    static Department createDept() {
        printCreateDeptMssg();
        String name = scanner.nextLine();
        return new Department(name);
    }


    static Employee createEmployee() {
        printEmpFirstNameMssg();
        String firstName = scanner.nextLine();
        printEmpSecNameMssg();
        String lastName = scanner.nextLine();
        printEmpPhoneMssg();
        String phoneNumber = scanner.nextLine();
        printEmpEmailMssg();
        String email = scanner.nextLine();

        return new Employee(firstName, lastName, phoneNumber, email);
    }
}
