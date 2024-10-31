import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Анна", "Олексій", "Анна", "Іван", "Марія");
        Set<String> uniqueNames = new LinkedHashSet<>(names);
        boolean containsMyName = uniqueNames.contains("Іван");

        System.out.println("Унікальні імена: " + uniqueNames.size() + " " + String.join(", ", uniqueNames));
        System.out.println(containsMyName);
    }
}