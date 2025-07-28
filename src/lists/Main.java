package lists;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> test = new ArrayList<>();
        test.add("a");
        var a = test.getFirst();
        System.out.println(a);
    }
}
