import java.util.ArrayList;
import java.util.Iterator;

public class Ans5 {

    // Write a Java program to iterate through all elements in an array list using
    //Iterator.

    public static void main(String[] args) {
        ArrayList<String> nationalHero = new ArrayList<>();
        nationalHero.add ("BhagatSingh");
        nationalHero.add ("ChandreShekharAzad");
        nationalHero.add ("Sukhdev");
        nationalHero.add ("UdhamSingh");
        nationalHero.add ("Rajguru");
        nationalHero.add ("SubhasChandraBose");
        nationalHero.add ("KartarSinghSaraba");
        nationalHero.add ("SardarPatel");

        // Iterator set using Iterator interface
        Iterator itr = nationalHero.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }


    }
}
