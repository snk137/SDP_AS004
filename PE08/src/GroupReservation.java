class GroupReservation extends Reservation {
    public GroupReservation() {
        setType("Group");
        setCapacity(20);
        setPrice(500.0);
    }
}