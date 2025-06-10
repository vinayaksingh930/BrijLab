package Day1SelfProgram;

public class PowerCalculation {
    public static void main(String[] args) {
        double base = 2.0; 
        int exponent = 3; 

        double result = Math.pow(base, exponent);

        System.out.printf("%.2f raised to the power of %d is %.2f%n", base, exponent, result);
    }
}
