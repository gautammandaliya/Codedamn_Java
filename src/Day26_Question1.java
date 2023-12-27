public class Day26_Question1 { //change classname while copying code
    public static void main(String[] args) {
        // Test cases
        int[] testNumbers = {370, 371, 0, 1, 1634, 2, 123};

        for (int number : testNumbers) {
            System.out.println("Is " + number + " an Armstrong number? " + isArmstrongNumber(number));
        }
    }

    public static boolean isArmstrongNumber(int number) {
        int originalNumber = number;
        int numDigits = (int) Math.log10(number) + 1;
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, numDigits);
            number /= 10;
        }

        return sum == originalNumber;
    }
}
