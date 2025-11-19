package ID_26868.question4;

public class Product extends Entity {
    private String productName;
    private double unitPrice;
    private int quantity;

    public Product(int id, String createdDate, String updatedDate, String productName, double unitPrice, int quantity) {
        super(id, createdDate, updatedDate);
        setProductName(productName);
        setUnitPrice(unitPrice);
        setQuantity(quantity);
    }

    // Getters and setters
    public String getProductName() { return productName; }
    public double getUnitPrice() { return unitPrice; }
    public int getQuantity() { return quantity; }

    public void setProductName(String productName) {
        if (productName == null || productName.trim().isEmpty()) throw new IllegalArgumentException("Product name cannot be empty");
        this.productName = productName;
    }

    public void setUnitPrice(double unitPrice) {
        if (unitPrice <= 0) throw new IllegalArgumentException("Unit price must be greater than 0");
        this.unitPrice = unitPrice;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) throw new IllegalArgumentException("Quantity cannot be negative");
        this.quantity = quantity;
    }
}