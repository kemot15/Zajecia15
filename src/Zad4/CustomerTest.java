package Zad4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class CustomerTest {
    public static void main(String[] args) throws FileNotFoundException {
        Map<Integer, Custromer> customerMap = getFromFile("person.txt");//new HashMap<>();
//        Custromer customer1 = new Custromer(1, "Jan", "Kowalski", 3456);
//        Custromer customer2 = new Custromer(2, "Krzysztof", "Kolumb", 34222);
//        Custromer customer3 = new Custromer(3, "Andrzej", "Nowak", 34222);

//        customerMap.put(customer1.getId(), customer1);
//        customerMap.put(customer2.getId(), customer2);
//        customerMap.put(customer3.getId(), customer3);

        Set<Integer> mapSet = customerMap.keySet();
        System.out.println(mapSet);

        Collection<Custromer> maps = customerMap.values();
        System.out.println(maps);


       // System.out.println(customerMap);
        System.out.println(customerMap.keySet());
        System.out.println(showCustomer(customerMap));
    }

    private static String showCustomer (Map<Integer, Custromer> stringMap){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj id uzytkownika");
        int id = scanner.nextInt();
        scanner.nextLine();
        if (stringMap.containsKey(id))
            return stringMap.get(id).toString();
        else
            return "Brak takiego uzytkownika";
    }

    private static Map<Integer, Custromer> getFromFile (String s ) throws FileNotFoundException {
        Map<Integer, Custromer> custromerMap = new HashMap<>();
        Scanner scanner = new Scanner(new File(s));
        String line;
        String[] split;
        Custromer custromer;
        Integer id;
        while (scanner.hasNextLine()){
            line = scanner.nextLine();
            split = line.split(";");
            id = Integer.valueOf(split[0]);
            custromer = new Custromer(id, split[1], split[2], Integer.valueOf(split[3]));
            custromerMap.put(id, custromer);
        }
        return custromerMap;
    }
}
