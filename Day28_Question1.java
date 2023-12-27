
    import java.util.HashMap;
import java.util.Map;

    public class Day28_Question1 {//change classname while copying code
        public static void main(String[] args) {
            // Test cases
            System.out.println(calculateIPCount("74.125.227.0", 26)); // Expected Output: {lastIP=74.125.227.63, count=64}
            System.out.println(calculateIPCount("74.125.227.0", 29)); // Expected Output: {lastIP=74.125.227.7, count=8}
            System.out.println(calculateIPCount("74.125.227.0", 13)); // Expected Output: {lastIP=74.127.255.255, count=524288}
        }

        public static Map<String, Object> calculateIPCount(String ipAddress, int cidr) {
            Map<String, Object> result = new HashMap<>();

            // Parse IP address
            String[] ipParts = ipAddress.split("\\.");
            int[] ipIntParts = new int[4];
            for (int i = 0; i < 4; i++) {
                ipIntParts[i] = Integer.parseInt(ipParts[i]);
            }

            // Calculate count of available IP addresses
            long count = (long) Math.pow(2, 32 - cidr);

            // Calculate last IP address
            int lastIPPart = (int) (ipIntParts[3] + count - 1);

            // Ensure lastIPPart does not exceed 255
            lastIPPart = Math.min(lastIPPart, 255);

            int[] lastIPParts = {
                    ipIntParts[0],
                    ipIntParts[1],
                    ipIntParts[2],
                    lastIPPart
            };
            String lastIP = String.format("%d.%d.%d.%d", lastIPParts[0], lastIPParts[1], lastIPParts[2], lastIPParts[3]);

            // Populate the result map
            result.put("count", count);
            result.put("lastIP", lastIP);

            return result;
        }
    }

}
