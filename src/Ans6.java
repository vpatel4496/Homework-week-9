import java.util.ArrayList;

public class Ans6 {

    //Write a Java program to retrieve an element (at a specified index) from a given
    //array list

    public static void main(String[] args) {
        ArrayList<String> hillStation = new ArrayList<>();
        hillStation.add ("Shimla");
        hillStation.add ("Nainital");
        hillStation.add ("Darjeeling");
        hillStation.add ("Srinagar");
        hillStation.add ("Manali");
        hillStation.add ("Munnar");
        hillStation.add ("Ooty");
        hillStation.add ("Mussoorie");
        hillStation.add ("Mahabaleshwar");
        hillStation.add ("Shillong");
        hillStation.add ("MountAbu");

        // Get

        System.out.println(hillStation.get(10));
    }
}
