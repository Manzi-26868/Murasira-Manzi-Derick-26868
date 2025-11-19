package ID_26868.question2;

public class Booking extends Passenger {
    private String bookingDate;
    private String seatNumber;
    private String travelClass;

    public Booking(int id, String createdDate, String updatedDate,
                   String airportName, String code, String location,
                   String airlineName, String airlineCode, String contactEmail,
                   String flightNumber, String departure, String destination, double baseFare,
                   String pilotName, String licenseNumber, int experienceYears,
                   String crewName, String role, String shift,
                   String passengerName, int age, String gender, String contact,
                   String bookingDate, String seatNumber, String travelClass) {
        super(id, createdDate, updatedDate, airportName, code, location,
                airlineName, airlineCode, contactEmail, flightNumber, departure, destination, baseFare,
                pilotName, licenseNumber, experienceYears, crewName, role, shift,
                passengerName, age, gender, contact);
        setBookingDate(bookingDate);
        setSeatNumber(seatNumber);
        setTravelClass(travelClass);
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(String bookingDate) {
        if (bookingDate == null || bookingDate.trim().isEmpty()) {
            throw new IllegalArgumentException("Booking date cannot be null or empty");
        }
        this.bookingDate = bookingDate;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        if (seatNumber == null || seatNumber.trim().isEmpty()) {
            throw new IllegalArgumentException("Seat number cannot be empty");
        }
        this.seatNumber = seatNumber;
    }

    public String getTravelClass() {
        return travelClass;
    }

    public void setTravelClass(String travelClass) {
        if (travelClass == null || (!travelClass.equalsIgnoreCase("Economy") &&
                !travelClass.equalsIgnoreCase("Business") &&
                !travelClass.equalsIgnoreCase("First"))) {
            throw new IllegalArgumentException("Travel class must be Economy, Business, or First");
        }
        this.travelClass = travelClass;
    }

    public String toString() {
        return "Booking{" +
                "id=" + getId() +
                ", bookingDate='" + bookingDate + '\'' +
                ", seatNumber='" + seatNumber + '\'' +
                ", travelClass='" + travelClass + '\'' +
                ", passengerName='" + getPassengerName() + '\'' +
                ", age=" + getAge() +
                ", gender='" + getGender() + '\'' +
                ", contact='" + getContact() + '\'' +
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
