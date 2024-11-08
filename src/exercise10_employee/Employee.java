package exercise10_employee;

public class Employee {
  private String name;
  private double baseSalary;
  private int yearsOfExperience;

  // Constructor
  public Employee(String name, double baseSalary, int yearsOfExperience) {
    this.name = name;
    this.baseSalary = baseSalary;
    this.yearsOfExperience = yearsOfExperience;
  }

  // Getters and setters
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getBaseSalary() {
    return baseSalary;
  }

  public void setBaseSalary(double baseSalary) {
    this.baseSalary = baseSalary;
  }

  public int getYearsOfExperience() {
    return yearsOfExperience;
  }

  public void setYearsOfExperience(int yearsOfExperience) {
    this.yearsOfExperience = yearsOfExperience;
  }

  // Method to calculate annual bonus
  public double calculateAnnualBonus() {
    // Calculate bonus percentage (5% for each year of experience)
    double bonusPercentage = yearsOfExperience * 0.05;
    return baseSalary * bonusPercentage;
  }

  // Method to get total salary with bonus
  public double getTotalSalaryWithBonus() {
    return baseSalary + calculateAnnualBonus();
  }

  @Override
  public String toString() {
    return String.format(" Name: %s | Base salary: %.2f | Years of experience: %d", name, baseSalary, yearsOfExperience);
  }
}