import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String [] args) {
        //This program serves as a mortgage calculator
        // Declaring CONSTANTS THAT WILL BE USED IN THE CALCULATION
        final int MONTHS_IN_YEAR = 12;
        final int PERCENT = 100;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest / MONTHS_IN_YEAR /PERCENT;

        System.out.print("Period (Years): ");
        Scanner scanner2 = new Scanner(System.in);
        byte years = scanner2.nextByte();
        int numberOfPayments = years * MONTHS_IN_YEAR;

        double mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments)
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1));

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(principal);
        System.out.println("Mortgage: " + mortgageFormatted);
    }

}
