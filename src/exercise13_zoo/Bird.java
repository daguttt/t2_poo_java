package exercise13_zoo;

public class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.printf("(%s) Tweet!%n", this.getName());
    }
}
