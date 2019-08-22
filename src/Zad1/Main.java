package Zad1;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Person> people = new TreeSet<>();
        people.add(new Person("Jan", "Kowalski", 45));
        people.add(new Person("Piotr", "Kowalski", 23));
        people.add(new Person("Ela", "Duda", 43));
        people.add(new Person("Krzysztof", "Wszd", 12));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Czym maja byc rozdzielon dane w pliu?");
        String separator = scanner.nextLine();
        try {
            saveFile(people, separator);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Iterator<Person> iterator = people.iterator();
        while (iterator.hasNext()){
            Person person = iterator.next();
            System.out.println(person);
        }
    }

    private static void saveFile (Set<Person> people, String separator) throws IOException {
        File file = new File("person.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter((file)));
        for (Person person: people) {
            bw.write(person.getFirstName()+separator+person.getLastName()+separator+person.getAge());
            bw.newLine();
        }
        bw.close();
    }
}
