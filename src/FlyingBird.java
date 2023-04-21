public class FlyingBird extends Bird{
    private String movementType;
    protected FlyingBird(String name, int age, String environment, String movementType) {
        super(name, age, environment);
        this.movementType = ValidationUtils.validOrDefault(movementType, "Полет");
    }

    public void fly() {
        System.out.println(this.getName() + " летает " + " по " + getEnvironment());
    }
    @Override
    public void eat() {
        System.out.println(getName() + " ест");
    }

    @Override
    public void go() {
        System.out.println(getName() + " движется");
    }

    public String getMovementType() {
        return movementType;
    }
}
