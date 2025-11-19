package ID_26868.question6;

import java.util.Scanner;

public class Main6 {
    private static final String STUDENT_ID = "26868";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ------------------ ORGANIZATION INPUT ------------------
        System.out.println(STUDENT_ID + " | Enter Organization Details:");

        System.out.print(STUDENT_ID + " | Enter Organization ID: ");
        int orgId = sc.nextInt();
        sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Created Date: ");
        String orgCreated = sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Updated Date: ");
        String orgUpdated = sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Organization Name: ");
        String orgName = sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Organization Code: ");
        String orgCode = sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter RSSB Number (8 digits): ");
        String rssbNumber = sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Contact Email: ");
        String contactEmail = sc.nextLine();

        Organization organization = new Organization(
                orgId, orgCreated, orgUpdated,
                orgName, orgCode, rssbNumber, contactEmail
        );

        System.out.println("\n" + STUDENT_ID + " | ORGANIZATION CREATED SUCCESSFULLY\n");

        // ------------------ DEPARTMENT INPUT ------------------
        System.out.println(STUDENT_ID + " | Enter Department Details:");

        System.out.print(STUDENT_ID + " | Enter Department ID: ");
        int deptId = sc.nextInt();
        sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Department Created Date: ");
        String deptCreated = sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Department Updated Date: ");
        String deptUpdated = sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Department Name: ");
        String deptName = sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Department Code: ");
        String deptCode = sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Manager Name: ");
        String managerName = sc.nextLine();

        Department department = new Department(
                deptId, deptCreated, deptUpdated,
                deptName, deptCode, managerName
        );

        System.out.println("\n" + STUDENT_ID + " | DEPARTMENT CREATED SUCCESSFULLY\n");

        // ------------------ EMPLOYEE INPUT ------------------
        System.out.println(STUDENT_ID + " | Enter Employee Details:");

        System.out.print(STUDENT_ID + " | Enter Employee ID: ");
        int empId = sc.nextInt();
        sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Employee Created Date: ");
        String empCreated = sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Employee Updated Date: ");
        String empUpdated = sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Employee Number (≥1000): ");
        int employeeID = sc.nextInt();
        sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Full Name: ");
        String fullName = sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Position: ");
        String position = sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Base Salary: ");
        double baseSalary = sc.nextDouble();

        System.out.print(STUDENT_ID + " | Is RSSB Registered? (true/false): ");
        boolean rssbRegistered = sc.nextBoolean();
        sc.nextLine();

        Employee employee = new Employee(
                empId, empCreated, empUpdated,
                employeeID, fullName, position, baseSalary, rssbRegistered
        );

        System.out.println("\n" + STUDENT_ID + " | EMPLOYEE CREATED SUCCESSFULLY\n");

        // ------------------ PAYROLL PERIOD INPUT ------------------
        System.out.println(STUDENT_ID + " | Enter Payroll Period Details:");

        System.out.print(STUDENT_ID + " | Enter Payroll Period ID: ");
        int periodId = sc.nextInt();
        sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Period Created Date: ");
        String periodCreated = sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Period Updated Date: ");
        String periodUpdated = sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Month (1-12): ");
        int month = sc.nextInt();

        System.out.print(STUDENT_ID + " | Enter Year (≥2000): ");
        int year = sc.nextInt();
        sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Start Date: ");
        String startDate = sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter End Date: ");
        String endDate = sc.nextLine();

        PayrollPeriod payrollPeriod = new PayrollPeriod(
                periodId, periodCreated, periodUpdated,
                month, year, startDate, endDate
        );

        System.out.println("\n" + STUDENT_ID + " | PAYROLL PERIOD CREATED SUCCESSFULLY\n");

        // ------------------ SALARY STRUCTURE INPUT ------------------
        System.out.println(STUDENT_ID + " | Enter Salary Structure Details:");

        System.out.print(STUDENT_ID + " | Enter Salary Structure ID: ");
        int salaryId = sc.nextInt();
        sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Salary Created Date: ");
        String salaryCreated = sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Salary Updated Date: ");
        String salaryUpdated = sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Basic Pay: ");
        double basicPay = sc.nextDouble();

        System.out.print(STUDENT_ID + " | Enter Transport Allowance: ");
        double transportAllowance = sc.nextDouble();

        System.out.print(STUDENT_ID + " | Enter Housing Allowance: ");
        double housingAllowance = sc.nextDouble();
        sc.nextLine();

        SalaryStructure salaryStructure = new SalaryStructure(
                salaryId, salaryCreated, salaryUpdated,
                basicPay, transportAllowance, housingAllowance
        );

        System.out.println("\n" + STUDENT_ID + " | SALARY STRUCTURE CREATED SUCCESSFULLY\n");

