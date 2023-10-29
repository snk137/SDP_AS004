import java.util.HashMap;
import java.util.Map;
class ReservationDatabase {
    private Map<String, Reservation> reservations = new HashMap<>();

    public void saveReservation(String customerName, Reservation reservation) {
        reservations.put(customerName, reservation);
    }

    public Reservation getReservation(String customerName) {
        return reservations.get(customerName);
    }
}