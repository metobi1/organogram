package organigram;

import java.util.ArrayList;
import java.util.List;

public class Organization {

    private List<Branch> branches =
            new ArrayList<>();
    private String name;

    public Organization(String name) {
        this.name = name;
    }

    public void addBranch(Branch branch) {
        this.branches.add(branch);
    }

    public List<Branch> getBranches() {
        return branches;
    }
}
