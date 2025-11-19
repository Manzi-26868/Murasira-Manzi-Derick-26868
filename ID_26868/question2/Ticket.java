package ID_26868.question2;

public class Ticket extends Payment {
    private String ticketNumber;
    private String issueDate;

    public Ticket(int id, String createdDate, String updatedDate,
                  String airportName, String code, String location,
                  String airlineName, String airlineCode, String contactEmail,
                  String flightNumber, String departure, String destination, double baseFare,
                  String pilotName, String licenseNumber, int experienceYears,
                  String crewName, String role, String shift,
                  String passengerName, int age, String gender, String contact,
                  String bookingDate, String seatNumber, String travelClass,
                  String paymentDate, String paymentMethod, double amountPaid,
                  String ticketNumber, String issueDate) {
        super(id, createdDate, updatedDate, airportName, code, location,
                airlineName, airlineCode, contactEmail, flightNumber, departure, destination, baseFare,
                pilotName, licenseNumber, experienceYears, crewName, role, shift,
                passengerName, age, gender, contact, bookingDate, seatNumber, travelClass,
                paymentDate, paymentMethod, amountPaid);
        setTicketNumber(ticketNumber);
        setIssueDate(issueDate);
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        if (ticketNumber == null || ticketNumber.trim().isEmpty()) {
            throw new IllegalArgumentException("Ticket number cannot be empty");
        }
        this.ticketNumber = ticketNumber;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        if (issueDate == null || issueDate.trim().isEmpty()) {
            throw new IllegalArgumentException("Issue date cannot be null or empty");
        }
        this.issueDate = issueDate;
    }

    public double calculateFare() {
        double fare = getBaseFare();


        String travelClass = getTravelClass();
        if (travelClass.equalsIgnoreCase("Business")) {
            fare *= 2.0;
        } else if (travelClass.equalsIgnoreCase("First")) {
            fare *= 3.0;
        }

        double taxes = fare * 0.15;
        fare += taxes;

        if (getAge() < 12) {
            fare *= 0.80;
        }

        return fare;
    }

    public void displayTicket() {
        System.out.println("\n========================================");
        System.out.println("         FLIGHT TICKET");
        System.out.println("========================================");
        System.out.println("Ticket Number: " + ticketNumber);
        System.out.println("Issue Date: " + issueDate);
        System.out.println("\n--- Passenger Information ---");
        System.out.println("Name: " + getPassengerName());
        System.out.println("Age: " + getAge());
        System.out.println("Gender: " + getGender());
        System.out.println("Contact: " + getContact());
        System.out.println("\n--- Flight Information ---");
        System.out.println("Flight Number: " + getFlightNumber());
        System.out.println("Airline: " + getAirlineName() + " (" + getAirlineCode() + ")");
        System.out.println("From: " + getDeparture());
        System.out.println("To: " + getDestination());
        System.out.println("Airport: " + getAirportName() + " (" + getCode() + ")");
        System.out.println("Location: " + getLocation());
        System.out.println("\n--- Booking Details ---");
        System.out.println("Booking Date: " + getBookingDate());
        System.out.println("Seat Number: " + getSeatNumber());
        System.out.println("Travel Class: " + getTravelClass());
        System.out.println("\n--- Crew Information ---");
        System.out.println("Pilot: " + getPilotName());
        System.out.println("License: " + getLicenseNumber());
        System.out.println("Experience: " + getExperienceYears() + " years");
        System.out.println("Cabin Crew: " + getCrewName());
        System.out.println("Role: " + getRole());
        System.out.println("Shift: " + getShift());
        System.out.println("\n--- Payment Information ---");
        System.out.println("Payment Date: " + getPaymentDate());
        System.out.println("Payment Method: " + getPaymentMethod());
        System.out.println("Amount Paid: $" + String.format("%.2f", getAmountPaid()));
        System.out.println("\n--- Fare Calculation ---");
        System.out.println("Base Fare: $" + String.format("%.2f", getBaseFare()));
        System.out.println("Total Fare: $" + String.format("%.2f", calculateFare()));
        System.out.println("\n--- Entity Information ---");
        System.out.println("Entity ID: " + getId());
        System.out.println("Created Date: " + getCreatedDate());
        System.out.println("Updated Date: " + getUpdatedDate());
        System.out.println("========================================\n");
    }

    public String toString() {
        return "Ticket{" +
                "id=" + getId() +
                ", ticketNumber='" + ticketNumber + '\'' +
                ", issueDate='" + issueDate + '\'' +
                ", totalFare=" + calculateFare() +
                ", passengerName='" + getPassengerName() + '\'' +
                ", flightNumber='" + getFlightNumber() + '\'' +
                ", departure='" + getDeparture() + '\'' +
                ", destination='" + getDestination() + '\'' +
                ", travelClass='" + getTravelClass() + '\'' +
                ", seatNumber='" + getSeatNumber() + '\'' +
                ", createdDate='" + getCreatedDate() + '\'' +
                ", updatedDate='" + getUpdatedDate() + '\'' +
                '}';
    }

    public double calculateFare(double baseFare, double taxes, double discounts) {

        return baseFare;
    }
}
