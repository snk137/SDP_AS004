class CustomerProfile {
    private String customerName;
    private String reservationType;

    public CustomerProfile(String customerName, String reservationType) {
        this.customerName = customerName;
        this.reservationType = reservationType;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getReservationType() {
        return reservationType;
    }
}