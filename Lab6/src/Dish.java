abstract class Dish {
    protected String material;
    protected int capacity;

    public Dish(String material, int capacity) {
        this.material = material;
        this.capacity = capacity;
    }

    public abstract void use();

    public abstract void clean();
}
