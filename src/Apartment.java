import java.util.ArrayList;
import java.util.Date;

public abstract class Apartment {
    private int price;
    private Date from;
    private Date to;
    private ArrayList<Room> rooms;

    public Apartment(int price) {
        this.price = price;
        this.rooms = new ArrayList<>();
    }

    public boolean isEmpty() {
        return from == null || to == null || from.after(to);
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getFrom() {
        return from;
    }

    public void setFrom(Date from) {
        this.from = from;
    }

    public Date getTo() {
        return to;
    }

    public void setTo(Date to) {
        this.to = to;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public boolean isAvailable(Date checkIn, Date checkOut) {
        return (from == null || checkOut.before(from)) || (to == null || checkIn.after(to));
    }

    public void book(Date checkIn, Date checkOut) {
        if (isAvailable(checkIn, checkOut)) {
            this.from = checkIn;
            this.to = checkOut;
        } else {
            throw new IllegalStateException("Apartment is not available for the selected dates.");
        }
    }

    public abstract int getTotalCapacity();
}
