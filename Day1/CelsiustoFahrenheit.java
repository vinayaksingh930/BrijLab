package Day1;
import java.util.Scanner;
public class CelsiustoFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new java.util.Scanner(System.in);
        
        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();
        
        double fahrenheit = (celsius * 9/5) + 32;

        System.out.printf("%.2f Celsius is %.2f Fahrenheit%n", celsius, fahrenheit);
    }
}
