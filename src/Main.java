public class Main {
    public static void main(String[] args) {
        Floor floor1 = new Floor(1);
        for (int i = 0; i < 8; i++) {
            floor1.addApartment(new BasicApartment(50));
        }

        Floor floor2 = new Floor(2);
        for (int i = 0; i < 8; i++) {
            floor2.addApartment(new BusinessApartment(50));
        }

        Floor floor3 = new Floor(3);
        for (int i = 0; i < 8; i++) {
            floor3.addApartment(new LuxuryApartment(50));
        }

        Hotel hotel = new Hotel("Plaza");
        hotel.addFloor(floor1);
        hotel.addFloor(floor2);
        hotel.addFloor(floor3);

        hotel.displayAllApartments();
    }
}
