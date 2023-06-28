import java.util.Scanner;
public class Whileloops {

    public static void main(String[] args){
        // While loops - executes code as long as the condition remains true
        // do loop - performs block of code once until while loop is hit
        Scanner scanner = new Scanner(System.in);
        String name = "";

        while(name.isBlank()){
            System.out.print("Enter your name!");
            name = scanner.nextLine();
        }
        System.out.println("Hello, "+name+"!");

    }
}
