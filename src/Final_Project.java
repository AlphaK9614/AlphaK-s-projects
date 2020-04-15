import java.util.Scanner;
import java.util.Random;
public class Final_Project {
    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {

        int tries = 1, guess;
        int randomNumber = random.nextInt(11);
        String name, question, answer;

        System.out.println(randomNumber);

        System.out.println("Yo! Wha ya nyame be boss: ");
        name = sc.next();

        System.out.println("Wha gwan, " + name);
        System.out.println();

        System.out.println("You wan fi play one gyame? [y/n]: ");
        question = sc.next();
        answer = question;

        if (answer.equals("n")) {
            System.out.println("Well me aga lagaf, liat-a");
        }

        if (answer.equals("y")) {
            System.out.println("Me a tink a one number...");
            System.out.println("Tek one guess: ");
            guess = sc.nextInt();

            while (randomNumber != guess) {
                tries += 1;


                if (guess < randomNumber) {
                    System.out.println("likle mo: ");
                    guess = sc.nextInt();

                    if (guess > randomNumber) {
                        System.out.println("likle dung, likle dung: ");
                        guess = sc.nextInt();}


                        if (guess == randomNumber) {
                            System.out.println("Ahhhh boyyyy, ya get um right");
                            System.out.println("An e tek you " + tries + " tries dawg");
                        }
                    }
                }
            }
        }
    }

