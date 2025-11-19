package ID_26868.question3;
import java.util.Scanner;

public class TaxMain {
    private static final String STUDENT_ID = "26868";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(STUDENT_ID + " | === TAX ADMINISTRATION SYSTEM ===");

        // Create TaxAuthority
        System.out.println("\n" + STUDENT_ID + " | --- Tax Authority Registration ---");
        System.out.print(STUDENT_ID + " | Enter Authority Name: ");
        String authorityName = scanner.nextLine();
        System.out.print(STUDENT_ID + " | Enter Region: ");
        String region = scanner.nextLine();
        System.out.print(STUDENT_ID + " | Enter Email: ");
        String email = scanner.nextLine();

        TaxAuthority authority = new TaxAuthority(1, "2024-01-01", "2024-01-01", authorityName, region, email);

        // Create TaxCategory
        System.out.println("\n" + STUDENT_ID + " | --- Tax Category Setup ---");
        System.out.print(STUDENT_ID + " | Enter Category Name: ");
        String categoryName = scanner.nextLine();
        System.out.print(STUDENT_ID + " | Enter Tax Rate (e.g., 0.15 for 15%): ");
        double rate = scanner.nextDouble();
        scanner.nextLine(); // consume newline
        System.out.print(STUDENT_ID + " | Enter Category Code: ");
        String code = scanner.nextLine();

        TaxCategory category = new TaxCategory(2, "2024-01-01", "2024-01-01", categoryName, rate, code);

        // Create Taxpayer
        System.out.println("\n" + STUDENT_ID + " | --- Taxpayer Registration ---");
        System.out.print(STUDENT_ID + " | Enter TIN (9 digits): ");
        String tin = scanner.nextLine();
        System.out.print(STUDENT_ID + " | Enter Taxpayer Name: ");
        String taxpayerName = scanner.nextLine();
        System.out.print(STUDENT_ID + " | Enter Address: ");
        String address = scanner.nextLine();

        Taxpayer taxpayer = new Taxpayer(3, "2024-01-01", "2024-01-01", tin, taxpayerName, address);

        // Create Employee
        System.out.println("\n" + STUDENT_ID + " | --- Employee Registration ---");
        System.out.print(STUDENT_ID + " | Enter Employee Name: ");
        String employeeName = scanner.nextLine();
        System.out.print(STUDENT_ID + " | Enter Salary: ");
        double salary = scanner.nextDouble();
        scanner.nextLine(); // consume newline
        System.out.print(STUDENT_ID + " | Enter Employer TIN: ");
        String employerTIN = scanner.nextLine();

        Employee employee = new Employee(4, "2024-01-01", "2024-01-01", employeeName, salary, employerTIN);

        // Create TaxDeclaration
        System.out.println("\n" + STUDENT_ID + " | --- Tax Declaration ---");
        System.out.print(STUDENT_ID + " | Enter Declaration Month: ");
        String declarationMonth = scanner.nextLine();
        System.out.print(STUDENT_ID + " | Enter Total Income: ");
        double totalIncome = scanner.nextDouble();
        scanner.nextLine(); // consume newline

        TaxDeclaration declaration = new TaxDeclaration(5, "2024-01-01", "2024-01-01", declarationMonth, totalIncome);

        // Create TaxRecord and calculate tax
        System.out.println("\n" + STUDENT_ID + " | --- Tax Calculation ---");
        System.out.print(STUDENT_ID + " | Enter Receipt Number: ");
        String receiptNo = scanner.nextLine();

        TaxRecord taxRecord = new TaxRecord(6, "2024-01-01", "2024-01-01", receiptNo, 0);

        // Calculate tax
        double calculatedTax = taxRecord.computeTax(salary, rate, 0);
        taxRecord.setTotalTax(calculatedTax);

        // Display results WITH STUDENT ID CONCATENATION
        System.out.println("\n" + STUDENT_ID + " | === SYSTEM DATA SUMMARY ===");
        System.out.println(STUDENT_ID + " | Tax Authority: " + authority.getAuthorityName());
        System.out.println(STUDENT_ID + " | Tax Category: " + category.getCategoryName() + " (" + category.getRate() * 100 + "%)");
        System.out.println(STUDENT_ID + " | Taxpayer: " + taxpayer.getTaxpayerName() + " (TIN: " + taxpayer.getTin() + ")");
        System.out.println(STUDENT_ID + " | Employee: " + employee.getEmployeeName() + " (Salary: " + employee.getSalary() + ")");
        System.out.println(STUDENT_ID + " | Declaration Month: " + declaration.getDeclarationMonth());
        System.out.println(STUDENT_ID + " | Total Income: " + declaration.getTotalIncome());

        // Display tax calculation with student ID
        displayTaxCalculationWithStudentID(taxRecord, salary, rate, 0, STUDENT_ID);

        scanner.close();
    }

    // Custom method to display tax calculation with student ID
    private static void displayTaxCalculationWithStudentID(TaxRecord taxRecord, double salary, double rate, double credits, String studentId) {
        double tax = taxRecord.computeTax(salary, rate, credits);
        System.out.println("\n" + studentId + " | === TAX CALCULATION ===");
        System.out.println(studentId + " | Salary: " + salary);
        System.out.println(studentId + " | Tax Rate: " + rate);
        System.out.println(studentId + " | Credits: " + credits);
        System.out.println(studentId + " | Calculated Tax: " + tax);
        System.out.println(studentId + " | Receipt No: " + taxRecord.getReceiptNo());
        System.out.println(studentId + " | Total Tax: " + taxRecord.getTotalTax());
    }
}