import java.util.Scanner;
/*
This a popular kids counting game in Java.
The rules of the game are as follows:
In turns, the players start counting upwards beginning with "1".
For every multiple of 3, instead of calling the number itself, the player has to call out "ka"
For every multiple of 5, instead of calling the number itself, the player has to call out "ching!"
Which leads to every multiple of 15 being called out as "ka-ching!"
*/
/*
All you should do is to choose the way to play this game.
first option is to do it through backEnd(n), and "n" here is the last number of the game:
second option is to do it through frontEnd(), and here your insert the finishing number after running the game.
*/
public class TheGame {
    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // backEnd(100); // change the number it as you need
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
            boolean mult3 = i % 3 == 0;                    // checks if i multiple of 3
            boolean mult5 = i % 5 == 0;                 // checks if i multiple of 5
            boolean mult15 = mult3 && mult5;              // checks if i multiple of 15
            String ka = "\"ka\"";                       // String used here to reduce redundancy
            String ching = "\"ching!\"";
            String output = mult15 ? "\"" + ka + "-" + ching + "\"" : mult3 ? ka : mult5 ? ching :"\"" + i + "\"";
            System.out.print(i < end ? output + ", " : output + ".");
        }
    }
}
