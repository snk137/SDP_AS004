import java.util.HashMap;
import java.util.Map;
import java.util.Date;

class Reservation {
    private String type;
    private int capacity;
    private double price;
    private Date reservationDate;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(Date date) {
        this.reservationDate = date;
    }
}