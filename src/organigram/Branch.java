package organigram;

import java.util.ArrayList;
import java.util.List;

public class Branch {

    private Employee branchHead;
    private String name;
    private List<Department> departments =
            new ArrayList<>();
    private String location;

    public Branch( String name, String location) {
        this.name = name;
        this.location = location;
    }

    public Employee getBranchHead() {
        return branchHead;
    }

    public void setBranchHead(Employee branchHead) {
        this.branchHead = branchHead;
    }

    public void addContactPerson(Employee contactPerson) {
        this.branchHead = contactPerson;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void addDepartment(Department department) {
        this.departments.add(department);
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Branch{" +
                "branchHead=" + branchHead +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
