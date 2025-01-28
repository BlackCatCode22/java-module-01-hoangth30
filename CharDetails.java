import java.util.Scanner;

public class CharDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char character = scanner.next().charAt(0);
        int unicode = character;
        boolean isLetter = Character.isLetter(character);
        boolean isDigit = Character.isDigit(character);

        System.out.println("Unicode value: " + unicode);
        System.out.println("Is letter: " + isLetter);
        System.out.println("Is digit: " + isDigit);

        scanner.close();
    }
}
