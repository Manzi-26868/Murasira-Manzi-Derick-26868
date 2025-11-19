package ID_26868.question4;

public class Inspection extends Entity {
    private String inspectionName;
    private String status;
    private String remarks;

    public Inspection(int id, String createdDate, String updatedDate, String inspectionName, String status, String remarks) {
        super(id, createdDate, updatedDate);
        setInspectionName(inspectionName);
        setStatus(status);
        setRemarks(remarks);
    }

    // Getters and setters
    public String getInspectionName() { return inspectionName; }
    public String getStatus() { return status; }
    public String getRemarks() { return remarks; }

    public void setInspectionName(String inspectionName) {
        if (inspectionName == null || inspectionName.trim().isEmpty()) throw new IllegalArgumentException("Inspection name cannot be empty");
        this.inspectionName = inspectionName;
    }

    public void setStatus(String status) {
        if (!"Passed".equals(status) && !"Failed".equals(status))
            throw new IllegalArgumentException("Status must be either 'Passed' or 'Failed'");
        this.status = status;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}