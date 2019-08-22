package Teoria3;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {
    public static void main(String[] args) {
        Map<Integer, String> stringMap = new HashMap<>();
        stringMap.put(111, "Jan");
        stringMap.put(2, "Jan Kowalski");
        stringMap.put(234, "Maria Nowak");
        stringMap.put(2, "Wojtek L");

        System.out.println(stringMap);

        stringMap.remove(111);
        System.out.println(stringMap);

        Set<Integer> integers = stringMap.keySet();
        System.out.println(integers);

//        Collectionsvalues = stringMap.values();
//        System.out.println(values);
    }
}
