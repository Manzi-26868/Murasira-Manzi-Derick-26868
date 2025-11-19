package ID_26868.question3;

public class TaxAssessment extends Entity {
    private String assessmentDate;
    private double assessedTax;

    public TaxAssessment(int id, String createdDate, String updatedDate, String assessmentDate, double assessedTax) {
        super(id, createdDate, updatedDate);
        if (assessedTax < 0) throw new IllegalArgumentException("Tax cannot be negative");

        this.assessmentDate = assessmentDate;
        this.assessedTax = assessedTax;
    }

    public String getAssessmentDate() { return assessmentDate; }
    public double getAssessedTax() { return assessedTax; }
}
