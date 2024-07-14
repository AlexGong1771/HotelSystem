public class BasicApartment extends Apartment {
    public BasicApartment(int price) {
        super(price);
    }

    @Override
    public int getTotalCapacity() {
        return 2;
    }


}
