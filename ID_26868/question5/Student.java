package ID_26868.question5;

public class Student extends Entity {
    private String studentName;
    private String studentID;
    private int age;

    public Student(int id, String createdDate, String updatedDate, String studentName, String studentID, int age) {
        super(id, createdDate, updatedDate);
        setStudentName(studentName);
        setStudentID(studentID);
        setAge(age);
    }

    // Getters and setters
    public String getStudentName() { return studentName; }
    public String getStudentID() { return studentID; }
    public int getAge() { return age; }

    public void setStudentName(String studentName) {
        if (studentName == null || studentName.trim().isEmpty()) throw new IllegalArgumentException("Student name cannot be empty");
        this.studentName = studentName;
    }

    public void setStudentID(String studentID) {
        if (studentID == null || studentID.trim().isEmpty()) throw new IllegalArgumentException("Student ID cannot be empty");
        this.studentID = studentID;
    }

    public void setAge(int age) {
        if (age <= 0) throw new IllegalArgumentException("Age must be greater than 0");
        this.age = age;
    }
}