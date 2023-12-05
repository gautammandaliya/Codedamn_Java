public class Day5_Question1 { //change classname while cpoying code
    public static void main(String[] args) {
        // Test cases
        System.out.println("sumOfIntegers(10) = " + sumOfIntegers(10)); // Expected output: 55
        System.out.println("sumOfIntegers(0) = " + sumOfIntegers(0));   // Expected output: 0
        System.out.println("sumOfIntegers(7) = " + sumOfIntegers(7));   // Expected output: 28
        System.out.println("sumOfIntegers(18) = " + sumOfIntegers(18)); // Expected output: 171
    }
    public static int sumOfIntegers(int value){
        int sum = 0;
        for(int i = 1; i <= value; i++){
            sum = sum + i;
        }
        return sum;
    }
}
