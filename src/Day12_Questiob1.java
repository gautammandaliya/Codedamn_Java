import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

class Day12_Questiob1 { //change classname while copying ocde
    public static void main(String[] args) {
        // Example usage
        // The values of the output assume the date 29 November 2023. The values will change based on today's date
        System.out.println(java.util.Arrays.toString(calculateAge("10-06-2023"))); // Expected Format : [5, 5, 0]
        System.out.println(java.util.Arrays.toString(calculateAge("12-11-1993"))); // Expected Format: [3, 0, 30]
    }

    // complete writing the method
    public static int[] calculateAge(String dob) {
        // Parse the input date string to LocalDate
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate birthDate = LocalDate.parse(dob, formatter);

        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Calculate the period between the two dates
        Period period = Period.between(birthDate, currentDate);

        // Extract years, months, and days from the period
        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();

        // expected output format
        return new int[]{days, months, years};
    }
}
