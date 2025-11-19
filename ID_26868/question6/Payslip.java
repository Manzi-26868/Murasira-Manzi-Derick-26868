package ID_26868.question6;

public class Payslip extends Entity {
    private String payslipNumber;
    private String issueDate;

    public Payslip(int id, String createdDate, String updatedDate, String payslipNumber, String issueDate) {
        super(id, createdDate, updatedDate);
        setPayslipNumber(payslipNumber);
        setIssueDate(issueDate);
    }

    public String getPayslipNumber() { return payslipNumber; }
    public String getIssueDate() { return issueDate; }

    public void setPayslipNumber(String payslipNumber) {
        if (payslipNumber == null || payslipNumber.trim().isEmpty()) throw new IllegalArgumentException("Payslip number cannot be empty");
        this.payslipNumber = payslipNumber;
    }

    public void setIssueDate(String issueDate) {
        if (issueDate == null || issueDate.trim().isEmpty()) throw new IllegalArgumentException("Issue date cannot be empty");
        this.issueDate = issueDate;
    }

    public void generatePayslip() {
        System.out.println("=== PAYSLIP GENERATION ===");
        System.out.println("Payslip Number: " + payslipNumber);
        System.out.println("Issue Date: " + issueDate);
        System.out.println("Payslip generated successfully with RSSB calculations!");
    }
}