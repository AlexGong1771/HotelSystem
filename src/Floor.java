import java.util.ArrayList;

public class Floor {
    private ArrayList<Apartment> apartments;
    private int number;

    public Floor(int number) {
        this.number = number;
        this.apartments = new ArrayList<>();
    }

    public int getNumber() {
        return number;
    }

    public int getApartmentCount() {
        return apartments.size();
    }

    public void addApartment(Apartment apartment) {
        apartments.add(apartment);
    }

    public void displayApartments() {
        System.out.println("Floor Number: " + number);
        for (int i = 0; i < apartments.size(); i++) {
            System.out.println(" Apartment " + number + "0" + i);
        }
    }
}
