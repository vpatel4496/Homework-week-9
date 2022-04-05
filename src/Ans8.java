import java.util.HashSet;
import java.util.Set;

public class Ans8 {

    //Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
    //Show which numbers are between 1 and 10 are in the set. (Hint: use for loop
    //and if else)

    public static void main(String[] args) {
        Set<Integer> digit = new HashSet<>();
        digit.add(4);
        digit.add(7);
        digit.add(8);

        for (int i = 1; i <= 10; i++) {
            if (digit.contains(i)) {
                System.out.println(i + " found in set ");
            } else {
                System.out.println(i + " not found in set ");
            }
        }
    }
}