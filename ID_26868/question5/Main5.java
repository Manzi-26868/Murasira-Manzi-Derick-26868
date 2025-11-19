package ID_26868.question5;

import java.util.Scanner;

public class Main5 {
    private static final String STUDENT_ID = "26868";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ------------------ INSTITUTION INPUT ------------------
        System.out.println(STUDENT_ID + " | Enter Institution Details:");

        System.out.print(STUDENT_ID + " | Enter Institution ID: ");
        int instId = sc.nextInt();
        sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Created Date: ");
        String instCreated = sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Updated Date: ");
        String instUpdated = sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Institution Name: ");
        String instName = sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Institution Code: ");
        String instCode = sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Address: ");
        String address = sc.nextLine();

        Institution institution = new Institution(
                instId, instCreated, instUpdated,
                instName, instCode, address
        );

        System.out.println("\n" + STUDENT_ID + " | INSTITUTION CREATED SUCCESSFULLY\n");

        // ------------------ DEPARTMENT INPUT ------------------
        System.out.println(STUDENT_ID + " | Enter Department Details:");

        System.out.print(STUDENT_ID + " | Enter Department ID: ");
        int deptId = sc.nextInt();
        sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Department Created Date: ");
        String deptCreated = sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Department Updated Date: ");
        String deptUpdated = sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Department Name: ");
        String deptName = sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Department Head: ");
        String deptHead = sc.nextLine();

        Department department = new Department(
                deptId, deptCreated, deptUpdated,
                deptName, deptHead
        );

        System.out.println("\n" + STUDENT_ID + " | DEPARTMENT CREATED SUCCESSFULLY\n");

        // ------------------ COURSE INPUT ------------------
        System.out.println(STUDENT_ID + " | Enter Course Details:");

        System.out.print(STUDENT_ID + " | Enter Course ID: ");
        int courseId = sc.nextInt();
        sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Course Created Date: ");
        String courseCreated = sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Course Updated Date: ");
        String courseUpdated = sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Course Name: ");
        String courseName = sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Course Code: ");
        String courseCode = sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Credits: ");
        int credits = sc.nextInt();
        sc.nextLine();

        Course course = new Course(
                courseId, courseCreated, courseUpdated,
                courseName, courseCode, credits
        );

        System.out.println("\n" + STUDENT_ID + " | COURSE CREATED SUCCESSFULLY\n");

        // ------------------ INSTRUCTOR INPUT ------------------
        System.out.println(STUDENT_ID + " | Enter Instructor Details:");

        System.out.print(STUDENT_ID + " | Enter Instructor ID: ");
        int instId2 = sc.nextInt();
        sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Instructor Created Date: ");
        String instCreated2 = sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Instructor Updated Date: ");
        String instUpdated2 = sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Instructor Name: ");
        String instName2 = sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Email: ");
        String email = sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Phone (10 digits): ");
        String phone = sc.nextLine();

        Instructor instructor = new Instructor(
                instId2, instCreated2, instUpdated2,
                instName2, email, phone
        );

        System.out.println("\n" + STUDENT_ID + " | INSTRUCTOR CREATED SUCCESSFULLY\n");

        // ------------------ STUDENT INPUT ------------------
        System.out.println(STUDENT_ID + " | Enter Student Details:");

        System.out.print(STUDENT_ID + " | Enter Student ID: ");
        int studentId = sc.nextInt();
        sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Student Created Date: ");
        String studentCreated = sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Student Updated Date: ");
        String studentUpdated = sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Student Name: ");
        String studentName = sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Student ID Number: ");
        String studentID = sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        Student student = new Student(
                studentId, studentCreated, studentUpdated,
                studentName, studentID, age
        );

        System.out.println("\n" + STUDENT_ID + " | STUDENT CREATED SUCCESSFULLY\n");

        // ------------------ CLASS SESSION INPUT ------------------
        System.out.println(STUDENT_ID + " | Enter Class Session Details:");

        System.out.print(STUDENT_ID + " | Enter Class Session ID: ");
        int sessionId = sc.nextInt();
        sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Session Created Date: ");
        String sessionCreated = sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Session Updated Date: ");
        String sessionUpdated = sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Session Date: ");
        String sessionDate = sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Topic: ");
        String topic = sc.nextLine();

        ClassSession classSession = new ClassSession(
                sessionId, sessionCreated, sessionUpdated,
                sessionDate, topic
        );

        System.out.println("\n" + STUDENT_ID + " | CLASS SESSION CREATED SUCCESSFULLY\n");

        // ------------------ ATTENDANCE RECORD INPUT ------------------
        System.out.println(STUDENT_ID + " | Enter Attendance Record Details:");

        System.out.print(STUDENT_ID + " | Enter Attendance Record ID: ");
        int attId = sc.nextInt();
        sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Attendance Created Date: ");
        String attCreated = sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Attendance Updated Date: ");
        String attUpdated = sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Student ID for Attendance: ");
        String attStudentID = sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Session ID for Attendance: ");
        String attSessionID = sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Status (Present/Absent): ");
        String status = sc.nextLine();

        AttendanceRecord attendanceRecord = new AttendanceRecord(
                attId, attCreated, attUpdated,
                attStudentID, attSessionID, status
        );

        System.out.println("\n" + STUDENT_ID + " | ATTENDANCE RECORD CREATED SUCCESSFULLY\n");

        // ------------------ LEAVE REQUEST INPUT ------------------
        System.out.println(STUDENT_ID + " | Enter Leave Request Details:");

