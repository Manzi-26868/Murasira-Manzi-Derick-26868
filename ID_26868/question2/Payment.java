package ID_26868.question2;

public class Payment extends Booking {
    private String paymentDate;
    private String paymentMethod;
    private double amountPaid;

    public Payment(int id, String createdDate, String updatedDate,
                   String airportName, String code, String location,
                   String airlineName, String airlineCode, String contactEmail,
                   String flightNumber, String departure, String destination, double baseFare,
                   String pilotName, String licenseNumber, int experienceYears,
                   String crewName, String role, String shift,
                   String passengerName, int age, String gender, String contact,
                   String bookingDate, String seatNumber, String travelClass,
                   String paymentDate, String paymentMethod, double amountPaid) {
        super(id, createdDate, updatedDate, airportName, code, location,
                airlineName, airlineCode, contactEmail, flightNumber, departure, destination, baseFare,
                pilotName, licenseNumber, experienceYears, crewName, role, shift,
                passengerName, age, gender, contact, bookingDate, seatNumber, travelClass);
        setPaymentDate(paymentDate);
        setPaymentMethod(paymentMethod);
        setAmountPaid(amountPaid);
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        if (paymentDate == null || paymentDate.trim().isEmpty()) {
            throw new IllegalArgumentException("Payment date cannot be null or empty");
        }
        this.paymentDate = paymentDate;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        if (paymentMethod == null || paymentMethod.trim().isEmpty()) {
            throw new IllegalArgumentException("Payment method cannot be empty");
        }
        this.paymentMethod = paymentMethod;
    }

    public double getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(double amountPaid) {
        if (amountPaid <= 0) {
            throw new IllegalArgumentException("Amount paid must be greater than 0");
        }
        this.amountPaid = amountPaid;
    }

    public String toString() {
        return "Payment{" +
                "id=" + getId() +
                ", paymentDate='" + paymentDate + '\'' +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", amountPaid=" + amountPaid +
                ", bookingDate='" + getBookingDate() + '\'' +
                ", seatNumber='" + getSeatNumber() + '\'' +
                ", travelClass='" + getTravelClass() + '\'' +
                ", passengerName='" + getPassengerName() + '\'' +
                ", flightNumber='" + getFlightNumber() + '\'' +
                ", departure='" + getDeparture() + '\'' +
                ", destination='" + getDestination() + '\'' +
                ", baseFare=" + getBaseFare() +
                ", airlineName='" + getAirlineName() + '\'' +
                ", createdDate='" + getCreatedDate() + '\'' +
                ", updatedDate='" + getUpdatedDate() + '\'' +
                '}';
    }
}
