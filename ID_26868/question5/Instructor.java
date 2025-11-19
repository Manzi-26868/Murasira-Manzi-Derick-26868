package ID_26868.question5;

public class Instructor extends Entity {
    private String instructorName;
    private String email;
    private String phone;

    public Instructor(int id, String createdDate, String updatedDate, String instructorName, String email, String phone) {
        super(id, createdDate, updatedDate);
        setInstructorName(instructorName);
        setEmail(email);
        setPhone(phone);
    }

    // Getters and setters
    public String getInstructorName() { return instructorName; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }

    public void setInstructorName(String instructorName) {
        if (instructorName == null || instructorName.trim().isEmpty()) throw new IllegalArgumentException("Instructor name cannot be empty");
        this.instructorName = instructorName;
    }

    public void setEmail(String email) {
        if (email == null || !email.contains("@") || !email.contains("."))
            throw new IllegalArgumentException("Invalid email format");
        this.email = email;
    }

    public void setPhone(String phone) {
        if (phone == null || !phone.matches("\\d{10}"))
            throw new IllegalArgumentException("Phone must be 10 digits");
        this.phone = phone;
    }
}