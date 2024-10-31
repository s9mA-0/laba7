import java.util.HashMap;
import java.util.Map;

public class MapLetter {
    public static void main(String[] args) {
        String word = "Абракадабра";

        Map<Character, Integer> letterCount = new HashMap<>();

        for (char letter : word.toCharArray()) {
            letterCount.put(letter, letterCount.getOrDefault(letter, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : letterCount.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
