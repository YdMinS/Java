package CodeTest;

public class 소수점N번째자리_NDigitAfterDecimal {
    public static void main(String[] args) {
        // N = 6

        int numerator = 5;
        int denominator = 3;

        System.out.println("numerator = " + numerator);
        System.out.println("denominator = " + denominator);
        System.out.printf("%.6f", (float)numerator/denominator);
    }
}
