package ID_26868.question3;

public class TaxRecord extends Entity {
    private String receiptNo;
    private double totalTax;

    public TaxRecord(int id, String createdDate, String updatedDate, String receiptNo, double totalTax) {
        super(id, createdDate, updatedDate);
        setReceiptNo(receiptNo);
        setTotalTax(totalTax);
    }

    public double computeTax(double salary, double rate, double credits) {
        return (salary * rate) - credits;
    }

    public String getReceiptNo() { return receiptNo; }
    public double getTotalTax() { return totalTax; }

    public void setReceiptNo(String receiptNo) {
        if (receiptNo == null || receiptNo.trim().isEmpty()) {
            throw new IllegalArgumentException("Receipt number cannot be empty");
        }
        this.receiptNo = receiptNo;
    }

    public void setTotalTax(double totalTax) {
        if (totalTax < 0)
            throw new IllegalArgumentException("Total tax cannot be negative");
        this.totalTax = totalTax;
    }

    public void displayTaxCalculation(double salary, double rate, double credits) {
        double tax = computeTax(salary, rate, credits);
        System.out.println("=== TAX CALCULATION ===");
        System.out.println("Salary: " + salary);
        System.out.println("Tax Rate: " + rate);
        System.out.println("Credits: " + credits);
        System.out.println("Calculated Tax: " + tax);
        System.out.println("Receipt No: " + receiptNo);
        System.out.println("Total Tax: " + totalTax);
    }
}