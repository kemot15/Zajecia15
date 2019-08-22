package Teoria2;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {
        Queue<String> clients = new PriorityQueue<>();
        clients.offer("Jan");
        clients.offer("Maria");
        clients.offer("Ewa");
        clients.offer("Ewa");


        System.out.println(clients);

        String client1 = clients.peek();
        System.out.println(client1);

        String client2 = clients.poll();
        System.out.println(client2);

        String client3 = clients.poll();
        System.out.println(client3);
    }
}
