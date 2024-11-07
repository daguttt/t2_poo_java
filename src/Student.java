import java.util.ArrayList;

/**
 * Crea una clase Estudiante con atributos nombre, listaNotas y un método para
 * agregar notas. Incluye métodos para calcular el promedio y determinar si el
 * estudiante aprobó (promedio >= 60)
 */
public class Student {
  private final String name;
  private final ArrayList<Double> grades;

  public Student(String name) {
    this.name = name;
    this.grades = new ArrayList<>();
  }

  public void addGrade(double grade) {
    grades.add(grade);
  }

  public double calculateAverage() {
    return grades.stream()
        .mapToDouble(Double::doubleValue)
        .average()
        .orElse(0.0);
  }

  public boolean approved() {
    return calculateAverage() >= 60;
  }

  // Getters
  public String getName() {
    return name;
  }
}
