package exercise13_zoo;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.printf("(%s) Woof!%n", this.getName());
    }
}
