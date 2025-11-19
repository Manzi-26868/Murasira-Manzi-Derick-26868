package ID_26868.question3;

public class Employee extends Entity {
    private String employeeName;
    private double salary;
    private String employerTIN;

    public Employee(int id, String createdDate, String updatedDate, String employeeName, double salary, String employerTIN) {
        super(id, createdDate, updatedDate);
        setEmployeeName(employeeName);
        setSalary(salary);
        setEmployerTIN(employerTIN);
    }

    public String getEmployeeName() { return employeeName; }
    public double getSalary() { return salary; }
    public String getEmployerTIN() { return employerTIN; }

    public void setEmployeeName(String employeeName) {
        if (employeeName == null || employeeName.trim().isEmpty()) {
            throw new IllegalArgumentException("Employee name cannot be empty");
        }
        this.employeeName = employeeName;
    }

    public void setSalary(double salary) {
        if (salary <= 0) throw new IllegalArgumentException("Salary must be greater than 0");
        this.salary = salary;
    }

    public void setEmployerTIN(String employerTIN) {
        if (employerTIN == null || !employerTIN.matches("\\d{9}")) throw new IllegalArgumentException("Employer TIN must be 9 digits");
        this.employerTIN = employerTIN;
    }
}