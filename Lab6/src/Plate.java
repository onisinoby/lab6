class Plate extends Dish {
    private boolean hasRim;

    public Plate(String material, int capacity, boolean hasRim) {
        super(material, capacity);
        this.hasRim = hasRim;
    }

    @Override
    public void use() {
        System.out.println("Using the plate...");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning the plate...");
    }
}
