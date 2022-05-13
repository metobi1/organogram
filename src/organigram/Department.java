package organigram;

import java.util.ArrayList;
import java.util.List;

public class Department {

    private List<Employee> employees =
            new ArrayList<>();
    private Employee deptHead;
    private String name;

    public Department(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }
    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }

    public Employee getDeptHead() {
        return deptHead;
    }

    public void setDeptHead(Employee deptHead) {
        this.deptHead = deptHead;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Department{" +
                "deptHead=" + deptHead +
                ", name='" + name + '\'' +
                '}';
    }
}
