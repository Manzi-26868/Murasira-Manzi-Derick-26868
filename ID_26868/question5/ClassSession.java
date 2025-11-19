package ID_26868.question5;

public class ClassSession extends Entity {
    private String sessionDate;
    private String topic;

    public ClassSession(int id, String createdDate, String updatedDate, String sessionDate, String topic) {
        super(id, createdDate, updatedDate);
        setSessionDate(sessionDate);
        setTopic(topic);
    }

    // Getters and setters
    public String getSessionDate() { return sessionDate; }
    public String getTopic() { return topic; }

    public void setSessionDate(String sessionDate) {
        if (sessionDate == null || sessionDate.trim().isEmpty()) throw new IllegalArgumentException("Session date cannot be empty");
        this.sessionDate = sessionDate;
    }

    public void setTopic(String topic) {
        if (topic == null || topic.trim().isEmpty()) throw new IllegalArgumentException("Topic cannot be empty");
        this.topic = topic;
    }
}