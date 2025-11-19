package ID_26868.question2;

public class Pilot extends Flight {
    private String pilotName;
    private String licenseNumber;
    private int experienceYears;

    public Pilot(int id, String createdDate, String updatedDate,
                 String airportName, String code, String location,
                 String airlineName, String airlineCode, String contactEmail,
                 String flightNumber, String departure, String destination, double baseFare,
                 String pilotName, String licenseNumber, int experienceYears) {
        super(id, createdDate, updatedDate, airportName, code, location,
                airlineName, airlineCode, contactEmail, flightNumber, departure, destination, baseFare);
        setPilotName(pilotName);
        setLicenseNumber(licenseNumber);
        setExperienceYears(experienceYears);
    }

    public String getPilotName() {
        return pilotName;
    }

    public void setPilotName(String pilotName) {
        if (pilotName == null || pilotName.trim().isEmpty()) {
            throw new IllegalArgumentException("Pilot name cannot be empty");
        }
        this.pilotName = pilotName;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        if (licenseNumber == null || licenseNumber.trim().isEmpty()) {
            throw new IllegalArgumentException("License number cannot be empty");
        }
        this.licenseNumber = licenseNumber;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        if (experienceYears < 2) {
            throw new IllegalArgumentException("Experience years must be at least 2");
        }
        this.experienceYears = experienceYears;
    }

    public String toString() {
        return "Pilot{" +
                "id=" + getId() +
                ", pilotName='" + pilotName + '\'' +
                ", licenseNumber='" + licenseNumber + '\'' +
                ", experienceYears=" + experienceYears +
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
