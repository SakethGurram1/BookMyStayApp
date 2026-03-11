public class UseCase3BookMyStayApp {

    public static void main(String[] args) {
        RoomInventory inventory = new RoomInventory();
        System.out.println("===== BookMyStay Room Inventory =====");
        inventory.displayInventory();
        System.out.println("\nBooking a Single Room...");
        inventory.updateAvailability("Single Room", -1);
        System.out.println("\nUpdated Inventory:");
        inventory.displayInventory();
    }
}
class RoomInventory {

    private HashMap<String, Integer> roomAvailability;
    public RoomInventory() {

        roomAvailability = new HashMap<>();

        // Register room types with availability
        roomAvailability.put("Single Room", 10);
        roomAvailability.put("Double Room", 5);
        roomAvailability.put("Suite Room", 2);
    }
    public int getAvailability(String roomType) {
        return roomAvailability.getOrDefault(roomType, 0);
    }
    public void updateAvailability(String roomType, int change) {

        int current = getAvailability(roomType);
        roomAvailability.put(roomType, current + change);
    }
    public void displayInventory() {

        for (String roomType : roomAvailability.keySet()) {
            System.out.println(roomType + " Available: " + roomAvailability.get(roomType));
        }
    }
}