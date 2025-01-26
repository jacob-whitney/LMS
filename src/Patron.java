public class Patron {
    // Attributes
    private String id;
    private String name;
    private String address;
    private double fines;

    // Constructor
    public Patron(String id, String name, String address, double fines) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.fines = fines;
    }

    // Getters and Setters
    public String getID() {
        return id;
    }

    public void setID(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getFines() {
        return fines;
    }

    public void setFines(double fines) {
        this.fines = fines;
    }
}