        // ------------------ DEDUCTION INPUT ------------------
        System.out.println(STUDENT_ID + " | Enter Deduction Details:");

        System.out.print(STUDENT_ID + " | Enter Deduction ID: ");
        int dedId = sc.nextInt();
        sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Deduction Created Date: ");
        String dedCreated = sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Deduction Updated Date: ");
        String dedUpdated = sc.nextLine();

        double rssbContribution = basicPay * 0.05; // 5% RSSB contribution
        System.out.println(STUDENT_ID + " | RSSB Contribution (5% of basic pay): " + rssbContribution);

        System.out.print(STUDENT_ID + " | Enter PAYE Tax: ");
        double payeTax = sc.nextDouble();

        System.out.print(STUDENT_ID + " | Enter Loan Deduction: ");
        double loanDeduction = sc.nextDouble();
        sc.nextLine();

        Deduction deduction = new Deduction(
                dedId, dedCreated, dedUpdated,
                rssbContribution, payeTax, loanDeduction
        );

        System.out.println("\n" + STUDENT_ID + " | DEDUCTION CREATED SUCCESSFULLY\n");

        // ------------------ ALLOWANCE INPUT ------------------
        System.out.println(STUDENT_ID + " | Enter Allowance Details:");

        System.out.print(STUDENT_ID + " | Enter Allowance ID: ");
        int allowId = sc.nextInt();
        sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Allowance Created Date: ");
        String allowCreated = sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Allowance Updated Date: ");
        String allowUpdated = sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Overtime Hours: ");
        double overtimeHours = sc.nextDouble();

        System.out.print(STUDENT_ID + " | Enter Overtime Rate: ");
        double overtimeRate = sc.nextDouble();

        System.out.print(STUDENT_ID + " | Enter Bonus: ");
        double bonus = sc.nextDouble();
        sc.nextLine();

        Allowance allowance = new Allowance(
                allowId, allowCreated, allowUpdated,
                overtimeHours, overtimeRate, bonus
        );

        System.out.println("\n" + STUDENT_ID + " | ALLOWANCE CREATED SUCCESSFULLY\n");

        // ------------------ PAYROLL INPUT ------------------
        System.out.println(STUDENT_ID + " | Enter Payroll Details:");

        System.out.print(STUDENT_ID + " | Enter Payroll ID: ");
        int payrollId = sc.nextInt();
        sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Payroll Created Date: ");
        String payrollCreated = sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Payroll Updated Date: ");
        String payrollUpdated = sc.nextLine();

        // Calculate payroll values
        double totalAllowances = salaryStructure.getTotalAllowances() + allowance.getTotalExtraAllowances();
        double totalDeductions = deduction.getTotalDeductions();
        double grossSalary = basicPay + totalAllowances;
        double netSalary = grossSalary - totalDeductions;

        System.out.println(STUDENT_ID + " | Calculated Gross Salary: " + grossSalary);
        System.out.println(STUDENT_ID + " | Calculated Total Deductions: " + totalDeductions);
        System.out.println(STUDENT_ID + " | Calculated Net Salary: " + netSalary);

        Payroll payroll = new Payroll(
                payrollId, payrollCreated, payrollUpdated,
                grossSalary, totalDeductions, netSalary
        );

        System.out.println("\n" + STUDENT_ID + " | PAYROLL CREATED SUCCESSFULLY\n");

        // ------------------ PAYSLIP INPUT ------------------
        System.out.println(STUDENT_ID + " | Enter Payslip Details:");

        System.out.print(STUDENT_ID + " | Enter Payslip ID: ");
        int payslipId = sc.nextInt();
        sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Payslip Created Date: ");
        String payslipCreated = sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Payslip Updated Date: ");
        String payslipUpdated = sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Payslip Number: ");
        String payslipNumber = sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Issue Date: ");
        String issueDate = sc.nextLine();

        Payslip payslip = new Payslip(
                payslipId, payslipCreated, payslipUpdated,
                payslipNumber, issueDate
        );

        System.out.println("\n" + STUDENT_ID + " | PAYSLIP CREATED SUCCESSFULLY\n");

        // ------------------ DISPLAY RESULTS ------------------
        System.out.println(STUDENT_ID + " | === PAYROLL MANAGEMENT SYSTEM SUMMARY ===");

        System.out.println("\n" + STUDENT_ID + " | Organization Info:");
        System.out.println(STUDENT_ID + " | Name: " + organization.getOrgName());
        System.out.println(STUDENT_ID + " | Code: " + organization.getOrgCode());
        System.out.println(STUDENT_ID + " | RSSB Number: " + organization.getRssbNumber());
        System.out.println(STUDENT_ID + " | Email: " + organization.getContactEmail());

