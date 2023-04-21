public class Predator extends Mammal {
    private final String foodType;

    protected Predator(String name, int age, String environment, int movementSpeed, String foodType) {
        super(name, age, environment, movementSpeed);
        this.foodType = ValidationUtils.validOrDefault(foodType, "Мясо");;
    }

    public void hunting() {
        System.out.println(getName() + " охотится за добычей");
    }
    @Override
    public void eat() {
        System.out.println(getName() + " ест " + foodType);
    }

    @Override
    public void go() {
        System.out.println(getName() + " движется со скоростью " + getMovementSpeed());
    }

    public String getFoodType() {
        return foodType;
    }
}
