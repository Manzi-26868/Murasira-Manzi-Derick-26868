package ID_26868.question1;

import java.util.Scanner;

public class Main {
    private static final String STUDENT_ID = "26868";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ------------------ CATEGORY INPUT ------------------
        System.out.println(STUDENT_ID + " | Enter Category Details:");

        System.out.print(STUDENT_ID + " | Enter Category ID: ");
        int cid = sc.nextInt();
        sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Created Date: ");
        String cCreated = sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Updated Date: ");
        String cUpdated = sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Warehouse Name: ");
        String wName = sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Warehouse Location: ");
        String wLoc = sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Warehouse Contact Number: ");
        String wPhone = sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Category Name: ");
        String catName = sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Category Code: ");
        String catCode = sc.nextLine();

        Category electronics = new Category(
                cid, cCreated, cUpdated,
                wName, wLoc, wPhone,
                catName, catCode
        );

        System.out.println("\n" + STUDENT_ID + " | CATEGORY CREATED SUCCESSFULLY\n");

        // ------------------ SUPPLIER INPUT ------------------
        System.out.println(STUDENT_ID + " | Enter Supplier Details:");

        System.out.print(STUDENT_ID + " | Enter Supplier ID: ");
        int sid = sc.nextInt();
        sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Supplier Created Date: ");
        String sCreated = sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Supplier Updated Date: ");
        String sUpdated = sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Supplier Name: ");
        String sName = sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Supplier Email: ");
        String sEmail = sc.nextLine();

        System.out.print(STUDENT_ID + " | Enter Supplier Phone: ");
        String sPhone = sc.nextLine();

        Supplier supplier1 = new Supplier(
                sid, sCreated, sUpdated,
                wName, wLoc, wPhone,
                catName, catCode,
                sName, sEmail, sPhone
        );

        System.out.println("\n" + STUDENT_ID + " | SUPPLIER CREATED SUCCESSFULLY\n");

        // ------------------ DISPLAY RESULTS ------------------
        System.out.println(STUDENT_ID + " | Category Info:");
        System.out.println(STUDENT_ID + " | Name: " + electronics.getCategoryName());
        System.out.println(STUDENT_ID + " | Code: " + electronics.getCategoryCode());
        System.out.println(STUDENT_ID + " | Warehouse: " + electronics.getWarehouseName());

        System.out.println("\n" + STUDENT_ID + " | Supplier Info:");
        System.out.println(STUDENT_ID + " | Name: " + supplier1.getSupplierName());
        System.out.println(STUDENT_ID + " | Email: " + supplier1.getSupplierEmail());
        System.out.println(STUDENT_ID + " | Phone: " + supplier1.getSupplierPhone());
        System.out.println(STUDENT_ID + " | Category: " + supplier1.getCategoryName());

        sc.close();
    }
}