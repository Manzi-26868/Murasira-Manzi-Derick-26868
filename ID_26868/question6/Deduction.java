package ID_26868.question6;

public class Deduction extends Entity {
    private double rssbContribution;
    private double payeTax;
    private double loanDeduction;

    public Deduction(int id, String createdDate, String updatedDate, double rssbContribution, double payeTax, double loanDeduction) {
        super(id, createdDate, updatedDate);
        setRssbContribution(rssbContribution);
        setPayeTax(payeTax);
        setLoanDeduction(loanDeduction);
    }

    public double getRssbContribution() { return rssbContribution; }
    public double getPayeTax() { return payeTax; }
    public double getLoanDeduction() { return loanDeduction; }

    public void setRssbContribution(double rssbContribution) {
        if (rssbContribution < 0) throw new IllegalArgumentException("RSSB contribution cannot be negative");
        this.rssbContribution = rssbContribution;
    }

    public void setPayeTax(double payeTax) {
        if (payeTax < 0) throw new IllegalArgumentException("PAYE tax cannot be negative");
        this.payeTax = payeTax;
    }

    public void setLoanDeduction(double loanDeduction) {
        if (loanDeduction < 0) throw new IllegalArgumentException("Loan deduction cannot be negative");
        this.loanDeduction = loanDeduction;
    }

    public double getTotalDeductions() {
        return rssbContribution + payeTax + loanDeduction;
    }
}