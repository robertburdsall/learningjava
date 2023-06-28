public class Arrays {

    public static void main(String[] args){

        // array = something used to store multiple values in a single variable

        String[] cars = {"Camaro", "Corvette", "Tesla", "BMW"};

        String[] car = new String[3];
        car[0] = "Hello";
        car[1] = "hi";
        car[2] = "How are you?";

        for(int i=0; i<cars.length; i++){
            System.out.println(cars[i]);
        }

       // System.out.println(cars[0]);

    }
}
