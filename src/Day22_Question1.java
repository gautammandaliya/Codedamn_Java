public class Day22_Question1 { //change classname while copying code
    public static void main(String[] args) {
        // Test cases
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {15, 20, 25};
        int[] array3 = {12, 18};
        int[] emptyArray = {};
        int[] singleElementArray = {5};

        System.out.println("LCM of [1, 2, 3, 4]: " + calculateLCM(array1));
        System.out.println("LCM of [15, 20, 25]: " + calculateLCM(array2));
        System.out.println("LCM of [12, 18]: " + calculateLCM(array3));
        System.out.println("LCM of []: " + calculateLCM(emptyArray));
        System.out.println("LCM of [5]: " + calculateLCM(singleElementArray));
    }

    public static int calculateLCM(int[] array) {
        // Handle edge case: Empty array
        if (array.length == 0) {
            // You can choose to return a default value or throw an exception here
            // For simplicity, returning 0 in this case
            return 0;
        }

        // Initialize result as the first element of the array
        int result = array[0];

        // Iterate through the array and calculate LCM using GCD
        for (int i = 1; i < array.length; i++) {
            result = calculateLCMHelper(result, array[i]);
        }

        return result;
    }

    // Helper method to calculate GCD (using Euclid's algorithm)
    private static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Helper method to calculate LCM using GCD
    private static int calculateLCMHelper(int a, int b) {
        return (a * b) / calculateGCD(a, b);
    }
}
