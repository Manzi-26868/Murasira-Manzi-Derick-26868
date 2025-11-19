package ID_26868.question6;

public class SalaryStructure extends Entity {
    private double basicPay;
    private double transportAllowance;
    private double housingAllowance;

    public SalaryStructure(int id, String createdDate, String updatedDate, double basicPay, double transportAllowance, double housingAllowance) {
        super(id, createdDate, updatedDate);
        setBasicPay(basicPay);
        setTransportAllowance(transportAllowance);
        setHousingAllowance(housingAllowance);
    }

    public double getBasicPay() { return basicPay; }
    public double getTransportAllowance() { return transportAllowance; }
    public double getHousingAllowance() { return housingAllowance; }

    public void setBasicPay(double basicPay) {
        if (basicPay < 0) throw new IllegalArgumentException("Basic pay cannot be negative");
        this.basicPay = basicPay;
    }

    public void setTransportAllowance(double transportAllowance) {
        if (transportAllowance < 0) throw new IllegalArgumentException("Transport allowance cannot be negative");
        this.transportAllowance = transportAllowance;
    }

    public void setHousingAllowance(double housingAllowance) {
        if (housingAllowance < 0) throw new IllegalArgumentException("Housing allowance cannot be negative");
        this.housingAllowance = housingAllowance;
    }

    public double getTotalAllowances() {
        return transportAllowance + housingAllowance;
    }
}