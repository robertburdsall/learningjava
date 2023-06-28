import java.util.Scanner;
public class Math {

    public static void main(String[] args){

        double x = 3.14;
        double y = -10;

        //double z = java.lang.Math.max(x,y); <- gets the larger value of 2 inputs
        //double z = java.lang.Math.abs(y); <- Absolute value
        //double z = java.lang.Math.sqrt(y); <- square root
        //double z = java.lang.Math.round(x); <- round
        //double z = java.lang.Math.ceil(x) <- rounds up
        //double z = double z = java.lang.Math.floor(x) <- rounds down

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is side a of the triangle?");
        float a = scanner.nextFloat();
        System.out.println("What is side b of the triangle?");
        float b = scanner.nextFloat();

        float c = (float) java.lang.Math.sqrt((a*a) + (b*b));

        System.out.println("The Hypotneuse of your triangle is "+c+"!");

        scanner.close();

        // ^ Program that finds the hypotneuse of a triangle
    }
}
