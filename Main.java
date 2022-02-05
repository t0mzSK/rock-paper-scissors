import java.util.Random;
import java.util.Scanner;

public class Main {

    public static String chooseRandom() {
        String chosen = "";
        Random random = new Random();
        int number = random.nextInt(2 + 1) + 1;

        switch (number) {
            case 1:
                chosen = "rock";
                break;
            case 2:
                chosen = "paper";
                break;
            case 3:
                chosen = "scissors";
                break;
            default:
                break;
        }
        return chosen;
    }

    public static String evaluateGame(String gesture_c, String gesture_p) {
        String result = "";

        // TIE
        if (gesture_c.equals("rock") && gesture_p.equals("rock")) result = "Tie!";
        if (gesture_c.equals("paper") && gesture_p.equals("paper")) result = "Tie!";
        if (gesture_c.equals("scissors") && gesture_p.equals("scissors")) result = "Tie!";

        // ROCK
        if (gesture_c.equals("rock") && gesture_p.equals("paper")) result = "You win!";
        if (gesture_c.equals("rock") && gesture_p.equals("scissors")) result = "You lose!";

        // PAPER 
        if (gesture_c.equals("paper") && gesture_p.equals("rock")) result = "You lose!";
        if (gesture_c.equals("paper") && gesture_p.equals("scissors")) result = "You win!";

        // SCISSORS
        if (gesture_c.equals("scissors") && gesture_p.equals("rock")) result = "You win!";
        if (gesture_c.equals("scissors") && gesture_p.equals("paper")) result = "You lose!";
        
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String computer_choice, player_choice, result;

        while (true) {
            System.out.println("-------------------");
            System.out.print("Enter your move: ");
            player_choice = scanner.nextLine();
            computer_choice = chooseRandom();
            result = evaluateGame(computer_choice, player_choice);
            System.out.print("-------------------\n");

            System.out.println("Computer has a " + computer_choice + ".");
            System.out.println(result);
        }
    }
}
