package exercise13_zoo;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.printf("(%s) Meow!%n", this.getName());
    }
}
