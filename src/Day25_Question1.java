import java.util.Arrays;

public class Day25_Question1 { //change classname while copying code
    public static void main(String[] args) {
        // Testing the method with different inputs
        System.out.println(isPythagoreanTriplet(new int[]{5, 4, 3})); // Expected Output: True
        System.out.println(isPythagoreanTriplet(new int[]{5, 12, 13})); // Expected Output: True
        System.out.println(isPythagoreanTriplet(new int[]{2, 3, 4})); // Expected Output: False
        System.out.println(isPythagoreanTriplet(new int[]{7, 25, 24})); // Expected Output: True
        System.out.println(isPythagoreanTriplet(new int[]{1, 5, 8})); // Expected Output: False
    }

    public static boolean isPythagoreanTriplet(int[] numbers) {
        // Check if the array has exactly three elements
        if (numbers == null || numbers.length != 3) {
            return false;
        }

        // Sort the array for easier comparison
        Arrays.sort(numbers);

        // Check if the squares of the two smaller numbers sum up to the square of the largest number
        return (numbers[0] * numbers[0] + numbers[1] * numbers[1] == numbers[2] * numbers[2]);
    }
}
