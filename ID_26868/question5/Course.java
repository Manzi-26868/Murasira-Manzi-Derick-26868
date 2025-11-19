package ID_26868.question5;

public class Course extends Entity {
    private String courseName;
    private String courseCode;
    private int credits;

    public Course(int id, String createdDate, String updatedDate, String courseName, String courseCode, int credits) {
        super(id, createdDate, updatedDate);
        setCourseName(courseName);
        setCourseCode(courseCode);
        setCredits(credits);
    }

    // Getters and setters
    public String getCourseName() { return courseName; }
    public String getCourseCode() { return courseCode; }
    public int getCredits() { return credits; }

    public void setCourseName(String courseName) {
        if (courseName == null || courseName.trim().isEmpty()) throw new IllegalArgumentException("Course name cannot be empty");
        this.courseName = courseName;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public void setCredits(int credits) {
        if (credits <= 0) throw new IllegalArgumentException("Credits must be greater than 0");
        this.credits = credits;
    }
}