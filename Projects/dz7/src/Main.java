public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Dog dog1 = new Dog();
        Cat cat = new Cat();
        Cat cat1 = new Cat();
        dog.run(150);
        dog.swim(5);
        cat.run(100);
        cat.swim(2);
        Dog.getDogCount();
        Cat.getCatCount();
        Animals.getAnimalCount();


    }
}