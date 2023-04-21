public class Herbivore extends Mammal {
    private final String foodType;

    protected Herbivore(String name, int age, String environment, int movementSpeed, String foodType) {
        super(name, age, environment, movementSpeed);
        this.foodType = ValidationUtils.validOrDefault(foodType, "Трава");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " ест " + foodType);
    }

    @Override
    public void go() {
        System.out.println(getName() + " движется со скоростью " + getMovementSpeed());
    }

    public void graze() {
        System.out.println(getName() + " посется и ест " + foodType);
    }

    public String getFoodType() {
        return foodType;
    }
}
