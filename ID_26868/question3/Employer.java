package ID_26868.question3;

public class Employer extends Entity {
    private String employerName;
    private String employerTIN;
    private String contact;

    public Employer(int id, String createdDate, String updatedDate, String employerName, String employerTIN, String contact) {
        super(id, createdDate, updatedDate);
        if (employerTIN == null || !employerTIN.matches("\\d{9}")) throw new IllegalArgumentException("Employer TIN must be 9 digits");
        if (contact == null || !contact.matches("\\d{10}")) throw new IllegalArgumentException("Contact must be 10 digits");

        this.employerName = employerName;
        this.employerTIN = employerTIN;
        this.contact = contact;
    }

    public String getEmployerName() {
        return employerName;
    }
    public String getEmployerTIN() {
        return employerTIN;
    }
    public String getContact() {
        return contact;
    }

}
