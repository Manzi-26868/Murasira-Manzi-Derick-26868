package ID_26868.question4;

public class Organizations extends Entity {
    private String orgName;
    private String address;
    private String contactEmail;

    public Organizations(int id, String createdDate, String updatedDate, String orgName, String address, String contactEmail) {
        super(id, createdDate, updatedDate);
        setOrgName(orgName);
        setAddress(address);
        setContactEmail(contactEmail);
    }

    // Getters and setters
    public String getOrgName() { return orgName; }
    public String getAddress() { return address; }
    public String getContactEmail() { return contactEmail; }

    public void setOrgName(String orgName) {
        if (orgName == null || orgName.trim().isEmpty()) throw new IllegalArgumentException("Organization name cannot be empty");
        this.orgName = orgName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setContactEmail(String contactEmail) {
        if (contactEmail == null || !contactEmail.contains("@") || !contactEmail.contains("."))
            throw new IllegalArgumentException("Invalid email format");
        this.contactEmail = contactEmail;
    }
}