public class Ans3 {

    // Write a Java program to reverse an array of integer values.

    public static void main(String[] args) {
        int [] p = new int []{96,19,04,04};

        System.out.println("Original array: ");
        for (int a = 0; a<p.length; a++){
            System.out.print(p[a]+" ");
        }
            System.out.println();
            System.out.println("Arrey in reverse order: ");
            for(int a = p.length-1; a>=0; a--){
                System.out.print(p[a]+" ");
            }

    }

}
