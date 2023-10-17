import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToInteger {

    public int romanToInt(String s) {
        Map<String, Integer> romanMap = new HashMap<>();
        //Example
        romanMap.put("IX", 9);
        // We can store as many numbers as we need and print them.
        romanMap.put("I", 1);
        romanMap.put("V", 5);
        romanMap.put("X", 10);
        romanMap.put("L", 50);
        romanMap.put("C", 100);
        romanMap.put("D", 500);
        romanMap.put("M", 1000);

        int n = s.length();
        int num = romanMap.get(s.substring(n - 1));

        for (int i = n - 2; i >= 0; i--) {
            if (romanMap.get(s.substring(i, i + 1)) >= romanMap.get(s.substring(i + 1))) {
                num += romanMap.get(s.substring(i, i + 1));
            } else {
                num -= romanMap.get(s.substring(i, i + 1));
            }
        }
        return num;
    }

    public static void main(String[] args) {
        RomanToInteger romanConverter = new RomanToInteger();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Roman numeral: ");
        String input = scanner.nextLine().toUpperCase();

        scanner.close();

        int result = romanConverter.romanToInt(input);
        System.out.println("The numeric value of " + input + " is " + result);
    }
}
