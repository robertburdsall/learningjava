import java.util.*;
public class twoDarraylists {

    public static void main(String[] args){

     // 2D ArrayList - Same thing as Arraylists, just 2D. Can be changed during runtime

        ArrayList<String> bakerylist = new ArrayList<>();
        bakerylist.add("pasta");
        bakerylist.add("garlic bread");
        bakerylist.add("donuts");

        // System.out.println(bakerylist.get(0));

        ArrayList<String> producelist = new ArrayList<>();
        producelist.add("tomatoes");
        producelist.add("zucchini");
        producelist.add("peppers");

        ArrayList<String> drinkslist = new ArrayList<>();
        drinkslist.add("soda");
        drinkslist.add("coffee");

     //   for(int i = 0; i< drinkslist.size(); i++){
     //       System.out.println(drinkslist.get(i));
     //   }


        ArrayList<ArrayList<String>> grocerylist = new ArrayList<>();
        grocerylist.add(bakerylist);
        grocerylist.add(producelist);
        grocerylist.add(drinkslist);

    }
}
