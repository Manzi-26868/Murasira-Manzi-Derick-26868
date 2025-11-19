package ID_26868.question2;

public class Passenger extends CabinCrew {
    private String passengerName;
    private int age;
    private String gender;
    private String contact;


    public Passenger(int id, String createdDate, String updatedDate,
                     String airportName, String code, String location,
                     String airlineName, String airlineCode, String contactEmail,
                     String flightNumber, String departure, String destination, double baseFare,
                     String pilotName, String licenseNumber, int experienceYears,
                     String crewName, String role, String shift,
                     String passengerName, int age, String gender, String contact) {
        super(id, createdDate, updatedDate, airportName, code, location,
                airlineName, airlineCode, contactEmail, flightNumber, departure, destination, baseFare,
                pilotName, licenseNumber, experienceYears, crewName, role, shift);
        setPassengerName(passengerName);
        setAge(age);
        setGender(gender);
        setContact(contact);
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        if (passengerName == null || passengerName.trim().isEmpty()) {
            throw new IllegalArgumentException("Passenger name cannot be empty");
        }
        this.passengerName = passengerName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0) {
            throw new IllegalArgumentException("Age must be greater than 0");
        }
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if (gender == null || (!gender.equalsIgnoreCase("Male") &&
                !gender.equalsIgnoreCase("Female") &&
                !gender.equalsIgnoreCase("Other"))) {
            throw new IllegalArgumentException("Gender must be Male, Female, or Other");
        }
        this.gender = gender;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        if (contact == null || contact.trim().isEmpty()) {
            throw new IllegalArgumentException("Contact cannot be empty");
        }
        this.contact = contact;
    }

    public String toString() {
        return "Passenger{" +
                "id=" + getId() +
                ", passengerName='" + passengerName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", contact='" + contact + '\'' +
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
