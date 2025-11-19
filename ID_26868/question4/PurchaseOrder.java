package ID_26868.question4;

public class PurchaseOrder extends Entity {
    private String poNumber;
    private String orderDate;
    private double totalAmount;

    public PurchaseOrder(int id, String createdDate, String updatedDate, String poNumber, String orderDate, double totalAmount) {
        super(id, createdDate, updatedDate);
        setPoNumber(poNumber);
        setOrderDate(orderDate);
        setTotalAmount(totalAmount);
    }

    // Getters and setters
    public String getPoNumber() { return poNumber; }
    public String getOrderDate() { return orderDate; }
    public double getTotalAmount() { return totalAmount; }

    public void setPoNumber(String poNumber) {
        if (poNumber == null || poNumber.trim().isEmpty()) throw new IllegalArgumentException("PO number cannot be empty");
        this.poNumber = poNumber;
    }

    public void setOrderDate(String orderDate) {
        if (orderDate == null || orderDate.trim().isEmpty()) throw new IllegalArgumentException("Order date cannot be empty");
        this.orderDate = orderDate;
    }

    public void setTotalAmount(double totalAmount) {
        if (totalAmount <= 0) throw new IllegalArgumentException("Total amount must be greater than 0");
        this.totalAmount = totalAmount;
    }
}