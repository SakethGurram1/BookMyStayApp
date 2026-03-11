public class UseCase2HotelBookingApp {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("      Book My Stay - Room Viewer      ");
        System.out.println("              Version 2.1             ");
        System.out.println("======================================");

        Room singleRoom = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suiteRoom = new SuiteRoom();

        int singleRoomAvailable = 5;
        int doubleRoomAvailable = 3;
        int suiteRoomAvailable = 2;

        System.out.println("\n--- Single Room Details ---");
        singleRoom.displayRoomDetails();
        System.out.println("Available Rooms: " + singleRoomAvailable);

        System.out.println("\n--- Double Room Details ---");
        doubleRoom.displayRoomDetails();
        System.out.println("Available Rooms: " + doubleRoomAvailable);

        System.out.println("\n--- Suite Room Details ---");
        suiteRoom.displayRoomDetails();
        System.out.println("Available Rooms: " + suiteRoomAvailable);

        System.out.println("\nApplication finished.");
    }
}
interface Room {
    void displayRoomDetails();
}
class SingleRoom implements Room {

    public void displayRoomDetails() {
        System.out.println("Room Type: Single Room");
        System.out.println("Capacity: 1 Person");
        System.out.println("Price: $50 per night");
    }
}
class DoubleRoom implements Room {
    public void displayRoomDetails() {
        System.out.println("Room Type: Double Room");
        System.out.println("Capacity: 2 Persons");
        System.out.println("Price: $80 per night");
    }
}
class SuiteRoom implements Room {
    public void displayRoomDetails() {
        System.out.println("Room Type: Suite Room");
        System.out.println("Capacity: 4 Persons");
        System.out.println("Price: $150 per night");
    }
}