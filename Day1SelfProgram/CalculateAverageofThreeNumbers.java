package Day1SelfProgram;

public class CalculateAverageofThreeNumbers {
    public static void main(String[] args) {
        double num1 = 10.0; 
        double num2 = 20.0; 
        double num3 = 30.0; 

        double average = (num1 + num2 + num3) / 3;

        System.out.printf("The average of %.2f, %.2f, and %.2f is: %.2f%n", num1, num2, num3, average);
    }
}
