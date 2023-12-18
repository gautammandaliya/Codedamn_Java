public class Day18_Question1 { //change classname while copying code
    public static void main(String[] args) {
        // Challenge 1: Calculate the Factorial of 5
        System.out.println("Factorial of 5: " + factorial(5));

        // Challenge 2: Calculate the Factorial of 10
        System.out.println("Factorial of 10: " + factorial(10));

        // Challenge 3: Calculate the Factorial of 12
        System.out.println("Factorial of 12: " + factorial(12));
    }

    public static int factorial(int n) {
        // Handle the base case: 0! = 1
        if (n == 0) {
            return 1;
        }

        // Use recursion to calculate the factorial
        return n * factorial(n - 1);
    }
}
