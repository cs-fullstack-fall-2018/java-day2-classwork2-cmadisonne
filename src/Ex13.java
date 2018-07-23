public class Ex13 {
    public static void main(String[] args) {
        loopCounter();
        loopCounter();
        loopCounter();
    }

    public static void loopCounter() {
        int initial = 0;
        while (initial < 5) {
            initial += 1;
            System.out.println(initial);
        }
    }

}
