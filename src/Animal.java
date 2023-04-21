public abstract class Animal {
    private String name;
    private int age;

    protected Animal(String name, int age) {
        setName(name);
        setAge(age);
    }

    public abstract void eat();

    public void sleep() {
        System.out.println(this.name + " спит");
    }

    public abstract void go();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = ValidationUtils.validOrDefault(name, "кличка отсутствует");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = Math.max(age, 0);
    }
}
