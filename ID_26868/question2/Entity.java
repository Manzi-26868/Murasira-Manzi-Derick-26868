package ID_26868.question2;

public class Entity {
    private int id;
    private String createdDate;
    private String updatedDate;

    public Entity(int id, String createdDate, String updatedDate) {
        if (id <= 0) throw new IllegalArgumentException("ID must be > 0");
        if (createdDate == null || createdDate.trim().isEmpty())
            throw new IllegalArgumentException("Created date cannot be empty");
        this.id = id;
        this.createdDate = createdDate;
        this.updatedDate = createdDate;
    }

    public int getId() { return id; }
    public String getCreatedDate() { return createdDate; }
    public String getUpdatedDate() { return updatedDate; }

    public String toString() {
        return "ID: " + id + " | Created: " + createdDate + " | Updated: " + updatedDate;
    }
}