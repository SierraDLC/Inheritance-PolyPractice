
public class Dog extends Animal implements AnimalNoiseCapable {
    public Dog(String name) {
        super(name);
    }

    public Dog() {
        super("Dog");
    }

    public void bark() {
        System.out.println(this.getName() + " barks");
    }

    @Override
    public void makeNoise() {
        this.bark();
    }
}