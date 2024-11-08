package exercise12_inheritance_videogame;

public abstract class Character {
    private String name;
    private int level;

    public Character(String name, int level) {
      this.name = name;
      this.level = level;
    }

    abstract void attack(Character character);

    // Getters

    public String getName() {
        return name;
    }

}