        System.out.print(STUDENT_ID + " | Enter Leave Request ID: ");
        int leaveId = sc.nextInt();
        sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Leave Created Date: ");
        String leaveCreated = sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Leave Updated Date: ");
        String leaveUpdated = sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Request Date: ");
        String requestDate = sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Reason: ");
        String reason = sc.nextLine();

        System.out.print(STUDENT_ID + " | Is Approved? (true/false): ");
        boolean approved = sc.nextBoolean();
        sc.nextLine();

        LeaveRequest leaveRequest = new LeaveRequest(
                leaveId, leaveCreated, leaveUpdated,
                requestDate, reason, approved
        );

        System.out.println("\n" + STUDENT_ID + " | LEAVE REQUEST CREATED SUCCESSFULLY\n");

        // ------------------ ATTENDANCE SUMMARY INPUT ------------------
        System.out.println(STUDENT_ID + " | Enter Attendance Summary Details:");

        System.out.print(STUDENT_ID + " | Enter Attendance Summary ID: ");
        int summaryId = sc.nextInt();
        sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Summary Created Date: ");
        String summaryCreated = sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Summary Updated Date: ");
        String summaryUpdated = sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Report Date: ");
        String reportDate = sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Total Present: ");
        int totalPresent = sc.nextInt();

        System.out.print(STUDENT_ID + " | Enter Total Absent: ");
        int totalAbsent = sc.nextInt();
        sc.nextLine();

        AttendanceSummary attendanceSummary = new AttendanceSummary(
                summaryId, summaryCreated, summaryUpdated,
                reportDate, totalPresent, totalAbsent
        );

        System.out.println("\n" + STUDENT_ID + " | ATTENDANCE SUMMARY CREATED SUCCESSFULLY\n");

        // ------------------ DISPLAY RESULTS ------------------
        System.out.println(STUDENT_ID + " | === ATTENDANCE MANAGEMENT SYSTEM SUMMARY ===");

        System.out.println("\n" + STUDENT_ID + " | Institution Info:");
        System.out.println(STUDENT_ID + " | Name: " + institution.getInstitutionName());
        System.out.println(STUDENT_ID + " | Code: " + institution.getCode());
        System.out.println(STUDENT_ID + " | Address: " + institution.getAddress());

        System.out.println("\n" + STUDENT_ID + " | Department Info:");
        System.out.println(STUDENT_ID + " | Name: " + department.getDepartmentName());
        System.out.println(STUDENT_ID + " | Head: " + department.getDepartmentHead());

        System.out.println("\n" + STUDENT_ID + " | Course Info:");
        System.out.println(STUDENT_ID + " | Name: " + course.getCourseName());
        System.out.println(STUDENT_ID + " | Code: " + course.getCourseCode());
        System.out.println(STUDENT_ID + " | Credits: " + course.getCredits());

        System.out.println("\n" + STUDENT_ID + " | Instructor Info:");
        System.out.println(STUDENT_ID + " | Name: " + instructor.getInstructorName());
        System.out.println(STUDENT_ID + " | Email: " + instructor.getEmail());
        System.out.println(STUDENT_ID + " | Phone: " + instructor.getPhone());

        System.out.println("\n" + STUDENT_ID + " | Student Info:");
        System.out.println(STUDENT_ID + " | Name: " + student.getStudentName());
        System.out.println(STUDENT_ID + " | Student ID: " + student.getStudentID());
        System.out.println(STUDENT_ID + " | Age: " + student.getAge());

        System.out.println("\n" + STUDENT_ID + " | Class Session Info:");
        System.out.println(STUDENT_ID + " | Session Date: " + classSession.getSessionDate());
        System.out.println(STUDENT_ID + " | Topic: " + classSession.getTopic());

        System.out.println("\n" + STUDENT_ID + " | Attendance Record Info:");
        System.out.println(STUDENT_ID + " | Student ID: " + attendanceRecord.getStudentID());
        System.out.println(STUDENT_ID + " | Session ID: " + attendanceRecord.getSessionID());
        System.out.println(STUDENT_ID + " | Status: " + attendanceRecord.getStatus());

        System.out.println("\n" + STUDENT_ID + " | Leave Request Info:");
        System.out.println(STUDENT_ID + " | Request Date: " + leaveRequest.getRequestDate());
        System.out.println(STUDENT_ID + " | Reason: " + leaveRequest.getReason());
        System.out.println(STUDENT_ID + " | Approved: " + leaveRequest.isApproved());

        System.out.println("\n" + STUDENT_ID + " | Attendance Summary Info:");
        System.out.println(STUDENT_ID + " | Report Date: " + attendanceSummary.getReportDate());
        System.out.println(STUDENT_ID + " | Total Present: " + attendanceSummary.getTotalPresent());
        System.out.println(STUDENT_ID + " | Total Absent: " + attendanceSummary.getTotalAbsent());

        // Generate attendance summary report
        generateAttendanceReport(attendanceSummary, STUDENT_ID);

        sc.close();
    }

    private static void generateAttendanceReport(AttendanceSummary summary, String studentId) {
        System.out.println("\n" + studentId + " | === ATTENDANCE SUMMARY REPORT ===");
        System.out.println(studentId + " | Report Date: " + summary.getReportDate());
        System.out.println(studentId + " | Total Present: " + summary.getTotalPresent());
        System.out.println(studentId + " | Total Absent: " + summary.getTotalAbsent());

        int totalSessions = summary.getTotalPresent() + summary.getTotalAbsent();
        double attendancePercentage = summary.generateSummary(totalSessions);

        System.out.println(studentId + " | Total Sessions: " + totalSessions);
        System.out.println(studentId + " | Attendance Percentage: " + attendancePercentage + "%");
        System.out.println(studentId + " | Report generated successfully!");
    }
}