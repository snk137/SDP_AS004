class ChildReservation extends Reservation {
    public ChildReservation() {
        setType("Child");
        setCapacity(10);
        setPrice(10.0);
    }
}