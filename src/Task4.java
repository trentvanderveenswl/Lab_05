import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int age;

        System.out.println("Enter in your age:");

        if (scan.hasNextInt()) {
            age = scan.nextInt();
            if (age >= 21) {
                System.out.println("You get a paper wristband.");
            }
        } else {
            System.out.println("You did not enter a valid age.");
        }
    }
}
