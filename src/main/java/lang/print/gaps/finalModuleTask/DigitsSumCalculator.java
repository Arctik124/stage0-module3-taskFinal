package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {

        int thousands = number / 1000;
        int hundreds = number % 1000 / 100;
        int decimals = number % 1000 % 100 /10;
        int digit = number % 1000 % 100 % 10;
        System.out.println(thousands + hundreds + decimals + digit);
    }
}
