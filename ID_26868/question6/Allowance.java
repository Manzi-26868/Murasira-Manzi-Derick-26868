package ID_26868.question6;

public class Allowance extends Entity {
    private double overtimeHours;
    private double overtimeRate;
    private double bonus;

    public Allowance(int id, String createdDate, String updatedDate, double overtimeHours, double overtimeRate, double bonus) {
        super(id, createdDate, updatedDate);
        setOvertimeHours(overtimeHours);
        setOvertimeRate(overtimeRate);
        setBonus(bonus);
    }

    public double getOvertimeHours() { return overtimeHours; }
    public double getOvertimeRate() { return overtimeRate; }
    public double getBonus() { return bonus; }

    public void setOvertimeHours(double overtimeHours) {
        if (overtimeHours < 0) throw new IllegalArgumentException("Overtime hours cannot be negative");
        this.overtimeHours = overtimeHours;
    }

    public void setOvertimeRate(double overtimeRate) {
        if (overtimeRate < 0) throw new IllegalArgumentException("Overtime rate cannot be negative");
        this.overtimeRate = overtimeRate;
    }

    public void setBonus(double bonus) {
        if (bonus < 0) throw new IllegalArgumentException("Bonus cannot be negative");
        this.bonus = bonus;
    }

    public double getOvertimeAmount() {
        return overtimeHours * overtimeRate;
    }

    public double getTotalExtraAllowances() {
        return getOvertimeAmount() + bonus;
    }
}