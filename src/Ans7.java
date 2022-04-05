import java.util.ArrayList;

public class Ans7 {

    // Write a Java program to test an array list is empty or not. Define array list with
    //underground tube names

    public static void main(String[] args) {
        ArrayList <String> tubeNames = new ArrayList<>();
        tubeNames.add ("BakerlooLine");
        tubeNames.add ("MetropolitanLine");
        tubeNames.add ("PiccadillyLine");
        tubeNames.add ("VictoriaLine");
        tubeNames.add ("Hammersmith&CityLine");
        tubeNames.add ("CircleLine");
        tubeNames.add ("JubileeLine");
        tubeNames.add ("CentralLine");
        tubeNames.add ("NorthenLine");
        tubeNames.add ("NorthenLine");
        tubeNames.add ("DLR");
        tubeNames.add ("DistrictLine");

        System.out.println(tubeNames.isEmpty());

        if(!tubeNames.isEmpty()){
            System.out.println("Arraylist is Empty");

        }

    }

}
