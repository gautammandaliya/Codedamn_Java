public class Day29_Question1 {
    public static void main(String[] args) {
        // Test cases
        System.out.println(validateISBN("978-1-982181-28-4")); // Expected Output: true
        System.out.println(validateISBN("778-1-921181-28-4"));  // Expected Output: false
        System.out.println(validateISBN("9780593078754"));      // Expected Output: true
    }

    public static boolean validateISBN(String isbn) {
        // Remove hyphens and convert to uppercase for uniformity
        isbn = isbn.replaceAll("-", "").toUpperCase();

        // Check if the ISBN is of valid length (either 10 or 13 digits)
        if (isbn.length() != 10 && isbn.length() != 13) {
            return false;
        }

        if (isbn.length() == 10) {
            return validateISBN10(isbn);
        } else {
            return validateISBN13(isbn);
        }
    }

    private static boolean validateISBN10(String isbn) {
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            char digit = isbn.charAt(i);
            if (!Character.isDigit(digit)) {
                return false;
            }
            sum += (10 - i) * Character.getNumericValue(digit);
        }

        char lastDigit = isbn.charAt(9);
        if (lastDigit == 'X') {
            sum += 10;
        } else if (Character.isDigit(lastDigit)) {
            sum += Character.getNumericValue(lastDigit);
        } else {
            return false;
        }

        return sum % 11 == 0;
    }

    private static boolean validateISBN13(String isbn) {
        int sum = 0;
        for (int i = 0; i < 12; i++) {
            char digit = isbn.charAt(i);
            if (!Character.isDigit(digit)) {
                return false;
            }
            sum += (i % 2 == 0) ? Character.getNumericValue(digit) : 3 * Character.getNumericValue(digit);
        }

        char lastDigit = isbn.charAt(12);
        if (!Character.isDigit(lastDigit)) {
            return false;
        }

        return (sum + Character.getNumericValue(lastDigit)) % 10 == 0;
    }
}
