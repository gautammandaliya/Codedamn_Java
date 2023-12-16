public class Day15_Question1 { //change classname while copying code
    public static void main(String[] args) {
        // Example usage
        double miles = 10;
        double kilometers = 16.0934;

        double convertedToKilometers = convertToKilometers(miles);
        double convertedToMiles = convertToMiles(kilometers);

        System.out.println(miles + " miles is " + convertedToKilometers + " kilometers.");
        System.out.println(kilometers + " kilometers is " + convertedToMiles + " miles.");
    }

    public static double convertToKilometers(double miles) {
        // 1 mile = 1.60934 kilometers
        return miles * 1.60934;
    }

    public static double convertToMiles(double kilometers) {
        // 1 kilometer = 0.621371 miles
        return kilometers * 0.621371;
    }
}
