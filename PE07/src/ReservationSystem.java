import java.util.*;

class ReservationSystem {
    private Map<String, List<RestaurantStaff>> observersByType = new HashMap<>();
    private Map<String, List<String>> reservations = new HashMap<>();

    public void registerObserver(RestaurantStaff observer, String reservationType) {
        List<RestaurantStaff> observers = observersByType.getOrDefault(reservationType, new ArrayList<>());
        observers.add(observer);
        observersByType.put(reservationType, observers);
    }

    public void notifyObservers(String reservationDetails, String reservationType) {
        List<RestaurantStaff> observers = observersByType.get(reservationType);
        if (observers != null) {
            for (RestaurantStaff observer : observers) {
                observer.update(reservationDetails);
            }
        }
    }

    public void makeReservation(String customerName, String reservationDetails, String reservationType) {
        List<String> reservationsOfType = reservations.getOrDefault(reservationType, new ArrayList<>());
        reservationsOfType.add(customerName + ": " + reservationDetails);
        reservations.put(reservationType, reservationsOfType);

        notifyObservers(reservationDetails, reservationType);
    }

    public void modifyReservation(String customerName, String newReservationDetails, String reservationType) {
        List<String> reservationsOfType = reservations.get(reservationType);
        for (int i = 0; i < reservationsOfType.size(); i++) {
            String reservation = reservationsOfType.get(i);
            if (reservation.startsWith(customerName)) {
                reservationsOfType.set(i, customerName + ": " + newReservationDetails);
                break;
            }
        }

        notifyObservers(newReservationDetails, reservationType);
    }

    public void cancelReservation(String customerName, String reservationType) {
        List<String> reservationsOfType = reservations.get(reservationType);
        List<String> updatedReservations = new ArrayList<>();
        for (String reservation : reservationsOfType) {
            if (!reservation.startsWith(customerName)) {
                updatedReservations.add(reservation);
            }
        }
        reservations.put(reservationType, updatedReservations);
    }
}