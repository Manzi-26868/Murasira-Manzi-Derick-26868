package ID_26868.question5;

public class LeaveRequest extends Entity {
    private String requestDate;
    private String reason;
    private boolean approved;

    public LeaveRequest(int id, String createdDate, String updatedDate, String requestDate, String reason, boolean approved) {
        super(id, createdDate, updatedDate);
        setRequestDate(requestDate);
        setReason(reason);
        setApproved(approved);
    }

    // Getters and setters
    public String getRequestDate() { return requestDate; }
    public String getReason() { return reason; }
    public boolean isApproved() { return approved; }

    public void setRequestDate(String requestDate) {
        if (requestDate == null || requestDate.trim().isEmpty()) throw new IllegalArgumentException("Request date cannot be empty");
        this.requestDate = requestDate;
    }

    public void setReason(String reason) {
        if (reason == null || reason.trim().isEmpty()) throw new IllegalArgumentException("Reason cannot be empty");
        this.reason = reason;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }
}