public class Day8_Question1 { //Change classname while copying code
    public static void main(String[] args) {
        // Example function calls
        System.out.println(binaryToDecimal("1010")); // Should output 10
        System.out.println(binaryToDecimal("111")); // Should output 7
        System.out.println(binaryToDecimal("1001")); // Should output 9
        System.out.println(binaryToDecimal("1010101")); // Should output 85
        // System.out.println(binaryToDecimal("10a1")); // Uncomment to test invalid input
    }

    // Implement the "binaryToDecimal" method here
    public static int binaryToDecimal(String binary) {
        // Check for empty string
        if (binary.isEmpty()) {
            throw new IllegalArgumentException("Input string cannot be empty");
        }

        // Check for invalid characters
        if (!binary.matches("[01]+")) {
            throw new IllegalArgumentException("Invalid characters in the input string");
        }

        // Convert binary to decimal
        int decimal = 0;
        int length = binary.length();

        for (int i = 0; i < length; i++) {
            int digit = binary.charAt(length - i - 1) - '0';
            decimal += digit * Math.pow(2, i);
        }

        return decimal;
    }
}
