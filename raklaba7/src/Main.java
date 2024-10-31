import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();

        myList.add("asdasd");
        myList.add("zxczxc");
        myList.add("mnbmnb");

        System.out.println("Список: " + myList);

        myList.set(1, "ZXCZXC");
        System.out.println("Після редагування: " + myList);

        myList.remove(0);
        System.out.println("Після видалення: " + myList);

        String element = myList.get(1);
        System.out.println("Отриманий елемент: " + element);
    }
}
