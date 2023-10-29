class Server implements RestaurantStaff {
    private String name;

    public Server(String name) {
        this.name = name;
    }

    @Override
    public void update(String reservationDetails) {
        System.out.println(name + " has been notified about a new reservation: " + reservationDetails);
        String[] parts = reservationDetails.split(":");
        if (parts.length == 2) {
            String customerName = parts[0];
            String specificDetails = parts[1];
            System.out.println(name + " takes the order and serves " + customerName);
            System.out.println(name + " pays special attention to: " + specificDetails);
        }
    }
}