class Cup extends Dish {
    private boolean hasHandle;

    public Cup(String material, int capacity, boolean hasHandle) {
        super(material, capacity);
        this.hasHandle = hasHandle;
    }

    @Override
    public void use() {
        System.out.println("Using the cup...");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning the cup...");
    }
}
