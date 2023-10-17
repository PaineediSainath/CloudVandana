import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Pangram {
    public static boolean isPangram(String input) {
        Set<Character> alphabetSet = new HashSet<>();

        for (char c : input.toLowerCase().toCharArray()) {
            if (Character.isLetter(c)) {
                alphabetSet.add(c);
            }
        }

        return alphabetSet.size() == 26;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        scanner.close();

        if (isPangram(input)) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }
}
