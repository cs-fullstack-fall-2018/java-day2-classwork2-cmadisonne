import java.util.Scanner;

public class Ex15 {
    public static void main(String[] argrs) {
        Scanner consoleInput = new Scanner(System.in);
        int initial = 0;
        System.out.println("Enter a number");
        int newNum = consoleInput.nextInt();
        while (initial < newNum) {
            initial += 1;
            System.out.println(initial);

        }
    }
}
