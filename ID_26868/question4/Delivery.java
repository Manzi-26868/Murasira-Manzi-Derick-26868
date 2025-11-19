package ID_26868.question4;

public class Delivery extends Entity {
    private String deliveryDate;
    private String deliveredBy;

    public Delivery(int id, String createdDate, String updatedDate, String deliveryDate, String deliveredBy) {
        super(id, createdDate, updatedDate);
        setDeliveryDate(deliveryDate);
        setDeliveredBy(deliveredBy);
    }

    // Getters and setters
    public String getDeliveryDate() { return deliveryDate; }
    public String getDeliveredBy() { return deliveredBy; }

    public void setDeliveryDate(String deliveryDate) {
        if (deliveryDate == null || deliveryDate.trim().isEmpty()) throw new IllegalArgumentException("Delivery date cannot be empty");
        this.deliveryDate = deliveryDate;
    }

    public void setDeliveredBy(String deliveredBy) {
        if (deliveredBy == null || deliveredBy.trim().isEmpty()) throw new IllegalArgumentException("Delivered by cannot be empty");
        this.deliveredBy = deliveredBy;
    }
}