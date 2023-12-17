public class Day17_Question1 { //change classname while copying code
    public static void main(String[] args) {
        // Test cases
        int[] test1 = {3};
        int[] result1 = squareNumbers(test1);
        printResult(test1, result1);

        int[] test2 = {1, 2, 3, 4, 5};
        int[] result2 = squareNumbers(test2);
        printResult(test2, result2);

        int[] test3 = {0};
        int[] result3 = squareNumbers(test3);
        printResult(test3, result3);

        int[] test4 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int[] result4 = squareNumbers(test4);
        printResult(test4, result4);

        int[] test5 = {-2, -1, 0, 1, 2};
        int[] result5 = squareNumbers(test5);
        printResult(test5, result5);
    }

    public static void printResult(int[] input, int[] output) {
        System.out.print("Input: [");
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i]);
            if (i < input.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]\n");

        System.out.print("Expected Output: [");
        for (int i = 0; i < output.length; i++) {
            System.out.print(output[i]);
            if (i < output.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]\n\n");
    }

    // Implementation of squareNumbers method
    public static int[] squareNumbers(int[] numbers) {
        // Create a new array to store the squared values
        int[] result = new int[numbers.length];

        // Iterate through the input array and square each number
        for (int i = 0; i < numbers.length; i++) {
            result[i] = numbers[i] * numbers[i];
        }

        return result;
    }
}
