package ID_26868.question6;

public class Organization extends Entity {
    private String orgName;
    private String orgCode;
    private String rssbNumber;
    private String contactEmail;

    public Organization(int id, String createdDate, String updatedDate, String orgName, String orgCode, String rssbNumber, String contactEmail) {
        super(id, createdDate, updatedDate);
        setOrgName(orgName);
        setOrgCode(orgCode);
        setRssbNumber(rssbNumber);
        setContactEmail(contactEmail);
    }

    public String getOrgName() { return orgName; }
    public String getOrgCode() { return orgCode; }
    public String getRssbNumber() { return rssbNumber; }
    public String getContactEmail() { return contactEmail; }

    public void setOrgName(String orgName) {
        if (orgName == null || orgName.trim().isEmpty()) throw new IllegalArgumentException("Organization name cannot be empty");
        this.orgName = orgName;
    }

    public void setOrgCode(String orgCode) {
        if (orgCode == null || orgCode.length() < 3) throw new IllegalArgumentException("Organization code must be at least 3 characters");
        this.orgCode = orgCode;
    }

    public void setRssbNumber(String rssbNumber) {
        if (rssbNumber == null || !rssbNumber.matches("\\d{8}")) throw new IllegalArgumentException("RSSB number must be 8 digits");
        this.rssbNumber = rssbNumber;
    }

    public void setContactEmail(String contactEmail) {
        if (contactEmail == null || !contactEmail.contains("@") || !contactEmail.contains("."))
            throw new IllegalArgumentException("Invalid email format");
        this.contactEmail = contactEmail;
    }
}