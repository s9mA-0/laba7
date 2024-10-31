import java.util.HashMap;

public class MapExample {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<String, String>();

        map.put("Олег", "0987267777");
        map.put("Іван", "0982637777");
        map.put("Остап", "0981237777");
        map.put("Андрій", "098274952");
        map.put("Дмитро", "0982738592");

        for (String key: map.keySet())
        {
            String value = map.get(key);
            System.out.println(key + " : " + value);
        }


    }
}