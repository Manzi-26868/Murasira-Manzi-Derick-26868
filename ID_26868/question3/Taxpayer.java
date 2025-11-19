package ID_26868.question3;

public class Taxpayer extends Entity {
    private String tin;
    private String taxpayerName;
    private String address;

    public Taxpayer(int id, String createdDate, String updatedDate, String tin, String taxpayerName, String address) {
        super(id, createdDate, updatedDate);
        setTin(tin);
        setTaxpayerName(taxpayerName);
        setAddress(address);
    }

    public String getTin() {
        return tin;
    }
    public String getTaxpayerName() {
        return taxpayerName;
    }
    public String getAddress() {
        return address;
    }

    public void setTin(String tin) {
        if (tin == null || !tin.matches("\\d{9}")) throw new IllegalArgumentException("TIN must be 9 digits");
        this.tin = tin;
    }

    public void setTaxpayerName(String taxpayerName) {
        if (taxpayerName == null || taxpayerName.trim().isEmpty()) throw new IllegalArgumentException("Taxpayer name cannot be empty");
        this.taxpayerName = taxpayerName;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
