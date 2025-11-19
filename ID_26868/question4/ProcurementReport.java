package ID_26868.question4;

public class ProcurementReport extends Entity {
    private String reportDate;
    private String summary;

    public ProcurementReport(int id, String createdDate, String updatedDate, String reportDate, String summary) {
        super(id, createdDate, updatedDate);
        setReportDate(reportDate);
        setSummary(summary);
    }

    // Getters and setters
    public String getReportDate() { return reportDate; }
    public String getSummary() { return summary; }

    public void setReportDate(String reportDate) {
        if (reportDate == null || reportDate.trim().isEmpty()) throw new IllegalArgumentException("Report date cannot be empty");
        this.reportDate = reportDate;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public double calculateTotal(double[] invoiceAmounts) {
        double total = 0;
        for (double amount : invoiceAmounts) {
            total += amount;
        }
        return total;
    }

    public void generateReport() {
        System.out.println("=== PROCUREMENT REPORT ===");
        System.out.println("Report Date: " + reportDate);
        System.out.println("Summary: " + summary);
        System.out.println("Report generated successfully!");
    }
}