package ID_26868.question1;

public class Product extends Entity {
    private String productName;
    private double unitPrice;
    private int stockLimit;

    public Product(int id, String createdDate, String updatedDate,
                   String productName, String wLoc, String wPhone, String catName, String catCode, String sName, String sEmail, String sPhone, String pName, double unitPrice, int stockLimit) {

        super(id, createdDate, updatedDate);

        if (productName == null || productName.isEmpty()) {
            System.out.println("Product name cannot be empty.");
        }
        if (unitPrice <= 0) {
            System.out.println("Unit price must be greater than 0.");
        }
        if (stockLimit < 0) {
            System.out.println("Stock limit cannot be negative.");
        }

        this.productName = productName;
        this.unitPrice = unitPrice;
        this.stockLimit = stockLimit;
    }

    public String getProductName() {
        return productName;
    }
    public double getUnitPrice() {
        return unitPrice;
    }
    public int getStockLimit() {
        return stockLimit;
    }
    public void setProductName(String productName) {
        if (productName == null || productName.isEmpty())
            System.out.println("Product name must not be null");
        this.productName = productName;
    }
    public void setUnitPrice(double unitPrice) {
        if (unitPrice <= 0)
            System.out.println("Unit price must be > 0");
        this.unitPrice = unitPrice;
    }
    public void setStockLimit(int stockLimit) {
        if (stockLimit < 0)
            System.out.println("Stock limit must be >= 0");
        this.stockLimit = stockLimit;
    }
}

