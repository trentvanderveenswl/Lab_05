import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String partyAffiliation;

        System.out.println("What is your party affiliation - (D)emocrat (R)epublican (I)ndependent:");

        partyAffiliation = scan.nextLine();

        if (partyAffiliation.equals("D")) {
            System.out.println("You get a Democratic Donkey.");
        } else if (partyAffiliation.equals("R")) {
            System.out.println("You get a Republican Elephant.");
        } else if (partyAffiliation.equals("I")) {
            System.out.println("You get an Independent Person.");
        } else {
            System.out.println("ERROR - You did not enter a valid party affiliation.");
        }
    }
}
