class Bowl extends Dish {
    private boolean hasLid;

    public Bowl(String material, int capacity, boolean hasLid) {
        super(material, capacity);
        this.hasLid = hasLid;
    }

    @Override
    public void use() {
        System.out.println("Using the bowl...");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning the bowl...");
    }
}
