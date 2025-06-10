package Day1SelfProgram;

public class CalculateSimpleInterest {
    public static void main(String[] args) {
        double principal = 1000.0; 
        double rate = 5.0; 
        double time = 3.0; 

        
        double simpleInterest = (principal * rate * time) / 100;

        
        System.out.printf("The simple interest for a principal amount of %.2f at a rate of %.2f%% for %.2f years is: %.2f%n", 
                          principal, rate, time, simpleInterest);
    }
}
