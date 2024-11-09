package userInput;
import java.util.Scanner;



public class UserInput {
    public static void userInput(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");

        int c;

            c = 0;
            userInput = input.nextLine();
            System.out.println("The value is: " + userInput);

        int u = Integer.parseInt(userInput);
        int sum = c + u;


    }
}
