public class MainAnimal {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.makeNoise();
        dog.eat();

        Dog barky = new Dog("Barky");
        barky.makeNoise();

        Cat cat = new Cat();
        cat.makeNoise();
        cat.eat();

        Cat moe = new Cat("Moe");
        moe.makeNoise();
        
    }
}