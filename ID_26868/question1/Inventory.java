package ID_26868.question1;

public class Inventory extends Entity {
    private int totalItems;
    private double stockValue;

    public Inventory(int id, String createdDate, String updatedDate,
                     String wName, String wLoc, String wPhone, String catName, String catCode, String sName, String sEmail, String sPhone, String pName, double unitPrice, int totalItems, double stockValue, int reorderLevel, String purchaseDate, int purchasedQty, String purchaseSupplier, String saleDate, int soldQty, String customerName, int items, double value) {

        super(id, createdDate, updatedDate);

        if (totalItems < 0) {
            System.out.println("Total items cannot be negative.");
        }
        if (stockValue < 0) {
            System.out.println("Stock value cannot be negative.");
        }

        this.totalItems = totalItems;
        this.stockValue = stockValue;
    }

    public int getTotalItems() {
        return totalItems;
    }
    public double getStockValue() {
        return stockValue;
    }
    public void setTotalItems(int totalItems) {
        if (totalItems < 0)
            System.out.println("Total items must be >= 0");
        this.totalItems = totalItems;
    }
    public void setStockValue(double stockValue) {
        if (stockValue < 0)
            System.out.println("Stock value must be >= 0");
        this.stockValue = stockValue;
    }
}
