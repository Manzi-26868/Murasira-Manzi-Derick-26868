package ID_26868.question1;

public class Warehouse extends Entity {
    private String warehouseName;
    private String location;
    private String contactNumber;

    public Warehouse(int id, String createdDate, String updatedDate,
                     String warehouseName, String location, String contactNumber) {

        super(id, createdDate, updatedDate);

        if (warehouseName == null || warehouseName.isEmpty()) {
            System.out.println("Warehouse name cannot be empty.");
        }
        if (location == null || location.isEmpty()) {
            System.out.println("Location cannot be empty.");
        }
        if (!contactNumber.matches("\\d{10}")) {
            System.out.println("Contact number must be 10 digits.");
        }

        this.warehouseName = warehouseName;
        this.location = location;
        this.contactNumber = contactNumber;
    }

    public String getWarehouseName() {
        return warehouseName;
    }
    public String getLocation() {
        return location;
    }
    public String getContactNumber() {
        return contactNumber;
    }
    public void setWarehouseName(String warehouseName) {
        if (warehouseName == null || warehouseName.isEmpty())
            System.out.println("Warehouse name must not be null");
        this.warehouseName = warehouseName;
    }
    public void setLocation(String location) {
        if (location == null || location.isEmpty())
            System.out.println("Location must not be null");
        this.location = location;
    }
    public void setContactNumber(String contactNumber) {
        if (contactNumber == null || !contactNumber.matches("\\d{10}"))
            System.out.println("Contact number must be 10 digits");
        this.contactNumber = contactNumber;
    }
}
