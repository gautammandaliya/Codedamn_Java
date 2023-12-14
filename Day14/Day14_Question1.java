import java.util.HashMap;
import java.util.Map;

class Day14_Question1 { //change classname while copying code
    public static void main(String[] args) {
        // Example test cases
        System.out.println(calculateVowels("hello world")); // {e=1, o=2}
        System.out.println(calculateVowels("rhythm")); // {a=0, e=0, i=0, o=0, u=0}
    }

    public static Map<Character, Integer> calculateVowels(String input) {
        // Create a map to store vowel counts
        Map<Character, Integer> vowelCounts = new HashMap<>();

        // Initialize vowel counts to 0
        vowelCounts.put('a', 0);
        vowelCounts.put('e', 0);
        vowelCounts.put('i', 0);
        vowelCounts.put('o', 0);
        vowelCounts.put('u', 0);

        // Convert the input string to lowercase for case-insensitive comparison
        input = input.toLowerCase();

        // Iterate through each character in the input string
        for (char ch : input.toCharArray()) {
            // Check if the character is a vowel
            if ("aeiou".indexOf(ch) != -1) {
                // Increment the count in the map
                vowelCounts.put(ch, vowelCounts.get(ch) + 1);
            }
        }

        // Return the map with vowel counts
        return vowelCounts;
    }
}
