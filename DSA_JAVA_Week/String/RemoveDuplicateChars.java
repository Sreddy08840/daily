import java.util.LinkedHashSet;

public class RemoveDuplicateChars {
    public static void main(String[] args) {
        String str = "programming";
        str = str.toLowerCase(); // Optional: handle case-insensitive

        // Use LinkedHashSet to maintain order and remove duplicates
        LinkedHashSet<Character> set = new LinkedHashSet<>();

        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }

        // Build new string without duplicates
        StringBuilder sb = new StringBuilder();
        for (Character ch : set) {
            sb.append(ch);
        }

        System.out.println("Original String: " + str);
        System.out.println("String after removing duplicates: " + sb);
    }
}
