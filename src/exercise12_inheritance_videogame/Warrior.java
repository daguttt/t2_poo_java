package exercise12_inheritance_videogame;

public class Warrior extends Character {
    public Warrior(String name, int level) {
        super(name, level);
    }

    @Override
    public void attack(Character character) {
        System.out.printf("(Warrior) Attacking '%s' with sword%n", character.getName());
    }
}
