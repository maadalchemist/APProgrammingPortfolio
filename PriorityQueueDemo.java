

// import java.util.*;
// import java.io.*;

public class PriorityQueueDemo {

    public static void main(String args[])
    {
        PriorityQueue<String> pQueue = new PriorityQueue<>();

        pQueue.add("hello");
        pQueue.add("world");
        pQueue.add("!");

        Iterator iterator = pQueue.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
