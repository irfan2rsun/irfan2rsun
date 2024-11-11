package day06_practice_tasks;

public class SalaryCalculator {

    public static void main(String[] args) {

        System.out.println(salary(24.72,40));
        double hourlyRate = 45;
        int weeklyHours = 40;
        System.out.println(salary(hourlyRate,weeklyHours));

    }

    public static double salary(double hourlyRate, int weeklyHours){

        return hourlyRate * weeklyHours * 52;

    }

}

/*
2. Create a class named SalaryCalculator and create a method named salary that takes hourly rate (double)
and weekly hours (int) and returns the salary.

			Example:
				double income = salary(45, 40);

			Output:
				93600.0
 */