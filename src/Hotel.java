import java.util.ArrayList;

public class Hotel {
    private String name;
    private ArrayList<Floor> floors;

    public Hotel(String name) {
        this.name = name;
        this.floors = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getFloorCount() {
        return floors.size();
    }

    public void addFloor(Floor floor) {
        floors.add(floor);
    }

    public void displayAllApartments() {
        System.out.println("Hotel " + name);
        for (Floor floor : floors) {
            floor.displayApartments();
        }
    }
}
