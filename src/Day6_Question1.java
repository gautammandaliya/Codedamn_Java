public class Day6_Question1 {  //change the classname while copying code
    public static void main(String[] args) {
        // Test cases can be added here to validate the method's functionality.

        // Test case 1
        Object[] result1 = calculateBMI(170, 65); // height in cm, weight in kg
        System.out.println("BMI: " + result1[0] + ", Category: " + result1[1]);

        // Test case 2
        Object[] result2 = calculateBMI(180, 77); // height in cm, weight in kg
        System.out.println("BMI: " + result2[0] + ", Category: " + result2[1]);

        // Test case 3
        Object[] result3 = calculateBMI(190, 92); // height in cm, weight in kg
        System.out.println("BMI: " + result3[0] + ", Category: " + result3[1]);
    }

    public static Object[] calculateBMI(double height, double weight) {
        if (height <= 0 || weight <= 0) {
            // Handle invalid inputs
            System.out.println("Invalid height or weight.");
            return null;
        }

        // Convert height to meters
        double heightInMeters = height / 100.0;

        // Calculate BMI
        double bmi = weight / (heightInMeters * heightInMeters);

        // Round BMI to two decimal places
        bmi = Math.round(bmi * 100.0) / 100.0;

        // Determine BMI category
        String category;
        if (bmi < 18.5) {
            category = "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            category = "Healthy";
        } else if (bmi >= 25.0 && bmi <= 29.9) {
            category = "Overweight";
        } else {
            category = "Obesity";
        }

        // Create and return the result array
        return new Object[]{bmi, category};
    }
}
