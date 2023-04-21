public abstract class Bird extends Animal {
    private String environment;

    protected Bird(String name, int age, String environment) {
        super(name, age);
        setEnvironment(environment);
    }
    public void hunting() {
        System.out.println(getName() + " охотится за добычей");
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = ValidationUtils.validOrDefault(environment, "Суша");
    }
}
