import java.util.HashMap;

public class CharFrequency {
    public static void main(String[] args) {
        String str = "Santosh Reddy";  // Input string
        str = str.toLowerCase();       // Convert to lowercase for uniform counting

        // Use HashMap to store character frequencies
        HashMap<Character, Integer> freqMap = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Ignore spaces
            if (ch != ' ') {
                if (freqMap.containsKey(ch)) {
                    freqMap.put(ch, freqMap.get(ch) + 1); // Increment count
                } else {
                    freqMap.put(ch, 1); // First occurrence
                }
            }
        }

        // Print frequencies
        System.out.println("Character Frequencies:");
        for (Character key : freqMap.keySet()) {
            System.out.println(key + " : " + freqMap.get(key));
        }
    }
}
