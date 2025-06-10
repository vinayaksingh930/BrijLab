package Day1;

public class VolumeofaCylinder {
    public static void main(String[] args) {
        double radius = 5.0; 
        double height = 10.0; 
        double volume = Math.PI * Math.pow(radius, 2) * height;
        
        System.out.printf("The volume of the cylinder with radius %.2f and height %.2f is %.2f%n", radius, height, volume);
    }
}
