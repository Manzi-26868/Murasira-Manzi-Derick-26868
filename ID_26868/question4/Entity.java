package ID_26868.question4;

public class Entity {
    private int id;
    private String createdDate;
    private String updatedDate;

    public Entity(int id, String createdDate, String updatedDate) {
        if (id <= 0) throw new IllegalArgumentException("ID must be greater than 0");
        if (createdDate == null || createdDate.trim().isEmpty()) throw new IllegalArgumentException("Created date cannot be empty");
        if (updatedDate == null || updatedDate.trim().isEmpty()) throw new IllegalArgumentException("Updated date cannot be empty");

        this.id = id;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }

    // Getters and setters
    public int getId() { return id; }
    public String getCreatedDate() { return createdDate; }
    public String getUpdatedDate() { return updatedDate; }

    public void setId(int id) {
        if (id <= 0) throw new IllegalArgumentException("ID must be greater than 0");
        this.id = id;
    }

    public void setCreatedDate(String createdDate) {
        if (createdDate == null || createdDate.trim().isEmpty()) throw new IllegalArgumentException("Created date cannot be empty");
        this.createdDate = createdDate;
    }

    public void setUpdatedDate(String updatedDate) {
        if (updatedDate == null || updatedDate.trim().isEmpty()) throw new IllegalArgumentException("Updated date cannot be empty");
        this.updatedDate = updatedDate;
    }
}