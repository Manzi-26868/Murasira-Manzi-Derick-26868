package ID_26868.question2;

import java.util.Scanner;

public class Main2 {
    private static final String STUDENT_ID = "26868";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println(STUDENT_ID + " |    FLIGHT BOOKING SYSTEM");

            System.out.print(STUDENT_ID + " | Enter Entity ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.print(STUDENT_ID + " | Enter Created Date: ");
            String createdDate = scanner.nextLine();
            System.out.print(STUDENT_ID + " | Enter Updated Date: ");
            String updatedDate = scanner.nextLine();

            System.out.println("\n" + STUDENT_ID + " | --- Airport Information ---");
            System.out.print(STUDENT_ID + " | Enter Airport Name: ");
            String airportName = scanner.nextLine();
            System.out.print(STUDENT_ID + " | Enter Airport Code (3 uppercase letters): ");
            String airportCode = scanner.nextLine();
            System.out.print(STUDENT_ID + " | Enter Airport Location: ");
            String location = scanner.nextLine();

            System.out.println("\n" + STUDENT_ID + " | --- Airline Information ---");
            System.out.print(STUDENT_ID + " | Enter Airline Name: ");
            String airlineName = scanner.nextLine();
            System.out.print(STUDENT_ID + " | Enter Airline Code: ");
            String airlineCode = scanner.nextLine();
            System.out.print(STUDENT_ID + " | Enter Airline Contact Email: ");
            String contactEmail = scanner.nextLine();

            System.out.println("\n" + STUDENT_ID + " | --- Flight Information ---");
            System.out.print(STUDENT_ID + " | Enter Flight Number: ");
            String flightNumber = scanner.nextLine();
            System.out.print(STUDENT_ID + " | Enter Departure City: ");
            String departure = scanner.nextLine();
            System.out.print(STUDENT_ID + " | Enter Destination City: ");
            String destination = scanner.nextLine();
            System.out.print(STUDENT_ID + " | Enter Base Fare: ");
            double baseFare = scanner.nextDouble();
            scanner.nextLine();

            System.out.println("\n" + STUDENT_ID + " | --- Pilot Information ---");
            System.out.print(STUDENT_ID + " | Enter Pilot Name: ");
            String pilotName = scanner.nextLine();
            System.out.print(STUDENT_ID + " | Enter License Number: ");
            String licenseNumber = scanner.nextLine();
            System.out.print(STUDENT_ID + " | Enter Experience Years (minimum 2): ");
            int experienceYears = scanner.nextInt();
            scanner.nextLine();

            System.out.println("\n" + STUDENT_ID + " | --- Cabin Crew Information ---");
            System.out.print(STUDENT_ID + " | Enter Crew Name: ");
            String crewName = scanner.nextLine();
            System.out.print(STUDENT_ID + " | Enter Role: ");
            String role = scanner.nextLine();
            System.out.print(STUDENT_ID + " | Enter Shift (Day/Night): ");
            String shift = scanner.nextLine();

            System.out.println("\n" + STUDENT_ID + " | --- Passenger Information ---");
            System.out.print(STUDENT_ID + " | Enter Passenger Name: ");
            String passengerName = scanner.nextLine();
            System.out.print(STUDENT_ID + " | Enter Age: ");
            int age = scanner.nextInt();
            scanner.nextLine();
            System.out.print(STUDENT_ID + " | Enter Gender (Male/Female/Other): ");
            String gender = scanner.nextLine();
            System.out.print(STUDENT_ID + " | Enter Contact Number: ");
            String contact = scanner.nextLine();

            System.out.println("\n" + STUDENT_ID + " | --- Booking Information ---");
            System.out.print(STUDENT_ID + " | Enter Booking Date (e.g., 2024-01-15): ");
            String bookingDate = scanner.nextLine();
            System.out.print(STUDENT_ID + " | Enter Seat Number (e.g., 12A): ");
            String seatNumber = scanner.nextLine();
            System.out.print(STUDENT_ID + " | Enter Travel Class (Economy/Business/First): ");
            String travelClass = scanner.nextLine();

            System.out.println("\n" + STUDENT_ID + " | --- Payment Information ---");
            System.out.print(STUDENT_ID + " | Enter Payment Date (e.g., 2024-01-15): ");
            String paymentDate = scanner.nextLine();
            System.out.print(STUDENT_ID + " | Enter Payment Method (e.g., Credit Card, Cash): ");
            String paymentMethod = scanner.nextLine();
            System.out.print(STUDENT_ID + " | Enter Amount Paid ($): ");
            double amountPaid = scanner.nextDouble();
            scanner.nextLine();

            System.out.println("\n" + STUDENT_ID + " | --- Ticket Information ---");
            System.out.print(STUDENT_ID + " | Enter Ticket Number: ");
            String ticketNumber = scanner.nextLine();
            System.out.print(STUDENT_ID + " | Enter Issue Date (e.g., 2024-01-15): ");
            String issueDate = scanner.nextLine();

            Ticket ticket = new Ticket(
                    id, createdDate, updatedDate,
                    airportName, airportCode, location,
                    airlineName, airlineCode, contactEmail,
                    flightNumber, departure, destination, baseFare,
                    pilotName, licenseNumber, experienceYears,
                    crewName, role, shift,
                    passengerName, age, gender, contact,
                    bookingDate, seatNumber, travelClass,
                    paymentDate, paymentMethod, amountPaid,
                    ticketNumber, issueDate
            );

            // Display the ticket with student ID
            System.out.println("\n" + "=".repeat(50));
            System.out.println(STUDENT_ID + " |        FLIGHT BOOKING SUMMARY");
            System.out.println("=".repeat(50));
            displayTicketWithStudentID(ticket, STUDENT_ID);

        } catch (Exception e) {
            System.out.println("\n" + STUDENT_ID + " | Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    // Custom method to display ticket information with student ID
    private static void displayTicketWithStudentID(Ticket ticket, String studentId) {
        System.out.println(studentId + " | Entity ID: " + ticket.getId());
        System.out.println(studentId + " | Created Date: " + ticket.getCreatedDate());
        System.out.println(studentId + " | Updated Date: " + ticket.getUpdatedDate());

        System.out.println("\n" + studentId + " | Airport: " + ticket.getAirportName() +
                " (" + ticket.getAirportCode() + ") - " + ticket.getLocation());
        System.out.println(studentId + " | Airline: " + ticket.getAirlineName() +
                " (" + ticket.getAirlineCode() + ")");
        System.out.println(studentId + " | Flight: " + ticket.getFlightNumber() +
                " | " + ticket.getDeparture() + " → " + ticket.getDestination());
        System.out.println(studentId + " | Base Fare: $" + ticket.getBaseFare());

        System.out.println("\n" + studentId + " | Pilot: " + ticket.getPilotName() +
                " | License: " + ticket.getLicenseNumber() +
                " | Experience: " + ticket.getExperienceYears() + " years");
        System.out.println(studentId + " | Cabin Crew: " + ticket.getCrewName() +
                " | Role: " + ticket.getRole() + " | Shift: " + ticket.getShift());

        System.out.println("\n" + studentId + " | Passenger: " + ticket.getPassengerName());
        System.out.println(studentId + " | Age: " + ticket.getAge() + " | Gender: " + ticket.getGender());
        System.out.println(studentId + " | Contact: " + ticket.getContact());

        System.out.println("\n" + studentId + " | Booking Date: " + ticket.getBookingDate());
        System.out.println(studentId + " | Seat: " + ticket.getSeatNumber() + " | Class: " + ticket.getTravelClass());

        System.out.println("\n" + studentId + " | Payment Date: " + ticket.getPaymentDate());
        System.out.println(studentId + " | Payment Method: " + ticket.getPaymentMethod());
        System.out.println(studentId + " | Amount Paid: $" + ticket.getAmountPaid());

        System.out.println("\n" + studentId + " | Ticket Number: " + ticket.getTicketNumber());
        System.out.println(studentId + " | Issue Date: " + ticket.getIssueDate());

        // Calculate and display final fare
        double taxes = ticket.getBaseFare() * 0.15; // 15% taxes
        double discounts = calculateDiscount(ticket.getBaseFare(), ticket.getTravelClass());
        double finalFare = ticket.calculateFare(ticket.getBaseFare(), taxes, discounts);

        System.out.println("\n" + studentId + " | === FARE CALCULATION ===");
        System.out.println(studentId + " | Base Fare: $" + ticket.getBaseFare());
        System.out.println(studentId + " | Taxes (15%): $" + taxes);
        System.out.println(studentId + " | Discounts: $" + discounts);
        System.out.println(studentId + " | Final Fare: $" + finalFare);
        System.out.println("=".repeat(50));
    }

    private static double calculateDiscount(double baseFare, String travelClass) {
        switch (travelClass.toLowerCase()) {
            case "business":
                return baseFare * 0.10; // 10% discount
            case "first":
                return baseFare * 0.15; // 15% discount
            default:
                return baseFare * 0.05; // 5% discount for economy
        }
    }
}