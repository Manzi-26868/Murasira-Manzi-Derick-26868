package ID_26868.question4;

public class Supplier extends Entity {
    private String supplierName;
    private String supplierTIN;
    private String contact;

    public Supplier(int id, String createdDate, String updatedDate, String supplierName, String supplierTIN, String contact) {
        super(id, createdDate, updatedDate);
        setSupplierName(supplierName);
        setSupplierTIN(supplierTIN);
        setContact(contact);
    }

    // Getters and setters
    public String getSupplierName() { return supplierName; }
    public String getSupplierTIN() { return supplierTIN; }
    public String getContact() { return contact; }

    public void setSupplierName(String supplierName) {
        if (supplierName == null || supplierName.trim().isEmpty()) throw new IllegalArgumentException("Supplier name cannot be empty");
        this.supplierName = supplierName;
    }

    public void setSupplierTIN(String supplierTIN) {
        if (supplierTIN == null || !supplierTIN.matches("\\d{9}"))
            throw new IllegalArgumentException("Supplier TIN must be 9 digits");
        this.supplierTIN = supplierTIN;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}