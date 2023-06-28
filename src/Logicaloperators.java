import java.util.Scanner;
public class Logicaloperators {
    public static void main(String[] args){

     // logical operators connect two or more expressions

     // && (AND) - Checks if both conditions are true
     // || (OR) - Checks if one of the conditions are true
     // ! (NOT) - Reverses the value of a condition

      //  Scanner scanner = new Scanner(System.in);

      //  System.out.println("What is the temperature outside?");


      //  int temp = scanner.nextInt();

    //    if(temp>=30) {
    //        System.out.println("It is hot outside!");
    //    }
    //    else if (temp>=20 && temp<=30) {
   //         System.out.println("It is warm ish outside!");
   //     }
   //     else {
    //        System.out.println("It is cold outside!");
   //     }

        Scanner scanner = new Scanner(System.in);

        System.out.println("Do you want to quit the game? Press q or Q to quit");
        String response = scanner.next();
        if(!response.equals("q") && !response.equals("Q")){
            System.out.println("You are still playing the game!");
        }
        else{
            System.out.println("You have quit the game!");
        }


    }
}
