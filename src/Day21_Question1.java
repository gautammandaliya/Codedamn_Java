public class Day21_Question1 { //change classname while copying code
    public static void main(String[] args) {
        // Testing the calculatedGCD method with the provided challenges
        System.out.println("GCD of 54 and 24: " + calculatedGCD(54, 24)); // Expected output: 6
        System.out.println("GCD of 35 and 49: " + calculatedGCD(35, 49)); // Expected output: 7
        System.out.println("GCD of 1 and 15: " + calculatedGCD(1, 15));   // Expected output: 1
        System.out.println("GCD of 0 and 15: " + calculatedGCD(0, 15));   // Expected output: 15
    }

    public static int calculatedGCD(int a, int b) {
        // Handle the case when b is 0
        if (b == 0) {
            return a;
        }

        // Calculate GCD using Euclid's algorithm
        return calculatedGCD(b, a % b);
    }
}
