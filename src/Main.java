public class Main {
    public static void main(String[] args) {
        Herbivore gazelle = new Herbivore("Газель", 2, "Саванна", 59, "Трава");
        Herbivore giraffe = new Herbivore("Жираф", 5, "Саванна", 30, "Трава, ветки");
        Herbivore horse = new Herbivore("Лошадь", 7, "Поле", 60, "Сено");
        giraffe.eat();
        gazelle.go();
        horse.walk();
        Predator hyena = new Predator("Гиена", 3, "Саванна", 30, "Падаль");
        Predator tiger = new Predator("Тигр", 5, "Тайга", 65, "Маясо");
        Predator bear = new Predator("Медведь", 6, "Тайга", 59, "Мясо, Рыба");
        Amphibian frog = new Amphibian("Лягушка", 1, "Болто");
        Amphibian grassSnake = new Amphibian("Уж", 1, "Озеро");
        NotFlyingBird penguin = new NotFlyingBird("Пингвин", 2, "Арктика", "Пешком и вплавь");
        NotFlyingBird peacock = new NotFlyingBird("Павлин", 3, "Джунгли", "Пешком");
        NotFlyingBird dodoBird = new NotFlyingBird("Птица Додо", 2, "Лес", "Пешком");
        FlyingBird seagull = new FlyingBird("Чайка", 2, "Берег моря", "Полет и пешком");
        FlyingBird аlbatross  = new FlyingBird("Альбатрос", 3, "Берег моря", "Полет и пешком");
        FlyingBird flacon = new FlyingBird("Чайка", 2, "Берег моря", "Полет и пешком");
        dodoBird.walk();

    }
}