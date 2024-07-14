public class LuxuryApartment extends Apartment {
    public LuxuryApartment(int price) {
        super(price);
    }

    @Override
    public int getTotalCapacity() {
        return 5;
    }

}
