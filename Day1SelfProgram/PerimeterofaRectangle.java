package Day1SelfProgram;

public class PerimeterofaRectangle {
    public static void main(String[] args) {
        double length = 5.0; 
        double width = 3.0;  

        double perimeter = 2 * (length + width);

        System.out.printf("The perimeter of the rectangle with length %.2f and width %.2f is: %.2f%n", length, width, perimeter);
    }
    
}
