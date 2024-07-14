public class BusinessApartment extends Apartment {
    public BusinessApartment(int price) {
        super(price);
    }

    @Override
    public int getTotalCapacity() {
        return 3;
    }


}
