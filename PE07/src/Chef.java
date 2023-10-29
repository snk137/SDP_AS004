class Chef implements RestaurantStaff {
    private String name;

    public Chef(String name) {
        this.name = name;
    }

    @Override
    public void update(String reservationDetails) {
        System.out.println(name + " has been notified about a new reservation: " + reservationDetails);
        System.out.println(name + " starts preparing the dish for the reservation.");
    }
}