package Zad2;

import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Person> people = new LinkedList<>();
        people.offer(new Person("Jan", "Nowak", 345345));
        people.offer(new Person("Jakub", "Kowalski", 456565));
        people.offer(new Person("Anna", "Zawadzka", 345453));

        for (Person person : people) {
            System.out.println("Pacjent " + person.toString() + " proszony jest do gabinetu");
            System.out.println("Pacjent " + person.toString() + " obsluzony");
        }

        while (people.peek() != null){
            System.out.println("Pacjent " + people.peek() + " proszony jest do gabinetu");
            System.out.println("Pacjent " + people.poll() + " obsluzony");
        }

    }
}
