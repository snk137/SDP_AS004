import java.util.HashMap;
import java.util.Map;
import java.util.Date;

class ReservationFactory {
    private Map<String, Reservation> reservationPrototypes = new HashMap<>();

    public void addReservationType(String type, Reservation prototype) {
        reservationPrototypes.put(type, prototype);
    }

    public Reservation createReservation(String type) {
        Reservation prototype = reservationPrototypes.get(type);
        if (prototype != null) {
            Reservation newReservation = new Reservation();
            newReservation.setType(prototype.getType());
            newReservation.setCapacity(prototype.getCapacity());
            newReservation.setPrice(prototype.getPrice());
            newReservation.setReservationDate(new Date());
            return newReservation;
        }
        return null;
    }
}
