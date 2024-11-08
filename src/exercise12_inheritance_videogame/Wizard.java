package exercise12_inheritance_videogame;

public class Wizard extends Character {
    public Wizard(String name, int level) {
        super(name, level);
    }

    @Override
    public void attack(Character character) {
        System.out.printf("(Wizard) Attacking '%s' with magic%n", character.getName());
    }
}
