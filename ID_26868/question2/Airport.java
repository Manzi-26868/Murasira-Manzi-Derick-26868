package ID_26868.question2;

public class Airport extends Entity {
    private String airportName;
    private String code;
    private String location;


    public Airport(int id, String createdDate, String updatedDate,
                   String airportName, String code, String location) {
        super(id, createdDate, updatedDate);
        setAirportName(airportName);
        setCode(code);
        setLocation(location);
    }

    public String getAirportName() {
        return airportName;
    }

    public void setAirportName(String airportName) {
        if (airportName == null || airportName.trim().isEmpty()) {
            throw new IllegalArgumentException("Airport name cannot be empty");
        }
        this.airportName = airportName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        if (code == null || !code.matches("[A-Z]{3}")) {
            throw new IllegalArgumentException("Airport code must be 3 uppercase letters");
        }
        this.code = code;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        if (location == null || location.trim().isEmpty()) {
            throw new IllegalArgumentException("Location cannot be empty");
        }
        this.location = location;
    }

    public String toString() {
        return "Airport{" +
                "id=" + getId() +
                ", airportName='" + airportName + '\'' +
                ", code='" + code + '\'' +
                ", location='" + location + '\'' +
                ", createdDate='" + getCreatedDate() + '\'' +
                ", updatedDate='" + getUpdatedDate() + '\'' +
                '}';
    }

    public String getAirportCode() {

        return "";
    }
}