package ID_26868.question5;

public class Institution extends Entity {
    private String institutionName;
    private String code;
    private String address;

    public Institution(int id, String createdDate, String updatedDate, String institutionName, String code, String address) {
        super(id, createdDate, updatedDate);
        setInstitutionName(institutionName);
        setCode(code);
        setAddress(address);
    }

    // Getters and setters
    public String getInstitutionName() { return institutionName; }
    public String getCode() { return code; }
    public String getAddress() { return address; }

    public void setInstitutionName(String institutionName) {
        if (institutionName == null || institutionName.trim().isEmpty()) throw new IllegalArgumentException("Institution name cannot be empty");
        this.institutionName = institutionName;
    }

    public void setCode(String code) {
        if (code == null || code.length() < 3) throw new IllegalArgumentException("Code must be at least 3 characters");
        this.code = code;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}