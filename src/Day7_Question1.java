public class Day7_Question1 { //change the classname while copying code
    public static void main(String[] args) {
        // Test cases to verify the implementation
        System.out.println(isPalindrome("racecar")); // Should return true
        System.out.println(isPalindrome("A man, a plan, a canal ? Panama")); // Should return true
        System.out.println(isPalindrome("codedamn")); // Should return false
    }

    public static boolean isPalindrome(String text) {
        // Remove non-alphabetic characters, convert to lowercase
        String cleanedText = text.replaceAll("[^a-zA-Z]", "").toLowerCase();

        // Compare the original cleaned string with its reverse
        return cleanedText.equals(new StringBuilder(cleanedText).reverse().toString());
    }
}
