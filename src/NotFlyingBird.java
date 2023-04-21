public class NotFlyingBird extends Bird{
    private String movementType;
    protected NotFlyingBird(String name, int age, String environment, String movementType) {
        super(name, age, environment);
        this.movementType = ValidationUtils.validOrDefault(movementType, "Пешком");
    }

    public void walk() {
        System.out.println(this.getName() + " гуляет " + movementType + " по " + getEnvironment());
    }
    @Override
    public void eat() {
        System.out.println(getName() + " ест");
    }

    @Override
    public void go() {
        System.out.println(getName() + " движется " + movementType);
    }

    public String getMovementType() {
        return movementType;
    }
}
