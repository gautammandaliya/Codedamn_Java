public class Day13_Question1 { //change classname while copying code
    public static void main(String[] args) {
        // Example test cases
        System.out.println(isAnagram("test", "test")); // true
        System.out.println(isAnagram("Listen", "Silent")); // true
        System.out.println(isAnagram("hello", "world")); // false
        System.out.println(isAnagram("Astronomer", "Moon starer")); // true
    }

    public static boolean isAnagram(String str1, String str2) {
        // Remove spaces and convert to lowercase for case-insensitive comparison
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // Check if the sorted characters of both strings are equal
        return sortString(str1).equals(sortString(str2));
    }

    private static String sortString(String str) {
        // Convert the string to char array, sort, and create a new string
        char[] charArray = str.toCharArray();
        java.util.Arrays.sort(charArray);
        return new String(charArray);
    }
}
