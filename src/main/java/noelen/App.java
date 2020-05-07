package noelen;

public class App {
    static StaticQueue queue = new StaticQueue();

    public static void main(String[] args) {
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println(queue.isEmpty());
        System.out.println(queue.isFull());
        System.out.println(queue.dequeue());
    }
    

    

}