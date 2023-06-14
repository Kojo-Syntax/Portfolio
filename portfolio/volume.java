import java.util.*;
public class volume {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        double vol = 0.0;

        double pi = Math.PI;
        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        vol = 4.0/3 * pi * Math.pow(radius, 3);
        System.out.println(vol);
    }
}