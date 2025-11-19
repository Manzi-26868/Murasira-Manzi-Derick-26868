package ID_26868.question1;
public class Entity {
    private int id;
    private String createdDate;
    private String updatedDate;

    public Entity(int id, String createdDate, String updatedDate) {

        if (id <= 0) {
            System.out.println("ID must be greater than 0.");
        }
        if (createdDate == null || createdDate.isEmpty() ||
                updatedDate == null || updatedDate.isEmpty()) {
            System.out.println("Dates cannot be null or empty.");
        }

        this.id = id;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }

    public int getId() {
        return id;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public String getUpdatedDate() {
        return updatedDate;
    }

    public void setId(int id) {
        if (id <= 0)
            System.out.println("ID must be greater than 0");
        this.id = id;
    }
    public void setCreatedDate(String createdDate) {
        if (createdDate == null || createdDate.isEmpty())
            System.out.println("Created date must not be null");
        this.createdDate = createdDate;
    }
    public void setUpdatedDate(String updatedDate) {
        if (updatedDate == null || updatedDate.isEmpty()) {
            System.out.println("Updated date cannot be empty.");
        }
        this.updatedDate = updatedDate;
    }
}
