import java.util.ArrayList;

public class ForEachloops {

    public static void main(String[] args){

        // for-each loop - a method of cycling through all elements in a collection

        //String[] animals = {"cat","dog","rat","bird"};

        ArrayList<String> animals = new ArrayList<String>();
        animals.add("cat");
        animals.add("dog");
        animals.add("rat");
        animals.add("bird");


        for(String i : animals){ // ((Datatype being printed) i : (collection))
            System.out.println(i);
        }

    }

}
