package ID_26868.question5;

public class AttendanceRecord extends Entity {
    private String studentID;
    private String sessionID;
    private String status;

    public AttendanceRecord(int id, String createdDate, String updatedDate, String studentID, String sessionID, String status) {
        super(id, createdDate, updatedDate);
        setStudentID(studentID);
        setSessionID(sessionID);
        setStatus(status);
    }

    // Getters and setters
    public String getStudentID() { return studentID; }
    public String getSessionID() { return sessionID; }
    public String getStatus() { return status; }

    public void setStudentID(String studentID) {
        if (studentID == null || studentID.trim().isEmpty()) throw new IllegalArgumentException("Student ID cannot be empty");
        this.studentID = studentID;
    }

    public void setSessionID(String sessionID) {
        if (sessionID == null || sessionID.trim().isEmpty()) throw new IllegalArgumentException("Session ID cannot be empty");
        this.sessionID = sessionID;
    }

    public void setStatus(String status) {
        if (!"Present".equals(status) && !"Absent".equals(status))
            throw new IllegalArgumentException("Status must be either 'Present' or 'Absent'");
        this.status = status;
    }
}