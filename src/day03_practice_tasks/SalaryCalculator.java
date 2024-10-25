package day03_practice_tasks;

public class SalaryCalculator {

    public static void main(String[] args) {

        int weeklyHours = 45;
        double hourlyRate = 50, grossPay = hourlyRate * weeklyHours * 52, federalTax = .26 * grossPay, stateTax = .06 * grossPay, totalTax = federalTax + stateTax, netIncome = grossPay - totalTax, monthlyNetIncome = netIncome / 12;

        System.out.println("Gross pay is: $" + grossPay +
                "\nFederal tax is: $" + federalTax +
                "\nState tax is: $" + stateTax +
                "\nTotal tax is: $" + totalTax +
                "\nNet income is: $" + netIncome +
                "\nMonthly net income is: $" + monthlyNetIncome) ;

    }

}

/*
4. Create a class named SalaryCalculator. Given the following variables:
				hourlyRate (double)
				weeklyHours (int)
				stateTaxRate (double)
				federalTaxRate (double)

	Use the given information above to calculate the following:
				salaryBeforeTax (Yearly salary before tax)
				stateTax (Yearly state tax)
				federalTax (Yearly federal tax)
				totalTax (yearly total tax)
				salaryAfterTax (Yearly salary after tax)

		Assume that there are 52 work weeks in a year.

	Display each of the above in the following format:

					Example:
						hourlyRate = $50
						weeklyHours = 45
						stateTaxRate = 6  (given as a percentage)
						federalTaxRate = 26 (given as a percentage)

					Output:
						Gross pay is: $117000.0
						Federal tax is: $30420.0
						State tax is: $7020.0
						Total tax is: $37440.0
						Net income is: $79560.0
 */