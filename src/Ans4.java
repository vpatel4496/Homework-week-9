import java.util.ArrayList;

public class Ans4 {
   // new array list, add some colours (string)

    public static void main(String[] args) {
        ArrayList<String> colourList = new ArrayList<>();
        colourList.add ("Saffron");
        colourList.add ("White");
        colourList.add ("Green");
        colourList.add ("Black");
        colourList.add ("Brown");

        //Iteration
        for(String colourName : colourList){
            System.out.println(colourName);
        }
    }



}
