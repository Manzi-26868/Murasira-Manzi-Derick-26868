package ID_26868.question6;

public class PayrollPeriod extends Entity {
    private int month;
    private int year;
    private String startDate;
    private String endDate;

    public PayrollPeriod(int id, String createdDate, String updatedDate, int month, int year, String startDate, String endDate) {
        super(id, createdDate, updatedDate);
        setMonth(month);
        setYear(year);
        setStartDate(startDate);
        setEndDate(endDate);
    }

    public int getMonth() { return month; }
    public int getYear() { return year; }
    public String getStartDate() { return startDate; }
    public String getEndDate() { return endDate; }

    public void setMonth(int month) {
        if (month < 1 || month > 12) throw new IllegalArgumentException("Month must be between 1-12");
        this.month = month;
    }

    public void setYear(int year) {
        if (year < 2000) throw new IllegalArgumentException("Year must be at least 2000");
        this.year = year;
    }

    public void setStartDate(String startDate) {
        if (startDate == null || startDate.trim().isEmpty()) throw new IllegalArgumentException("Start date cannot be empty");
        this.startDate = startDate;
    }

    public void setEndDate(String endDate) {
        if (endDate == null || endDate.trim().isEmpty()) throw new IllegalArgumentException("End date cannot be empty");
        this.endDate = endDate;
    }
}