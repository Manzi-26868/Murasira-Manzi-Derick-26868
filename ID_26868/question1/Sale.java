package ID_26868.question1;

public class Sale extends Entity {
    private String saleDate;
    private int soldQuantity;
    private String customerName;

    public Sale(int id, String createdDate, String updatedDate,
                String saleDate, String wLoc, String wPhone, String catName, String catCode, String sName, String sEmail, String sPhone, String pName, double unitPrice, int soldQuantity, int qtyAvailable, int reorderLevel, String customerName, int purchasedQty, String purchaseSupplier, String date, int soldQty, String name) {

        super(id, createdDate, updatedDate);

        if (saleDate == null || saleDate.isEmpty()) {
            System.out.println("Sale date cannot be empty.");
        }
        if (soldQuantity <= 0) {
            System.out.println("Sold quantity must be greater than 0.");
        }
        if (customerName == null || customerName.isEmpty()) {
            System.out.println("Customer name cannot be empty.");
        }

        this.saleDate = saleDate;
        this.soldQuantity = soldQuantity;
        this.customerName = customerName;
    }

    public String getSaleDate() {
        return saleDate;
    }
    public int getSoldQuantity() {
        return soldQuantity;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setSaleDate(String saleDate) {
        if (saleDate == null || saleDate.isEmpty())
            System.out.println("Sale date must be valid");
        this.saleDate = saleDate;
    }
    public void setSoldQuantity(int soldQuantity) {
        if (soldQuantity <= 0)
            System.out.println("Sold quantity must be > 0");
        this.soldQuantity = soldQuantity;
    }
    public void setCustomerName(String customerName) {
        if (customerName == null || customerName.isEmpty())
            System.out.println("Customer name must not be null");
        this.customerName = customerName;
    }
}

