public class Day19_Question1 { //change classname while copying code
    public static void main(String[] args) {
        // Example usage:
        double result1 = convertTemperature(25.0, "c", "k");
        System.out.println("Celsius to Kelvin: " + result1); // Expected Output: Approximately 298.15

        double result2 = convertTemperature(30.5, "c", "f");
        System.out.println("Celsius to Fahrenheit: " + result2); // Expected Output: Approximately 86.9

        double result3 = convertTemperature(300.0, "k", "c");
        System.out.println("Kelvin to Celsius: " + result3); // Expected Output: Approximately 26.85

        double result4 = convertTemperature(500.0, "k", "f");
        System.out.println("Kelvin to Fahrenheit: " + result4); // Expected Output: Approximately 440.33

        double result5 = convertTemperature(98.6, "f", "k");
        System.out.println("Fahrenheit to Kelvin: " + result5); // Expected Output: Approximately 310.15

        double result6 = convertTemperature(212.0, "f", "c");
        System.out.println("Fahrenheit to Celsius: " + result6); // Expected Output: 100.0
    }

    public static double convertTemperature(double inputValue, String currentUnit, String requiredUnit) {
        if (currentUnit.equalsIgnoreCase(requiredUnit)) {
            return inputValue; // No conversion needed
        }

        double result;

        switch (currentUnit.toLowerCase()) {
            case "c":
                if (requiredUnit.equalsIgnoreCase("k")) {
                    result = inputValue + 273.15; // Celsius to Kelvin
                } else {
                    result = (inputValue * 9/5) + 32; // Celsius to Fahrenheit
                }
                break;
            case "k":
                if (requiredUnit.equalsIgnoreCase("c")) {
                    result = inputValue - 273.15; // Kelvin to Celsius
                } else {
                    result = (inputValue - 273.15) * 9/5 + 32; // Kelvin to Fahrenheit
                }
                break;
            case "f":
                if (requiredUnit.equalsIgnoreCase("c")) {
                    result = (inputValue - 32) * 5/9; // Fahrenheit to Celsius
                } else {
                    result = (inputValue - 32) * 5/9 + 273.15; // Fahrenheit to Kelvin
                }
                break;
            default:
                throw new IllegalArgumentException("Invalid temperature unit: " + currentUnit);
        }

        // Round the result to two decimal places
        return Math.round(result * 100.0) / 100.0;
    }
}
