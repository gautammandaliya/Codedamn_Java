public class Day10_Question1 { //change classname whilw copying ocde
    public static void main(String[] args) {
        // Test cases
        System.out.println("Sum of digits (5): " + sumOfDigits(5));  // Expected Output: 5
        System.out.println("Sum of digits (34): " + sumOfDigits(34));  // Expected Output: 7
        System.out.println("Sum of digits (129): " + sumOfDigits(129)); // Expected Output: 3
        System.out.println("Sum of digits (54321): " + sumOfDigits(54321)); // Expected Output: 6
    }

    // Create the sumOfDigits method here
    public static int sumOfDigits(int number) {
        // If the input is already a single digit, return the input itself
        while (number > 9) {
            int sum = 0;
            // Sum the digits of the number
            while (number > 0) {
                sum += number % 10;
                number /= 10;
            }
            number = sum;
        }
        return number;
    }
}
