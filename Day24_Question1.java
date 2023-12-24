public class Day24_Question1 { //change classname while copying code
    public static void main(String[] args) {
        // Test cases
        System.out.println(compressString("aaabbc")); // Expected Output: a3b2c1
        System.out.println(compressString("abcd"));   // Expected Output: a1b1c1d1
        System.out.println(compressString("zzzzz"));  // Expected Output: z5
        System.out.println(compressString("!@##$$%")); // Expected Output: !1@2#2$2%1
    }

    public static String compressString(String input) {
        if (input == null || input.length() == 0) {
            return ""; // Handle edge case of an empty string
        }

        StringBuilder compressed = new StringBuilder();
        char currentChar = input.charAt(0);
        int count = 1;

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == currentChar) {
                count++;
            } else {
                compressed.append(currentChar).append(count);
                currentChar = input.charAt(i);
                count = 1;
            }
        }

        // Append the last character and its count
        compressed.append(currentChar).append(count);

        return compressed.toString();
    }
}
