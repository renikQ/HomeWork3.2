public class Amphibian extends Animal{
    private String environment;

    protected Amphibian(String name, int age, String environment) {
        super(name, age);
        setEnvironment(environment);
        }
    public void hunting() {
        System.out.println(getName() + " охотится за добычей");
    }
    @Override
    public void eat() {
        System.out.println(getName() + " ест");
    }

    @Override
    public void go() {
        System.out.println(getName() + " движется");
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = ValidationUtils.validOrDefault(environment, "Водоем");
    }
}
