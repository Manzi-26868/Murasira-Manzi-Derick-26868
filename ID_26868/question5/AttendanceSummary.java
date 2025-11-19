package ID_26868.question5;

public class AttendanceSummary extends Entity {
    private String reportDate;
    private int totalPresent;
    private int totalAbsent;

    public AttendanceSummary(int id, String createdDate, String updatedDate, String reportDate, int totalPresent, int totalAbsent) {
        super(id, createdDate, updatedDate);
        setReportDate(reportDate);
        setTotalPresent(totalPresent);
        setTotalAbsent(totalAbsent);
    }

    // Getters and setters
    public String getReportDate() { return reportDate; }
    public int getTotalPresent() { return totalPresent; }
    public int getTotalAbsent() { return totalAbsent; }

    public void setReportDate(String reportDate) {
        if (reportDate == null || reportDate.trim().isEmpty()) throw new IllegalArgumentException("Report date cannot be empty");
        this.reportDate = reportDate;
    }

    public void setTotalPresent(int totalPresent) {
        if (totalPresent < 0) throw new IllegalArgumentException("Total present cannot be negative");
        this.totalPresent = totalPresent;
    }

    public void setTotalAbsent(int totalAbsent) {
        if (totalAbsent < 0) throw new IllegalArgumentException("Total absent cannot be negative");
        this.totalAbsent = totalAbsent;
    }

    public double generateSummary(int totalSessions) {
        if (totalSessions <= 0) return 0;
        return (double) totalPresent / totalSessions * 100;
    }

    public void displaySummary() {
        int totalSessions = totalPresent + totalAbsent;
        double attendancePercentage = generateSummary(totalSessions);
        System.out.println("=== ATTENDANCE SUMMARY REPORT ===");
        System.out.println("Report Date: " + reportDate);
        System.out.println("Total Present: " + totalPresent);
        System.out.println("Total Absent: " + totalAbsent);
        System.out.println("Total Sessions: " + totalSessions);
        System.out.println("Attendance Percentage: " + attendancePercentage + "%");
    }
}