package noelen;

/**
 * Hello world!
 */
public  class StaticQueue {
    private int[]itens;
    private int entire;
    private int first;
    private int last;
    StaticQueue() {
        itens = new int[3];
        first = 0;
        entire = 0;
        last = 0;
    }

    public boolean isEmpty () {
        return entire == 0;
    }
    public boolean isFull(){
        return entire == itens.length;
    }
    public void enqueue(int i){
        itens[last] = i;
        last = (last + 1) % itens.length;
        entire++;
    }

    public int dequeue() {
        int elemento = itens[first];
        first = (first + 1) % itens.length;
        entire--;
        return elemento;
    }

    public int peek(){
        return first;
    }
}
