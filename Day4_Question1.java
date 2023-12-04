class day4_Question1 { // Change class name while copying code
    static int count = 0;
    public static void main(String[] args) {
        // Example test cases
        System.out.println("Is 0 prime? " + isPrimeNumber(0)); // Expected: false
        System.out.println("Is 3 prime? " + isPrimeNumber(3)); // Expected: true
        System.out.println("Is 2 prime? " + isPrimeNumber(2)); // Expected: true
        System.out.println("Is 99 prime? " + isPrimeNumber(99)); // Expected: false
        System.out.println("Is -5 prime? " + isPrimeNumber(-5)); // Expected: false
    }

    // Create the "isPrimeNumber" method here. Accepts Integer value as parameter and should return a boolean value
    public static boolean isPrimeNumber(int number){
        if(number <= 1){
            return false;
        }
        if(number == 2){
            return true;
        }
        for(int i = 1; i <= number; i++){
            if(number % i == 0){
                count++;
            }
        }
        if(count == 2){
            return true;
        } else {
            return false;
        }
    }
}