        System.out.println("\n" + STUDENT_ID + " | Department Info:");
        System.out.println(STUDENT_ID + " | Name: " + department.getDeptName());
        System.out.println(STUDENT_ID + " | Code: " + department.getDeptCode());
        System.out.println(STUDENT_ID + " | Manager: " + department.getManagerName());

        System.out.println("\n" + STUDENT_ID + " | Employee Info:");
        System.out.println(STUDENT_ID + " | Name: " + employee.getFullName());
        System.out.println(STUDENT_ID + " | Employee ID: " + employee.getEmployeeID());
        System.out.println(STUDENT_ID + " | Position: " + employee.getPosition());
        System.out.println(STUDENT_ID + " | Base Salary: " + employee.getBaseSalary());
        System.out.println(STUDENT_ID + " | RSSB Registered: " + employee.isRssbRegistered());

        System.out.println("\n" + STUDENT_ID + " | Payroll Period Info:");
        System.out.println(STUDENT_ID + " | Period: " + payrollPeriod.getMonth() + "/" + payrollPeriod.getYear());
        System.out.println(STUDENT_ID + " | Start Date: " + payrollPeriod.getStartDate());
        System.out.println(STUDENT_ID + " | End Date: " + payrollPeriod.getEndDate());

        System.out.println("\n" + STUDENT_ID + " | Salary Structure Info:");
        System.out.println(STUDENT_ID + " | Basic Pay: " + salaryStructure.getBasicPay());
        System.out.println(STUDENT_ID + " | Transport Allowance: " + salaryStructure.getTransportAllowance());
        System.out.println(STUDENT_ID + " | Housing Allowance: " + salaryStructure.getHousingAllowance());
        System.out.println(STUDENT_ID + " | Total Allowances: " + salaryStructure.getTotalAllowances());

        System.out.println("\n" + STUDENT_ID + " | Deduction Info:");
        System.out.println(STUDENT_ID + " | RSSB Contribution: " + deduction.getRssbContribution());
        System.out.println(STUDENT_ID + " | PAYE Tax: " + deduction.getPayeTax());
        System.out.println(STUDENT_ID + " | Loan Deduction: " + deduction.getLoanDeduction());
        System.out.println(STUDENT_ID + " | Total Deductions: " + deduction.getTotalDeductions());

        System.out.println("\n" + STUDENT_ID + " | Allowance Info:");
        System.out.println(STUDENT_ID + " | Overtime Hours: " + allowance.getOvertimeHours());
        System.out.println(STUDENT_ID + " | Overtime Rate: " + allowance.getOvertimeRate());
        System.out.println(STUDENT_ID + " | Bonus: " + allowance.getBonus());
        System.out.println(STUDENT_ID + " | Overtime Amount: " + allowance.getOvertimeAmount());
        System.out.println(STUDENT_ID + " | Total Extra Allowances: " + allowance.getTotalExtraAllowances());

        System.out.println("\n" + STUDENT_ID + " | Payroll Info:");
        System.out.println(STUDENT_ID + " | Gross Salary: " + payroll.getGrossSalary());
        System.out.println(STUDENT_ID + " | Total Deductions: " + payroll.getTotalDeductions());
        System.out.println(STUDENT_ID + " | Net Salary: " + payroll.getNetSalary());

        System.out.println("\n" + STUDENT_ID + " | Payslip Info:");
        System.out.println(STUDENT_ID + " | Payslip Number: " + payslip.getPayslipNumber());
        System.out.println(STUDENT_ID + " | Issue Date: " + payslip.getIssueDate());

        // Generate payslip
        generatePayslipReport(payslip, payroll, employee, STUDENT_ID);

        sc.close();
    }

    private static void generatePayslipReport(Payslip payslip, Payroll payroll, Employee employee, String studentId) {
        System.out.println("\n" + studentId + " | === PAYSLIP FINAL REPORT ===");
        System.out.println(studentId + " | Payslip Number: " + payslip.getPayslipNumber());
        System.out.println(studentId + " | Issue Date: " + payslip.getIssueDate());
        System.out.println(studentId + " | Employee: " + employee.getFullName() + " (ID: " + employee.getEmployeeID() + ")");
        System.out.println(studentId + " | Position: " + employee.getPosition());
        System.out.println(studentId + " | Gross Salary: " + payroll.getGrossSalary());
        System.out.println(studentId + " | Total Deductions: " + payroll.getTotalDeductions());
        System.out.println(studentId + " | Net Salary: " + payroll.getNetSalary());
        System.out.println(studentId + " | RSSB Registered: " + employee.isRssbRegistered());
        System.out.println(studentId + " | Report generated successfully!");

        // Generate payslip using class method
        payslip.generatePayslip();
    }
}