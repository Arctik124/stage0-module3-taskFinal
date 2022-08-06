package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int hundreds = number / 100;
        int decimals = (number - hundreds * 100) / 10;
        int digit = number - hundreds * 100 - decimals * 10;
        System.out.println(digit + "" + decimals + "" + hundreds);
    }
}
