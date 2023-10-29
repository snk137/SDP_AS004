public class RestaurantApp {
    public static void main(String[] args) {
        ReservationFactory reservationFactory = new ReservationFactory();

        reservationFactory.addReservationType("Group", new GroupReservation());
        reservationFactory.addReservationType("Child", new ChildReservation());

        Reservation groupReservation = reservationFactory.createReservation("Group");
        Reservation childReservation = reservationFactory.createReservation("Child");

        System.out.println("Group Reservation: " + groupReservation.getType() + " - Date: " + groupReservation.getReservationDate());
        System.out.println("Child Reservation: " + childReservation.getType() + " - Date: " + childReservation.getReservationDate());
    }
}
