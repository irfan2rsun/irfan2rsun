package day06_practice_tasks;

public class DayAndMonth {

    public static void main(String[] args) {

        System.out.println(day(0));
        System.out.println(monthName(1));
        System.out.println(monthName(6) + " has " + daysInMonth(6));

    }

    public static String day(int day) {

        if (day == 1) {

            return "Monday";

        } else if (day == 2) {

            return "Tuesday";

        } else if (day == 3) {

            return "Wednesday";

        } else if (day == 4) {

            return "Thursday";

        } else if (day == 5) {

            return "Friday";

        } else if (day == 6) {

            return "Saturday";

        } else if (day == 7) {

            return "Sunday";

        } else {

            return "Invalid Number";

        }


    }

    public static String monthName(int num) {

        switch (num) {

            case 1 -> {
                return ("January");
            }
            case 2 -> {
                return ("February");
            }
            case 3 -> {
                return ("March");
            }
            case 4 -> {
                return ("April");
            }
            case 5 -> {
                return ("May");
            }
            case 6 -> {
                return ("June");
            }
            case 7 -> {
                return ("July");
            }
            case 8 -> {
                return ("August");
            }
            case 9 -> {
                return ("September");
            }
            case 10 -> {
                return ("October");
            }
            case 11 -> {
                return ("November");
            }
            case 12 -> {
                return ("December");
            }
            default -> {
                return ("No such month");
            }

        }

    }

    public static String daysInMonth(int num) {

        switch (num) {

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return "31 days";
            case 4:
            case 6:
            case 9:
            case 11:
                return "30 days";
            default:
                return "Invalid";

        }

    }

}

/*
4. Create a class named DayAndMonth:

	4.1 Create a method named day that displays the day's name based on the given number.
	If the number is invalid, print "Invalid Number".

			Example:
				day(5);

			Output:
				Friday

	4.2 Create a method named monthName that displays the month's name based on the given number.
	If the number is invalid, print "Invalid Number."


			Example:
				monthName(6);

			Output:
				June

	4.3 Create a method named daysInMonth that displays the number of days in the month based on the given number.
	If the number is invalid, print "Invalid Number."

				Example:
					daysInMonth(6);

				Output:
					June has 30 days
 */