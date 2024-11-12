package exercise10_employee;

public class Employee {
  private String name;
  private double baseSalary;
  private int yearsOfExperience;
  private final double hourlyRate;
  private int hoursWorked;

  public Employee(String name, double baseSalary, int yearsOfExperience) {
    this.name = name;
    this.baseSalary = baseSalary;
    this.yearsOfExperience = yearsOfExperience;
    this.hoursWorked = 0;

    this.hourlyRate = calculateHourlyRate();
  }


  // Getters and setters
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getHourlyRate() {
    return hourlyRate;
  }

  public int getHoursWorked() {
    return hoursWorked;
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

  public double calculateAnnualBonus() {
    double bonusPercentage = yearsOfExperience * 0.05;
    return baseSalary * bonusPercentage;
  }

  public double getTotalSalaryWithBonus() {
    return baseSalary + calculateAnnualBonus();
  }

  public double calculateHourlyRate() {
    final int hoursPerYear = 40 * 52;
    return this.baseSalary / hoursPerYear;
  }

  public void recordHours(int hours) {
    if (hours < 0) throw new IllegalArgumentException("Hours cannot be negative");
    this.hoursWorked += hours;
  }

  public void resetHoursWorked() {
    this.hoursWorked = 0;
  }

  @Override
  public String toString() {
    return String.format(" Name: %s | Base salary: %.2f | Years of experience: %d", name, baseSalary, yearsOfExperience);
  }
}