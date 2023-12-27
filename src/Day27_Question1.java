public class Day27_Question1 { //change classname while copying code
    public static void main(String[] args) {
        // Testing the countSteps method with the specified test cases
        int result;

        // Test with number 7
        result = countSteps(7);
        System.out.println("Steps for 7: " + result + " (Expected: 16)");

        // Test with number 6
        result = countSteps(6);
        System.out.println("Steps for 6: " + result + " (Expected: 8)");

        // Test with number 16
        result = countSteps(16);
        System.out.println("Steps for 16: " + result + " (Expected: 4)");

        // Test with number 1
        result = countSteps(1);
        System.out.println("Steps for 1: " + result + " (Expected: 0)");
    }

    public static int countSteps(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Input must be a positive integer");
        }

        int steps = 0;
        while (n != 1) {
            if (n % 2 == 0) {
                // If n is even, divide it by 2
                n /= 2;
            } else {
                // If n is odd, multiply it by 3 and add 1
                n = 3 * n + 1;
            }
            steps++;
        }

        return steps;
    }
}
