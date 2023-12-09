public class Day9_Question1 { //Change classname while copying code
    public static void main(String[] args) {
        // Test cases
        System.out.println("isPowerOfTwo(1): " + isPowerOfTwo(1)); // Should return true
        System.out.println("isPowerOfTwo(5): " + isPowerOfTwo(5)); // Should return false
        System.out.println("isPowerOfTwo(16): " + isPowerOfTwo(16)); // Should return true
        System.out.println("isPowerOfTwo(-2): " + isPowerOfTwo(-2)); // Should return false
        System.out.println("isPowerOfTwo(0): " + isPowerOfTwo(0)); // Should return false
    }

    // Method to check if a given integer is a power of two
    public static boolean isPowerOfTwo(int number) {
        // Handling edge cases
        if (number <= 0) {
            return false;
        }

        // Using bitwise AND operation to check if there is only one bit set to 1
        return (number & (number - 1)) == 0;
    }
}
