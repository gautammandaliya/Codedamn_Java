public class Day2_Question1 { // Change the class name while copying
    public static void main(String[] args) {
        // Test cases
        System.out.println("2000 is leap year: " + isLeapYear(2000)); // Should return true
        System.out.println("1989 is leap year: " + isLeapYear(1989)); // Should return false
        System.out.println("2100 is leap year: " + isLeapYear(2100)); // Should return false
    }

    // Implement the "isLeapYear" method
    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true; // It is a leap year
        } else {
            return false; // It is not a leap year
        }
    }
}
