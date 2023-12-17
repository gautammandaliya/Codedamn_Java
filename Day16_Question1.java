public class Day16_Question1 { //change classname while copying code
    public static void main(String[] args) {
        // Test cases
        System.out.println(generateHexCode(0, 0, 0));          // Black
        System.out.println(generateHexCode(255, 255, 255));    // White
        System.out.println(generateHexCode(255, 255, 0));      // Yellow
    }

    public static String generateHexCode(int red, int green, int blue) {
        // Converting each RGB component to a 2-digit hexadecimal string in uppercase
        String redHex = String.format("%02X", red);
        String greenHex = String.format("%02X", green);
        String blueHex = String.format("%02X", blue);

        // Concatenating the hex strings with a leading '#'
        return "#" + redHex + greenHex + blueHex;
    }
}
