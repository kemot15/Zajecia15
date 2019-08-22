package Zad3;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        showNumbers(getNumbers());
    }

    private static void showNumbers (Queue<Integer> numbers){
        for (Integer num: numbers) {
            System.out.println(num*num);
        }
        while (numbers.peek()!=null){
            Integer integer = numbers.poll();
            System.out.println(integer*integer);
        }
    }

    private static Queue<Integer> getNumbers (){
        Scanner scanner = new Scanner(System.in);
        Queue<Integer> numbers = new PriorityQueue<>();
        System.out.println("Ile liczb mam byc wczytanych?");
        int qtyNumbers = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Podaj te liczby");
        for (int i = 0; i < qtyNumbers; i++) {
            numbers.offer(scanner.nextInt());
        }
        scanner.close();
        return numbers;
    }
}
//    Napisz program, w którym najpierw zapytasz użytkownika ile liczb chce wprowadzić.
//    Następnie wczytaj od niego te liczby i zapisz je w kolejce. Na końcu wyświetl kwadraty liczb w kolejności rosnącej.
//
//        Dla liczb:
//        3 (liczba elementów)
//        20
//        10
//        50
//
//        W wyniku powinniśmy otrzymać:
//        100
//        400
//        2500