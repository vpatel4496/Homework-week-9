import java.util.Scanner;

public class Ans2 {

    // Write the student mark sheet programme using if else and while loop.
    // >100         = Error
    // 80-100 Grade = Distinction
    // 70-79 Grade = First Class
    // 60-69 Grade = Second Class
    // 50-59 Grade = Third Class
    // 35-49 Grade = Pass Class
    // <35   Garde = Fail.
    // Print MarkSheet Including Student Name, Student Id No:, Subjects, Marks, TotalMarks, Percentage, Result and Grade.

    public static void main(String[] args) {
        // Scanner Declaration
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Student Name");
        String name = scanner.next();
        System.out.println("Enter Student Id No");
        int studentIdNo = scanner.nextInt();
        System.out.println("Enter Marks of Subject Economics");
        int EconomicsMarks = scanner.nextInt();
        if (EconomicsMarks < 0 || EconomicsMarks > 100) {
            System.out.println("Inappropriate Command,");
            System.out.println("Please Enter Correct Marks");
            EconomicsMarks = scanner.nextInt();
        }
        System.out.println("Enter Marks of Subject Psychology");
        int PsychologyMarks = scanner.nextInt();
        if (PsychologyMarks < 0 || PsychologyMarks > 100) {
            System.out.println("Inappropriate Command,");
            System.out.println("Please Enter Correct Marks");
            PsychologyMarks = scanner.nextInt();
        }
        System.out.println("Enter Marks of Subject Sanskrit");
        int SanskritMarks = scanner.nextInt();
        if (SanskritMarks < 0 || SanskritMarks > 100) {
            System.out.println("Inappropriate Command,");
            System.out.println("Please Enter Correct Marks");
            SanskritMarks = scanner.nextInt();
        }
        int total = sum (EconomicsMarks, PsychologyMarks, SanskritMarks);
        int percentage = (total * 100) / 300;
        String result = calculateResult(EconomicsMarks, PsychologyMarks, SanskritMarks);
        String grade = calculateGrade (percentage, result);
         printMarkSheet(name, studentIdNo, EconomicsMarks, PsychologyMarks, SanskritMarks, total, percentage, result, grade);
        scanner.close();
    }
    // Total and Result Assign
    public static int sum (int a, int b, int c){
        return a + b + c;
    }
    public static String calculateResult(int EconomicsMarks, int PsychologyMarks, int Sanskritmarks){
        if (EconomicsMarks < 35 || PsychologyMarks < 35 || Sanskritmarks < 35){
            return "Fail";
        } else {
            return "Pass";
        }

    }
    // Grade Assign
    public static String calculateGrade(int percentage, String result){
        String grade = null;
        if (result.equalsIgnoreCase("Pass")){
            if (percentage >=80){
                grade = "Distinction";
            } else if (percentage >=70){
                grade = "First Class";
            } else if (percentage >=60){
                grade = "Second Class";
            } else if (percentage >=50){
                grade = "Third Class";
            } else if (percentage >=35){
                grade = "Pass Class";
            }
        } else {
            grade = "-";
        }
        return grade;
    }
        // MarkSheet Layout
    public static void printMarkSheet(String name, int StudentId, int EconomicsMarks, int PsychologyMarks,
                                      int SanskritMarks, double total, double percentage, String result, String grade){
        System.out.println("-----------------------------");
        System.out.println("|                           |");
        System.out.println("| Mark Sheet                |");
        System.out.println("|___________________________|");
        System.out.println("| Name:" + name + "              |");
        System.out.println("| Student Id:" + StudentId + "           |");
        System.out.println("|___________________________|");
        System.out.println("| Subjects: Marks           |");
        System.out.println("|___________________________|");
        System.out.println("| Math:" + EconomicsMarks + "                   |");
        System.out.println("| Science:" + PsychologyMarks + "                |");
        System.out.println("| English:" + SanskritMarks + "                |");
        System.out.println("|___________________________|");
        System.out.println("| Total:" + total + "               |");
        System.out.println("|___________________________|");
        System.out.println("| Percentage:" + percentage + "           |");
        System.out.println("| Result:" + result + "               |");
        System.out.println("| Grade:" + grade + "         |");
        System.out.println("|___________________________|");
    }
    }

