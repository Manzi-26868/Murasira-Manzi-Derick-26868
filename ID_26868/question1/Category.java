package ID_26868.question1;

public class Category extends Entity {
    private String categoryName;
    private String categoryCode;

    public Category(int id, String createdDate, String updatedDate,
                    String categoryName, String categoryCode, String number, String electronics, String elec001) {

        super(id, createdDate, updatedDate);

        if (categoryName == null || categoryName.isEmpty()) {
            System.out.println("Category name cannot be empty.");
        }
        if (categoryCode == null || categoryCode.length() < 3 ||
                !categoryCode.matches("[A-Za-z0-9]+")) {
            System.out.println("Category code must be alphanumeric and at least 3 characters.");
        }

        this.categoryName = categoryName;
        this.categoryCode = categoryCode;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryName(String categoryName) {
        if (categoryName == null || categoryName.isEmpty())
            System.out.println("Category name must not be null");
        this.categoryName = categoryName;
    }

    public void setCategoryCode(String categoryCode) {
        if (categoryCode == null || !categoryCode.matches("[a-zA-Z0-9]{3,}"))
            System.out.println("Category code must be alphanumeric and >= 3 chars");
        this.categoryCode = categoryCode;
    }

    public String getWarehouseName() {

        return "";
    }
}

