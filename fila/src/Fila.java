public class Fila {
    Object[] fila;
    int end, start;
    public final int size;

    public Fila(){
        this.fila = new Object[10];
        this.start = 0;
        this.end = 0;
        this.size = fila.length;
    }

    void enqueue(Object element){
        if (end<size-1){
            this.fila[end] = element;
            end++;
        }else System.out.println("Impossible to insert element "+element+": Overflow");
    }

    void dequeue(){
        if (start==end){
            System.out.println("\nQueue is empty");
        }else{
            for (int i = 0; i < end; i++){
                this.fila[i] = this.fila[i+1];
            }
        }
        if (end<size){
            this.fila[end] = null;
        }
        end--;
    }

    void showQueue(){
        if (start == end){
            System.out.println("\nQueue is empty");
        }else{
            int i;
            for (i = start; i < end; i++){
                System.out.print(fila[i]+" ");
            }
            System.out.println();
        }
    }

    void printFront(){
        if (start == end){
            System.out.println("\nQueue is empty");
        }else{
            System.out.print("\nFirst element is: "+fila[0]);
        }
    }

    public static void main(String[] args) {
        Fila fl = new Fila();
        fl.enqueue("a");
        fl.enqueue(2);
        fl.enqueue(3);
        fl.enqueue(4);
        fl.showQueue();
        fl.dequeue();
        fl.showQueue();
        fl.dequeue();
        fl.showQueue();
        fl.enqueue("k");
        fl.showQueue();
    }
}