package ID_26868.question6;

public class Department extends Entity {
    private String deptName;
    private String deptCode;
    private String managerName;

    public Department(int id, String createdDate, String updatedDate, String deptName, String deptCode, String managerName) {
        super(id, createdDate, updatedDate);
        setDeptName(deptName);
        setDeptCode(deptCode);
        setManagerName(managerName);
    }

    public String getDeptName() { return deptName; }
    public String getDeptCode() { return deptCode; }
    public String getManagerName() { return managerName; }

    public void setDeptName(String deptName) {
        if (deptName == null || deptName.trim().isEmpty()) throw new IllegalArgumentException("Department name cannot be empty");
        this.deptName = deptName;
    }

    public void setDeptCode(String deptCode) {
        if (deptCode == null || deptCode.length() < 3) throw new IllegalArgumentException("Department code must be at least 3 characters");
        this.deptCode = deptCode;
    }

    public void setManagerName(String managerName) {
        if (managerName == null || managerName.trim().isEmpty()) throw new IllegalArgumentException("Manager name cannot be empty");
        this.managerName = managerName;
    }
}