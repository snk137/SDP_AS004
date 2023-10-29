public class RestaurantApp {
    public static void main(String[] args) {
        ReservationSystem reservationSystem = new ReservationSystem();

        Host host = new Host("Host");
        Server server = new Server("Server");
        Chef chef = new Chef("Chef");
        Manager manager = new Manager("Manager");

        reservationSystem.registerObserver(host, "regular");
        reservationSystem.registerObserver(server, "regular");
        reservationSystem.registerObserver(chef, "vip");
        reservationSystem.registerObserver(manager, "vip");

        reservationSystem.makeReservation("John", "Table for 4 at 7 PM", "regular");
        reservationSystem.makeReservation("Alice", "VIP Table for 6 at 8 PM", "vip");

        reservationSystem.modifyReservation("John", "Table for 5 at 7 PM", "regular");

        reservationSystem.cancelReservation("Alice", "vip");


    }
}
