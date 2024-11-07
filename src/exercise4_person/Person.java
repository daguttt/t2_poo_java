package exercise4_person;

/**
 * Clase Persona y Comparación de Edades:
 * Crea una clase Persona con atributos nombre, edad, y sexo. Añade un método
 * que
 * permita comparar la edad entre dos personas, mostrando cuál es mayor.
 */

public class Person {

    private String name;
    private int age;
    private String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public static void compareAge(Person person1, Person person2) {
        if (person1.getAge() > person2.getAge())
            System.out.println(person1.getName() + " es mayor que " + person2.getName());
        else
            System.out.println(person2.getName() + " es mayor que " + person1.getName());
    }
}
