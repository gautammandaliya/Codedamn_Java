class Day29_Question1 { //change classname while copying code
    public static void main(String[] args) {
        // Example test cases
        System.out.println(validateISBN("978-1-982181-28-4")); // true
        System.out.println(validateISBN("778-1-921181-28-4")); // false
        System.out.println(validateISBN("9780593078754"));     // true
    }

    public static boolean validateISBN(String isbn) {
        // Remove hyphens and convert to upper case for case insensitivity
        isbn = isbn.replaceAll("-", "").toUpperCase();

        // Check if the ISBN has either 10 or 13 digits
        if (isbn.length() != 10 && isbn.length() != 13) {
            return false;
        }

        // Validate ISBN-10
        if (isbn.length() == 10) {
            int sum = 0;
            for (int i = 0; i < 9; i++) {
                char digit = isbn.charAt(i);
                if (!Character.isDigit(digit)) {
                    return false;
                }
                sum += Character.getNumericValue(digit) * (10 - i);
            }

            char lastChar = isbn.charAt(9);
            if (lastChar == 'X') {
                sum += 10;
            } else if (Character.isDigit(lastChar)) {
                sum += Character.getNumericValue(lastChar);
            } else {
                return false;
            }

            return sum % 11 == 0;
        }

        // Validate ISBN-13
        if (isbn.length() == 13) {
            int sum = 0;
            for (int i = 0; i < 12; i++) {
                char digit = isbn.charAt(i);
                if (!Character.isDigit(digit)) {
                    return false;
                }
                sum += (i % 2 == 0) ? Character.getNumericValue(digit) : Character.getNumericValue(digit) * 3;
            }

            return sum % 10 == 0;
        }

        return false;
    }
}
