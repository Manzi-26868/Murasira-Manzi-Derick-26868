package ID_26868.question5;

public class Department extends Entity {
    private String departmentName;
    private String departmentHead;

    public Department(int id, String createdDate, String updatedDate, String departmentName, String departmentHead) {
        super(id, createdDate, updatedDate);
        setDepartmentName(departmentName);
        setDepartmentHead(departmentHead);
    }

    // Getters and setters
    public String getDepartmentName() { return departmentName; }
    public String getDepartmentHead() { return departmentHead; }

    public void setDepartmentName(String departmentName) {
        if (departmentName == null || departmentName.trim().isEmpty()) throw new IllegalArgumentException("Department name cannot be empty");
        this.departmentName = departmentName;
    }

    public void setDepartmentHead(String departmentHead) {
        if (departmentHead == null || departmentHead.trim().isEmpty()) throw new IllegalArgumentException("Department head cannot be empty");
        this.departmentHead = departmentHead;
    }
}