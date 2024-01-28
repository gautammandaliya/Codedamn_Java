public class Day30_Question1 {
    public static void main(String[] args) {
        // Test cases
        System.out.println(vigenereCipher("uddgh, ttr hwqeo fdbphliu", "decode")); // Challenge 1
        System.out.println(vigenereCipher("May the Force be with you.", "encode")); // Challenge 2
        System.out.println(vigenereCipher("Vvh qrsf rphhvwauakbj sxtobos lw whq zqgw plkqya", "decode")); // Challenge 3
    }

    public static String vigenereCipher(String text, String action) {
        String key = "codedamn";
        StringBuilder result = new StringBuilder();

        int keyIndex = 0;
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);

            if (Character.isLetter(currentChar)) {
                char base = Character.isUpperCase(currentChar) ? 'A' : 'a';
                int shift = (Character.toUpperCase(key.charAt(keyIndex)) - 'A' + 26) % 26;

                if (action.equals("encode")) {
                    currentChar = (char) (base + (currentChar - base + shift) % 26);
                } else if (action.equals("decode")) {
                    currentChar = (char) (base + (currentChar - base - shift + 26) % 26);
                }

                keyIndex = (keyIndex + 1) % key.length();
            }

            result.append(currentChar);
        }

        return result.toString();
    }
}
