package day04;

public class Airport {

    public static void main(String[] args) {

        Passenger passenger1 = new Passenger("Kiss Péter", "FK452-1234", 2);
        Passenger passenger2 = new Passenger("Nagy Lajos", "BF-4321", 1);
        Plane plane = new Plane(2);
        plane.addPassenger(passenger1);
        plane.addPassenger(passenger2);

        System.out.println(passenger1.getName());
        System.out.println(passenger2.getName());
        System.out.println(plane.getPassengers());
        System.out.println(plane.numberOfPackages());

        Passenger passenger3 = new Passenger("Tóth Dénes", "LK-9876", 1);
        plane.addPassenger(passenger3);

        System.out.println(passenger3.getName());
        System.out.println(plane.getPassengers());
        System.out.println(plane.numberOfPackages());
    }
}
