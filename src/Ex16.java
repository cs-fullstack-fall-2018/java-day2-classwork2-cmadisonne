import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner consoleInput = new Scanner(System.in);
        System.out.println("Enter a number");
        int initial = consoleInput.nextInt();
        System.out.println("Enter another number");
        int newNum = consoleInput.nextInt();
        while (initial != newNum) {
            initial += 1;
            System.out.println(initial);

        }
    }
}
