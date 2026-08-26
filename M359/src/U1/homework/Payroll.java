package U1.homework;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Payroll {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        df.setRoundingMode(java.math.RoundingMode.DOWN);
        System.out.print("Enter employee’s name: ");
        String Name = input.next();
        System.out.print("Enter number of hours worked in a week: ");
        double hours = input.nextDouble();
        System.out.print("Enter hourly pay rate: ");
        double hourlyPay = input.nextDouble();
        System.out.print("Enter federal tax withholding rate: ");
        double taxF = input.nextDouble();
        System.out.print("Enter state tax withholding rate: ");
        double taxS = input.nextDouble();
        double federalWithholding = computePay(hours,hourlyPay)/(100/taxF);
        double stateWithholding = computePay(hours,hourlyPay)/(100/taxS);
        double tax = federalWithholding + stateWithholding;
        double netPay = computePay(hours, hourlyPay) - tax;
        System.out.println("Employee's Name : " + Name);
        System.out.println("Hours Worked: " + hours);
        System.out.println("Pay Rate: " + hourlyPay);
        System.out.println("Gross Pay: " + computePay(hours, hourlyPay));
        System.out.println("Deductions: ");
        System.out.println("    Federal Withholding (" + taxF + "%): $" + df.format(federalWithholding));
        System.out.println("    State Withholding (" + taxS + "%): $" + df.format(stateWithholding));
        System.out.println("    Total Deduction: $" + df.format(tax));
        System.out.println("Net Pay: $" + df.format(netPay));

    }

    public static double computePay(double hours, double hourlyPay) {
        return hours*hourlyPay;
    }
}
