import java.util.ArrayList;

public class ArrayLists {

    public static void main(String[] args){

        // Arraylist - a resizable array - elements can be added/removed after compiled

        // Only uses wrapperclasses/reference data types

        ArrayList<String> food = new ArrayList<>();

        food.add("hi");
        food.add("hello!");
        food.add("How is your day going?");

        food.set(0, "Hola!"); // Sets a specific position to a specific value (Position,Value)
        food.remove(1); // Removes an index inside of an arraylist
        food.clear(); // Clears the entire arraylist


        for(int i = 0; i<food.size(); i++){
            System.out.println(food.get(i));
        }

    }
}
