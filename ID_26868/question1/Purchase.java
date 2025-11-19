package ID_26868.question1;

public class Purchase extends Entity {
    private String purchaseDate;
    private int purchasedQuantity;
    private String supplierName;

    public Purchase(int id, String createdDate, String updatedDate,
                    String purchaseDate, String wLoc, String wPhone, String catName, String catCode, String sName, String sEmail, String sPhone, String pName, double unitPrice, int purchasedQuantity, int qtyAvailable, int reorderLevel, String supplierName, int purchasedQty, String purchaseSupplier) {

        super(id, createdDate, updatedDate);

        if (purchaseDate == null || purchaseDate.isEmpty()) {
            System.out.println("Purchase date cannot be empty.");
        }
        if (purchasedQuantity <= 0) {
            System.out.println("Purchased quantity must be greater than 0.");
        }
        if (supplierName == null || supplierName.isEmpty()) {
            System.out.println("Supplier name cannot be empty.");
        }

        this.purchaseDate = purchaseDate;
        this.purchasedQuantity = purchasedQuantity;
        this.supplierName = supplierName;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }
    public int getPurchasedQuantity() {
        return purchasedQuantity;
    }
    public String getSupplierName() {
        return supplierName;
    }


    public void setPurchaseDate(String purchaseDate) {
        if (purchaseDate == null || purchaseDate.isEmpty())
            System.out.println("Purchase date must not be null");
        this.purchaseDate = purchaseDate;
    }
    public void setPurchasedQuantity(int purchasedQuantity) {
        if (purchasedQuantity <= 0)
            System.out.println("Purchased quantity must be > 0");
        this.purchasedQuantity = purchasedQuantity;
    }
    public void setSupplierName(String supplierName) {
        if (supplierName == null || supplierName.isEmpty())
            System.out.println("Supplier name must not be null");
        this.supplierName = supplierName;
    }
}

