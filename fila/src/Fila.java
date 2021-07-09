public class Fila {
    int[] fila;
    int end;
    public final int size;

    public Fila(){
        this.fila = new int[10];
        this.end = 0;
        this.size = fila.length;
    }

    void enqueue(int element){
        if (end<size-1){
            this.fila[end] = element;
            end++;
        }else System.out.println("Impossible to insert element "+element+": Overflow");
    }

    void dequeue(){
        for (int i = 0; i < size - 1;i++)
            System.out.print(this.fila[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Fila fl = new Fila();
        fl.enqueue(1);
        fl.enqueue(2);
        fl.enqueue(3);
        fl.enqueue(4);
        fl.enqueue(5);
        fl.enqueue(6);
        fl.enqueue(7);
        fl.enqueue(9);
        fl.enqueue(10);
        fl.enqueue(11);
        fl.enqueue(12);
        fl.dequeue();
    }
}

