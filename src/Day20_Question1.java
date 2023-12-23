public class Day20_Question1 { //Change classname while copying code
    public static void main(String[] args) {
        // Test cases
        System.out.println(validateCreditCard("4532015112830366"));  // Challenge 1: Valid Credit Card
        System.out.println(validateCreditCard("4532015112830368"));  // Challenge 2: Invalid Credit Card
    }

    public static boolean validateCreditCard(String creditCardNumber) {
        // Check if the credit card number is null or empty
        if (creditCardNumber == null || creditCardNumber.isEmpty()) {
            return false;
        }

        // Remove spaces and non-digit characters
        creditCardNumber = creditCardNumber.replaceAll("[^0-9]", "");

        // Check if the credit card number has a valid length (typically 13 to 19 digits for most cards)
        if (creditCardNumber.length() < 13 || creditCardNumber.length() > 19) {
            return false;
        }

        // Apply the Luhn algorithm
        int sum = 0;
        boolean doubleDigit = false;

        for (int i = creditCardNumber.length() - 1; i >= 0; i--) {
            int digit = Character.getNumericValue(creditCardNumber.charAt(i));

            if (doubleDigit) {
                digit *= 2;

                if (digit > 9) {
                    digit = digit % 10 + 1;
                }
            }

            sum += digit;
            doubleDigit = !doubleDigit;
        }

        return sum % 10 == 0;
    }
}
