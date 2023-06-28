import java.util.Scanner;
public class Nestedloops {

    public static void main(String[] args){
        // nested loops - a loop inside of a loop


        Scanner scanner = new Scanner(System.in);
        int rows;
        int columns;
        String symbol = "";

        System.out.println("Enter how many rows you would like:");
        rows = scanner.nextInt();
        System.out.println("Enter how many columns you would like:");
        columns = scanner.nextInt();
        System.out.println("Enter the symbol you'd like to use:");
        symbol = scanner.next();

        for(int i = 1; i<=rows; i++) {
            System.out.println();
            for (int j = 1; j<=columns; j++) {
                System.out.print(symbol);
            }
        }

    }

}
