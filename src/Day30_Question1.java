public class Day30_Question1 { //change classname while copying code
    public static void main(String[] args) {
        // Test cases
        System.out.println(vigenereCipher("uddgh, ttr hwqeo fdbphliu", "decode")); // Expected Output: space, the final frontier
        System.out.println(vigenereCipher("May the Force be with you.", "encode")); // Expected Output: Oob xke Rbtqh fh wugj mry.
        System.out.println(vigenereCipher("Vvh qrsf rphhvwauakbj sxtobos lw whq zqgw plkqya", "decode")); // Expected Output: The most entertaining outcome is the most likely
    }

    public static String vigenereCipher(String text, String action) {
        String key = "codedamn";
        StringBuilder result = new StringBuilder();

        int keyIndex = 0;
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                boolean isUpperCase = Character.isUpperCase(c);
                char base = isUpperCase ? 'A' : 'a';
                char shiftedChar;

                if (action.equals("encode")) {
                    shiftedChar = (char) ((c + key.charAt(keyIndex) - 2 * base) % 26 + base);
                } else {
                    shiftedChar = (char) ((c - key.charAt(keyIndex) + 26) % 26 + base);
                }

                result.append(isUpperCase ? shiftedChar : Character.toLowerCase(shiftedChar));

                keyIndex = (keyIndex + 1) % key.length();
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }
}
