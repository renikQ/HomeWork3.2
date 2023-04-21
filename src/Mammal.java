public abstract class Mammal extends Animal {
    private String environment;
    private int movementSpeed;

    protected Mammal(String name, int age, String environment, int movementSpeed) {
        super(name, age);
        setEnvironment(environment);
        setMovementSpeed(movementSpeed);
    }

    public void walk() {
        System.out.println(this.getName() + " гуляет со скоростью " + movementSpeed + " по " + environment);
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = ValidationUtils.validOrDefault(environment, "Суша");
    }

    public int getMovementSpeed() {
        return movementSpeed;
    }

    public void setMovementSpeed(int movementSpeed) {
        this.movementSpeed = Math.max(movementSpeed, 1);
    }
}
