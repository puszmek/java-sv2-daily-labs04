package day04;

public class Passenger {

    private String name;
    private String numberOfTicket;
    private int numberOfPackage;

    public Passenger(String name, String numberOfTicket, int numberOfPackage) {
        this.name = name;
        this.numberOfTicket = numberOfTicket;
        this.numberOfPackage = numberOfPackage;
    }

    @Override
    public String toString() {
        return name + ", " + numberOfTicket + ", " + numberOfPackage;
    }

    public String getName() {
        return name;
    }

    public String getNumberOfTicket() {
        return numberOfTicket;
    }

    public int getNumberOfPackage() {
        return numberOfPackage;
    }
}
