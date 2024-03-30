
// Online Java Compiler
import java.util.Scanner;

class Miniproject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mynumber = (int) (Math.random() * 100);
        int x;
        do {
            System.out.println("Guess the number:");
            x = sc.nextInt();
            if (x > mynumber) {
                System.out.println("Number is large");
            } else {
                System.out.println("Number is Small");
            }
        } while (x != mynumber);
        System.out.println("Correct number guessed");

    }
}