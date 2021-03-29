import java.util.Scanner;

public class TheGame {
    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // backEnd(100); // change it as you need
        frontEnd(); // this one uses scanner input method
    }

    static void backEnd(int finishingNum) { // finishing numbers are inclusive
        kaChingLoop(finishingNum);
    }

    static void frontEnd() {
        System.out.println("Please insert the finishing number: ");
        int end = scanner.nextInt();
        kaChingLoop(end);
    }

    private static void kaChingLoop(int end) {
        for (int i = 1; i <= end; i++){
            boolean kaching = i % 3 == 0 && i % 5 == 0; // checks if i multiple of 15
            boolean ka = i % 3 == 0;                    // checks if i multiple of 3
            boolean ching = i % 5 == 0;                 // checks if i multiple of 5
            System.out.print(kaching ? "\"ka-ching!\"" : ka ? "\"ka\"" : ching ? "\"ching!\"" :"\"" + i + "\"" );
            System.out.print(i < end ? ", " : " ");
        }
    }
}
