import java.util.HashMap;
import java.util.Map;

public class Ans9 {

    // Create a HashMap object called people that will store String keys and Integer
    //values: And use for each loop to iterate the value from Map.

    public static void main(String[] args) {

        // Declare Map
        // ArrayList<String> list = new ArrayList();
        Map<String, Integer> currency = new HashMap<>();
        currency.put("Rupees", 1);
        currency.put("Pound", 2);
        currency.put("Dollar", 3);
        currency.put("Dinar", 4);
        currency.put("Dirham",5);

        // Iterate Data

        for(Map.Entry<String, Integer> localCurrency :currency.entrySet() ){
            System.out.println(localCurrency.getValue());

        }
    }

}
