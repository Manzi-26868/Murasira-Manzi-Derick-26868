package ID_26868.question3;

// TaxCategory.java
public class TaxCategory extends Entity {
    private String categoryName;
    private double rate;
    private String code;

    public TaxCategory(int id, String createdDate, String updatedDate, String categoryName, double rate, String code) {
        super(id, createdDate, updatedDate);
        setCategoryName(categoryName);
        setRate(rate);
        setCode(code);
    }

    public String getCategoryName() {
        return categoryName;
    }
    public double getRate() {
        return rate;
    }
    public String getCode() {
        return code;
    }

    public void setCategoryName(String categoryName) {
        if (categoryName == null || categoryName.trim().isEmpty()) {
            throw new IllegalArgumentException("Category name cannot be empty");
        }
        this.categoryName = categoryName;
    }

    public void setRate(double rate) {
        if (rate <= 0) throw new IllegalArgumentException("Rate must be greater than 0");
        this.rate = rate;
    }

    public void setCode(String code) {
        if (code == null || code.length() < 3) throw new IllegalArgumentException("Code must be at least 3 characters");
        this.code = code;
    }
}
