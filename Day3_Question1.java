class Day3_Question1 { //Change class name while copying
    public static void main(String[] args) {
        // Example calls to test the method
        System.out.printf("%.2f\n", calculateSimpleInterest(2000, 5, 10));  // Expected output: 1000.00
        System.out.printf("%.2f\n", calculateSimpleInterest(10000, 3, 1));  // Expected output: 300.00
        System.out.printf("%.2f\n", calculateSimpleInterest(10000, 6, 10)); // Expected output: 6000.00
        System.out.printf("%.2f\n", calculateSimpleInterest(10000, 0, 10)); // Edge case: Expected output: 0.00
    }

    // Define your "calculateSimpleInterest" method here, the method should return a double value and all input parameters should be of type double
    public static double calculateSimpleInterest(double principal, double rate, double time){
        double simpleInterest = (principal * rate* time) / 100.0;
        simpleInterest = Math.round(simpleInterest * 100.0) / 100.0;
        return simpleInterest;
    }

}
