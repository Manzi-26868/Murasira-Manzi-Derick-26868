package ID_26868.question1;

public final class StockReport extends Entity {
    private String reportDate;
    private String remarks;

    public StockReport(int id, String createdDate, String updatedDate,
                       String reportDate, String remarks, String wPhone, String catName, String catCode, String sName, String sEmail, String sPhone, String pName, double unitPrice, int stockLimit, int qtyAvailable, int reorderLevel, String purchaseDate, int purchasedQty, String purchaseSupplier, String saleDate, int soldQty, String customerName, int totalItems, double stockValue, String date, String s) {

        super(id, createdDate, updatedDate);

        if (reportDate == null || reportDate.isEmpty()) {
            throw new IllegalArgumentException("Report date cannot be empty.");
        }
        if (remarks == null || remarks.isEmpty()) {
            throw new IllegalArgumentException("Remarks cannot be empty.");
        }

        this.reportDate = reportDate;
        this.remarks = remarks;
    }

    public String getReportDate() {
        return reportDate;
    }
    public String getRemarks() {
        return remarks;
    }
    public void setReportDate(String reportDate) {
        if (reportDate == null || reportDate.isEmpty())
            throw new IllegalArgumentException("Report date must not be null");
        this.reportDate = reportDate;
    }
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public void generateReport() {
        System.out.println("----- STOCK REPORT -----");
        System.out.println("Report Date: " + reportDate);
        System.out.println("Remarks: " + remarks);
    }
}
