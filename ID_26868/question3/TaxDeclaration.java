package ID_26868.question3;

public class TaxDeclaration extends Entity {
    private String declarationMonth;
    private double totalIncome;

    public TaxDeclaration(int id, String createdDate, String updatedDate, String declarationMonth, double totalIncome) {
        super(id, createdDate, updatedDate);
        setDeclarationMonth(declarationMonth);
        setTotalIncome(totalIncome);
    }

    public String getDeclarationMonth() {
        return declarationMonth;
    }
    public double getTotalIncome() {
        return totalIncome;
    }

    public void setDeclarationMonth(String declarationMonth) {
        if (declarationMonth == null || declarationMonth.trim().isEmpty()) {
            throw new IllegalArgumentException("Declaration month cannot be empty");
        }
        this.declarationMonth = declarationMonth;
    }

    public void setTotalIncome(double totalIncome) {
        if (totalIncome < 0) throw new IllegalArgumentException("Income cannot be negative");
        this.totalIncome = totalIncome;
    }
}
