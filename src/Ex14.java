import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args){
        System.out.println("Enter a number");
        Scanner consoleInput = new Scanner(System.in);
        int numberOfHyphens = consoleInput.nextInt();
        printsThatMany(numberOfHyphens);
    }
    public static void printsThatMany(int numberOfHyphens){
        System.out.println(numberOfHyphens);
        int start = 0;
        while (start < numberOfHyphens){
            System.out.print("-");
            start = start + 1;
        }



    }
}
