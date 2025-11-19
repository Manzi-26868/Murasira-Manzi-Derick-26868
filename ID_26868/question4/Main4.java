package ID_26868.question4;

import java.util.Scanner;

public class Main4 {
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

        System.out.print(STUDENT_ID + " | Enter Address: ");
        String address = sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Contact Email: ");
        String contactEmail = sc.nextLine();

        Organizations organization = new Organizations(
                orgId, orgCreated, orgUpdated,
                orgName, address, contactEmail
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

        Department department = new Department(
                deptId, deptCreated, deptUpdated,
                deptName, deptCode
        );

        System.out.println("\n" + STUDENT_ID + " | DEPARTMENT CREATED SUCCESSFULLY\n");

        // ------------------ SUPPLIER INPUT ------------------
        System.out.println(STUDENT_ID + " | Enter Supplier Details:");

        System.out.print(STUDENT_ID + " | Enter Supplier ID: ");
        int supId = sc.nextInt();
        sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Supplier Created Date: ");
        String supCreated = sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Supplier Updated Date: ");
        String supUpdated = sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Supplier Name: ");
        String supName = sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Supplier TIN (9 digits): ");
        String supTIN = sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Contact Number: ");
        String contact = sc.nextLine();

        Supplier supplier = new Supplier(
                supId, supCreated, supUpdated,
                supName, supTIN, contact
        );

        System.out.println("\n" + STUDENT_ID + " | SUPPLIER CREATED SUCCESSFULLY\n");

        // ------------------ PRODUCT INPUT ------------------
        System.out.println(STUDENT_ID + " | Enter Product Details:");

        System.out.print(STUDENT_ID + " | Enter Product ID: ");
        int prodId = sc.nextInt();
        sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Product Created Date: ");
        String prodCreated = sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Product Updated Date: ");
        String prodUpdated = sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Product Name: ");
        String prodName = sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Unit Price: ");
        double unitPrice = sc.nextDouble();

        System.out.print(STUDENT_ID + " | Enter Quantity: ");
        int quantity = sc.nextInt();
        sc.nextLine();

        Product product = new Product(
                prodId, prodCreated, prodUpdated,
                prodName, unitPrice, quantity
        );

        System.out.println("\n" + STUDENT_ID + " | PRODUCT CREATED SUCCESSFULLY\n");

        // ------------------ PURCHASE ORDER INPUT ------------------
        System.out.println(STUDENT_ID + " | Enter Purchase Order Details:");

        System.out.print(STUDENT_ID + " | Enter Purchase Order ID: ");
        int poId = sc.nextInt();
        sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter PO Created Date: ");
        String poCreated = sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter PO Updated Date: ");
        String poUpdated = sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter PO Number: ");
        String poNumber = sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Order Date: ");
        String orderDate = sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Total Amount: ");
        double totalAmount = sc.nextDouble();
        sc.nextLine();

        PurchaseOrder purchaseOrder = new PurchaseOrder(
                poId, poCreated, poUpdated,
                poNumber, orderDate, totalAmount
        );

        System.out.println("\n" + STUDENT_ID + " | PURCHASE ORDER CREATED SUCCESSFULLY\n");

        // ------------------ DELIVERY INPUT ------------------
        System.out.println(STUDENT_ID + " | Enter Delivery Details:");

        System.out.print(STUDENT_ID + " | Enter Delivery ID: ");
        int delId = sc.nextInt();
        sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Delivery Created Date: ");
        String delCreated = sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Delivery Updated Date: ");
        String delUpdated = sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Delivery Date: ");
        String deliveryDate = sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Delivered By: ");
        String deliveredBy = sc.nextLine();

        Delivery delivery = new Delivery(
                delId, delCreated, delUpdated,
                deliveryDate, deliveredBy
        );

        System.out.println("\n" + STUDENT_ID + " | DELIVERY CREATED SUCCESSFULLY\n");

        // ------------------ INSPECTION INPUT ------------------
        System.out.println(STUDENT_ID + " | Enter Inspection Details:");

        System.out.print(STUDENT_ID + " | Enter Inspection ID: ");
        int inspId = sc.nextInt();
        sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Inspection Created Date: ");
        String inspCreated = sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Inspection Updated Date: ");
        String inspUpdated = sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Inspection Name: ");
        String inspectionName = sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Status (Passed/Failed): ");
        String status = sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Remarks: ");
        String remarks = sc.nextLine();

        Inspection inspection = new Inspection(
                inspId, inspCreated, inspUpdated,
                inspectionName, status, remarks
        );

        System.out.println("\n" + STUDENT_ID + " | INSPECTION CREATED SUCCESSFULLY\n");

        // ------------------ INVOICE INPUT ------------------
        System.out.println(STUDENT_ID + " | Enter Invoice Details:");

        System.out.print(STUDENT_ID + " | Enter Invoice ID: ");
        int invId = sc.nextInt();
        sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Invoice Created Date: ");
        String invCreated = sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Invoice Updated Date: ");
        String invUpdated = sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Invoice Number: ");
        String invoiceNo = sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Invoice Amount: ");
        double invoiceAmount = sc.nextDouble();
        sc.nextLine();

        Invoice invoice = new Invoice(
                invId, invCreated, invUpdated,
                invoiceNo, invoiceAmount
        );

        System.out.println("\n" + STUDENT_ID + " | INVOICE CREATED SUCCESSFULLY\n");

        // ------------------ PROCUREMENT REPORT INPUT ------------------
        System.out.println(STUDENT_ID + " | Enter Procurement Report Details:");

        System.out.print(STUDENT_ID + " | Enter Report ID: ");
        int reportId = sc.nextInt();
        sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Report Created Date: ");
        String reportCreated = sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Report Updated Date: ");
        String reportUpdated = sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Report Date: ");
        String reportDate = sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Summary: ");
        String summary = sc.nextLine();

        ProcurementReport procurementReport = new ProcurementReport(
                reportId, reportCreated, reportUpdated,
                reportDate, summary
        );

        System.out.println("\n" + STUDENT_ID + " | PROCUREMENT REPORT CREATED SUCCESSFULLY\n");

        // ------------------ DISPLAY RESULTS ------------------
        System.out.println(STUDENT_ID + " | === PROCUREMENT MANAGEMENT SYSTEM SUMMARY ===");

        System.out.println("\n" + STUDENT_ID + " | Organization Info:");
        System.out.println(STUDENT_ID + " | Name: " + organization.getOrgName());
        System.out.println(STUDENT_ID + " | Address: " + organization.getAddress());
        System.out.println(STUDENT_ID + " | Email: " + organization.getContactEmail());

        System.out.println("\n" + STUDENT_ID + " | Department Info:");
        System.out.println(STUDENT_ID + " | Name: " + department.getDeptName());
        System.out.println(STUDENT_ID + " | Code: " + department.getDeptCode());

        System.out.println("\n" + STUDENT_ID + " | Supplier Info:");
        System.out.println(STUDENT_ID + " | Name: " + supplier.getSupplierName());
        System.out.println(STUDENT_ID + " | TIN: " + supplier.getSupplierTIN());
        System.out.println(STUDENT_ID + " | Contact: " + supplier.getContact());

        System.out.println("\n" + STUDENT_ID + " | Product Info:");
        System.out.println(STUDENT_ID + " | Name: " + product.getProductName());
        System.out.println(STUDENT_ID + " | Unit Price: " + product.getUnitPrice());
        System.out.println(STUDENT_ID + " | Quantity: " + product.getQuantity());

        System.out.println("\n" + STUDENT_ID + " | Purchase Order Info:");
        System.out.println(STUDENT_ID + " | PO Number: " + purchaseOrder.getPoNumber());
        System.out.println(STUDENT_ID + " | Order Date: " + purchaseOrder.getOrderDate());
        System.out.println(STUDENT_ID + " | Total Amount: " + purchaseOrder.getTotalAmount());

        System.out.println("\n" + STUDENT_ID + " | Delivery Info:");
        System.out.println(STUDENT_ID + " | Delivery Date: " + delivery.getDeliveryDate());
        System.out.println(STUDENT_ID + " | Delivered By: " + delivery.getDeliveredBy());

        System.out.println("\n" + STUDENT_ID + " | Inspection Info:");
        System.out.println(STUDENT_ID + " | Inspection Name: " + inspection.getInspectionName());
        System.out.println(STUDENT_ID + " | Status: " + inspection.getStatus());
        System.out.println(STUDENT_ID + " | Remarks: " + inspection.getRemarks());

        System.out.println("\n" + STUDENT_ID + " | Invoice Info:");
        System.out.println(STUDENT_ID + " | Invoice Number: " + invoice.getInvoiceNo());
        System.out.println(STUDENT_ID + " | Invoice Amount: " + invoice.getInvoiceAmount());

        System.out.println("\n" + STUDENT_ID + " | Procurement Report Info:");
        System.out.println(STUDENT_ID + " | Report Date: " + procurementReport.getReportDate());
        System.out.println(STUDENT_ID + " | Summary: " + procurementReport.getSummary());

        // Generate procurement report
        generateProcurementReport(procurementReport, invoiceAmount, STUDENT_ID);

        sc.close();
    }

    private static void generateProcurementReport(ProcurementReport report, double invoiceAmount, String studentId) {
        System.out.println("\n" + studentId + " | === PROCUREMENT FINAL REPORT ===");
        System.out.println(studentId + " | Report Date: " + report.getReportDate());
        System.out.println(studentId + " | Summary: " + report.getSummary());

        double[] invoiceAmounts = {invoiceAmount};
        double totalAmount = report.calculateTotal(invoiceAmounts);

        System.out.println(studentId + " | Total Invoice Amount: " + totalAmount);
        System.out.println(studentId + " | Report generated successfully!");

        // Generate report using class method
        report.generateReport();
    }
}