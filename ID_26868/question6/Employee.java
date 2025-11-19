package ID_26868.question6;

public class Employee extends Entity {
    private int employeeID;
    private String fullName;
    private String position;
    private double baseSalary;
    private boolean rssbRegistered;

    public Employee(int id, String createdDate, String updatedDate, int employeeID, String fullName, String position, double baseSalary, boolean rssbRegistered) {
        super(id, createdDate, updatedDate);
        setEmployeeID(employeeID);
        setFullName(fullName);
        setPosition(position);
        setBaseSalary(baseSalary);
        setRssbRegistered(rssbRegistered);
    }

    public int getEmployeeID() { return employeeID; }
    public String getFullName() { return fullName; }
    public String getPosition() { return position; }
    public double getBaseSalary() { return baseSalary; }
    public boolean isRssbRegistered() { return rssbRegistered; }

    public void setEmployeeID(int employeeID) {
        if (employeeID < 1000) throw new IllegalArgumentException("Employee ID must be at least 1000");
        this.employeeID = employeeID;
    }

    public void setFullName(String fullName) {
        if (fullName == null || fullName.trim().isEmpty()) throw new IllegalArgumentException("Full name cannot be empty");
        this.fullName = fullName;
    }

    public void setPosition(String position) {
        if (position == null || position.trim().isEmpty()) throw new IllegalArgumentException("Position cannot be empty");
        this.position = position;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary <= 0) throw new IllegalArgumentException("Base salary must be greater than 0");
        this.baseSalary = baseSalary;
    }

    public void setRssbRegistered(boolean rssbRegistered) {
        this.rssbRegistered = rssbRegistered;
    }
}