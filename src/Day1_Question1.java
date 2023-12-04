public class Day1_Question1 { //Change the name of class while copying
    public static void main(String[] args) {
        // Example usage of the reverseString method
        String example1 = reverseString("codedamn");
        String example2 = reverseString("123");

        // Output the results
        System.out.println(example1); // Expected output: nmadedoc
        System.out.println(example2); // Expected output: 321
    }
    public static String reverseString(String takingInput){
        char[] charArray = takingInput.toCharArray();
        int start = 0;
        int end = charArray.length - 1;
        while(start < end){
            char temp  = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }
        String reversedString = new String(charArray);
        return reversedString;
    }
}
