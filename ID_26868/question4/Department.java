package ID_26868.question4;

public class Department extends Entity {
    private String deptName;
    private String deptCode;

    public Department(int id, String createdDate, String updatedDate, String deptName, String deptCode) {
        super(id, createdDate, updatedDate);
        setDeptName(deptName);
        setDeptCode(deptCode);
    }

    // Getters and setters
    public String getDeptName() { return deptName; }
    public String getDeptCode() { return deptCode; }

    public void setDeptName(String deptName) {
        if (deptName == null || deptName.trim().isEmpty()) throw new IllegalArgumentException("Department name cannot be empty");
        this.deptName = deptName;
    }

    public void setDeptCode(String deptCode) {
        if (deptCode == null || deptCode.length() < 3 || !deptCode.matches("[a-zA-Z0-9]+"))
            throw new IllegalArgumentException("Department code must be alphanumeric and at least 3 characters");
        this.deptCode = deptCode;
    }
}