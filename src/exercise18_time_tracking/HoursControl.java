package exercise18_time_tracking;

import exercise10_employee.Employee;

public class HoursControl {
    private static final int REGULAR_HOURS = 40;
    private static final double OVERTIME_MULTIPLIER = 1.5;

    public static double calculateWeeklySalary(Employee employee) {
        int hours = employee.getHoursWorked();
        double hourlyRate = employee.getHourlyRate();

        if (hours <= REGULAR_HOURS) return hours * hourlyRate;

        int overtimeHours = hours - REGULAR_HOURS;
        return (REGULAR_HOURS * hourlyRate) + (overtimeHours * hourlyRate * OVERTIME_MULTIPLIER);
    }
}
