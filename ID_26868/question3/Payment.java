package ID_26868.question3;

public class Payment extends Entity {
    private String paymentDate;
    private double paymentAmount;

    public Payment(int id, String createdDate, String updatedDate, String paymentDate, double paymentAmount) {
        super(id, createdDate, updatedDate);
        if (paymentAmount <= 0) throw new IllegalArgumentException("Payment amount must be greater than 0");

        this.paymentDate = paymentDate;
        this.paymentAmount = paymentAmount;
    }

    public String getPaymentDate() { return paymentDate; }
    public double getPaymentAmount() { return paymentAmount; }
}
