public enum RoomType {
    BIG(3), SMALL(1), MEDIUM(2);

    private int capability;

    RoomType(int capability) {
        this.capability = capability;
    }

    public int getCapability() {
        return capability;
    }
}
