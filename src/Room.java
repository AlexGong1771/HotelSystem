import java.util.ArrayList;

public class Room {
    private RoomType type;
    private ArrayList<Visitor> visitors;

    public Room(RoomType type) {
        this.type = type;
        this.visitors = new ArrayList<>();
    }

    public RoomType getType() {
        return type;
    }

    public void setType(RoomType type) {
        this.type = type;
    }

    public int getCapacity() {
        return type.getCapability();
    }

    public ArrayList<Visitor> getVisitors() {
        return visitors;
    }

    public void addVisitor(Visitor visitor) {
        if (visitors.size() < getCapacity()) {
            visitors.add(visitor);
        } else {
            throw new IllegalStateException("Room capacity exceeded.");
        }
    }
}
