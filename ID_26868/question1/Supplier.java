package ID_26868.question1;

public class Supplier extends Entity {
    private String supplierName;
    private String supplierEmail;
    private String supplierPhone;

    public Supplier(int id, String s, String date, String mainWarehouse, String kigali, String number, String createdDate, String updatedDate, String supplierName, String supplierEmail, String supplierPhone) {
        super(id, createdDate, updatedDate);
        if (supplierName == null || supplierName.isEmpty())
            System.out.println("Supplier name must not be null");
        if (supplierEmail == null || !supplierEmail.matches("^[\\w-_.+]*[\\w-_.]@([\\w]+[.])+[\\w]+[\\w]$"))
            System.out.println("Invalid email");
        if (supplierPhone == null || !supplierPhone.matches("\\d{10}"))
            System.out.println("Supplier phone must be 10 digits");
        this.supplierName = supplierName;
        this.supplierEmail = supplierEmail;
        this.supplierPhone = supplierPhone;
    }

    // Getters
    public String getSupplierName() {
        return supplierName;
    }
    public String getSupplierEmail() {
        return supplierEmail;
    }
    public String getSupplierPhone() {
        return supplierPhone;
    }
    public String getCategoryName() {

        return "categoryName";
    }

    // Setters
    public void setSupplierName(String supplierName) {
        if (supplierName == null || supplierName.isEmpty())
            System.out.println("Supplier name must not be null");
        this.supplierName = supplierName;
    }
    public void setSupplierEmail(String supplierEmail) {
        if (supplierEmail == null || !supplierEmail.matches("^[\\w-_.+]*[\\w-_.]@([\\w]+[.])+[\\w]+[\\w]$"))
            System.out.println("Invalid email");
        this.supplierEmail = supplierEmail;
    }
    public void setSupplierPhone(String supplierPhone) {
        if (supplierPhone == null || !supplierPhone.matches("\\d{10}"))
            System.out.println("Supplier phone must be 10 digits");
        this.supplierPhone = supplierPhone;
    }
}