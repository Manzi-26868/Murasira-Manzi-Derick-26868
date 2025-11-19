package ID_26868.question1;

public class StockItem extends Entity {
    private int quantityAvailable;
    private int reorderLevel;

    public StockItem(int id, String createdDate, String updatedDate,
                     String wName, String wLoc, String wPhone, String catName, String catCode, String sName, String sEmail, String sPhone, String pName, double unitPrice, int quantityAvailable, int reorderLevel, int level) {

        super(id, createdDate, updatedDate);

        if (quantityAvailable < 0) {
            System.out.println("Quantity cannot be negative.");
        }
        if (reorderLevel < 0) {
            System.out.println("Reorder level cannot be negative.");
        }

        this.quantityAvailable = quantityAvailable;
        this.reorderLevel = reorderLevel;
    }

    public int getQuantityAvailable() {
        return quantityAvailable;
    }
    public int getReorderLevel() {
        return reorderLevel;
    }
    public void setQuantityAvailable(int quantityAvailable) {
        if (quantityAvailable < 0)
            System.out.println("Quantity available must be >= 0");
        this.quantityAvailable = quantityAvailable;
    }
    public void setReorderLevel(int reorderLevel) {
        if (reorderLevel < 0)
            throw new IllegalArgumentException("Reorder level must be >= 0");
        this.reorderLevel = reorderLevel;
    }
}

