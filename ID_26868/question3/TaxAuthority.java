package Two6868.question3;

public class TaxAuthority extends Entity {
    private String authorityName;
    private String region;
    private String email;

    public TaxAuthority(int id, String createdDate, String updatedDate, String authorityName, String region, String email) {
        super(id, createdDate, updatedDate);
        setAuthorityName(authorityName);
        setRegion(region);
        setEmail(email);
    }

    public String getAuthorityName() {
        return authorityName;
    }
    public String getRegion() {
        return region;
    }
    public String getEmail() {
        return email;
    }

    public void setAuthorityName(String authorityName) {
        if (authorityName == null || authorityName.trim().isEmpty()) {
            throw new IllegalArgumentException("Authority name cannot be empty");
        }
        this.authorityName = authorityName;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setEmail(String email) {
        if (email == null || !email.contains("@") || !email.contains(".")) {
            throw new IllegalArgumentException("Invalid email format");
        }
        this.email = email;
    }
}

