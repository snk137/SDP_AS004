class Host implements RestaurantStaff {
    private String name;

    public Host(String name) {
        this.name = name;
    }

    @Override
    public void update(String reservationDetails) {
        String[] parts = reservationDetails.split(":");
        if (parts.length == 2) {
            String customerName = parts[0];
            String specificDetails = parts[1];
            System.out.println(name + " has been notified about a new reservation: " + customerName);
            System.out.println(name + " assigns a table to " + customerName);
            System.out.println(name + " records special requests: " + specificDetails);
        }
    }
}