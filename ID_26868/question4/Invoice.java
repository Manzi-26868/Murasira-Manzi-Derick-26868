package ID_26868.question4;

public class Invoice extends Entity {
    private String invoiceNo;
    private double invoiceAmount;

    public Invoice(int id, String createdDate, String updatedDate, String invoiceNo, double invoiceAmount) {
        super(id, createdDate, updatedDate);
        setInvoiceNo(invoiceNo);
        setInvoiceAmount(invoiceAmount);
    }

    // Getters and setters
    public String getInvoiceNo() { return invoiceNo; }
    public double getInvoiceAmount() { return invoiceAmount; }

    public void setInvoiceNo(String invoiceNo) {
        if (invoiceNo == null || invoiceNo.trim().isEmpty()) throw new IllegalArgumentException("Invoice number cannot be empty");
        this.invoiceNo = invoiceNo;
    }

    public void setInvoiceAmount(double invoiceAmount) {
        if (invoiceAmount <= 0) throw new IllegalArgumentException("Invoice amount must be greater than 0");
        this.invoiceAmount = invoiceAmount;
    }
}