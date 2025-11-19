package ID_26868.question6;

public class Payroll extends Entity {
    private double grossSalary;
    private double totalDeductions;
    private double netSalary;

    public Payroll(int id, String createdDate, String updatedDate, double grossSalary, double totalDeductions, double netSalary) {
        super(id, createdDate, updatedDate);
        setGrossSalary(grossSalary);
        setTotalDeductions(totalDeductions);
        setNetSalary(netSalary);
    }

    public double getGrossSalary() { return grossSalary; }
    public double getTotalDeductions() { return totalDeductions; }
    public double getNetSalary() { return netSalary; }

    public void setGrossSalary(double grossSalary) {
        if (grossSalary < 0) throw new IllegalArgumentException("Gross salary cannot be negative");
        this.grossSalary = grossSalary;
    }

    public void setTotalDeductions(double totalDeductions) {
        if (totalDeductions < 0) throw new IllegalArgumentException("Total deductions cannot be negative");
        this.totalDeductions = totalDeductions;
    }

    public void setNetSalary(double netSalary) {
        if (netSalary < 0) throw new IllegalArgumentException("Net salary cannot be negative");
        this.netSalary = netSalary;
    }

    public void calculateNetSalary(double basicPay, double totalAllowances, double totalDeductions) {
        this.grossSalary = basicPay + totalAllowances;
        this.totalDeductions = totalDeductions;
        this.netSalary = this.grossSalary - this.totalDeductions;
    }
}