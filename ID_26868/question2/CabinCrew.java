package ID_26868.question2;

public class CabinCrew extends Pilot {
    private String crewName;
    private String role;
    private String shift;

    public CabinCrew(int id, String createdDate, String updatedDate,
                     String airportName, String code, String location,
                     String airlineName, String airlineCode, String contactEmail,
                     String flightNumber, String departure, String destination, double baseFare,
                     String pilotName, String licenseNumber, int experienceYears,
                     String crewName, String role, String shift) {
        super(id, createdDate, updatedDate, airportName, code, location,
                airlineName, airlineCode, contactEmail, flightNumber, departure, destination, baseFare,
                pilotName, licenseNumber, experienceYears);
        setCrewName(crewName);
        setRole(role);
        setShift(shift);
    }

    public String getCrewName() {
        return crewName;
    }

    public void setCrewName(String crewName) {
        if (crewName == null || crewName.trim().isEmpty()) {
            throw new IllegalArgumentException("Crew name cannot be empty");
        }
        this.crewName = crewName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        if (role == null || role.trim().isEmpty()) {
            throw new IllegalArgumentException("Role cannot be empty");
        }
        this.role = role;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        if (shift == null || (!shift.equalsIgnoreCase("Day") && !shift.equalsIgnoreCase("Night"))) {
            throw new IllegalArgumentException("Shift must be 'Day' or 'Night'");
        }
        this.shift = shift;
    }

    public String toString() {
        return "CabinCrew{" +
                "id=" + getId() +
                ", crewName='" + crewName + '\'' +
                ", role='" + role + '\'' +
                ", shift='" + shift + '\'' +
                ", pilotName='" + getPilotName() + '\'' +
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
