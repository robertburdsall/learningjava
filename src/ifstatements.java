import java.util.Scanner;
public class ifstatements {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("How old are you?");
        int age = scanner.nextInt();

        if(age >=75){
            System.out.println("You are very old!");
        }
        else if(age>=18){
            System.out.println("You are an adult!");
        }
        else {
            System.out.println("You are not an adult!");
        }


    }
}
