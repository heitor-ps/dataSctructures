public class mainFila {
    public static void main(String[] args) {
        Fila fl = new Fila();

        fl.enqueue("a");
        fl.enqueue("b");
        fl.enqueue("c");
        fl.enqueue("d");
        fl.enqueue("e");
        fl.enqueue("f");
        fl.enqueue("g");
        fl.enqueue("h");
        fl.enqueue("i");



        while (!fl.filaVazia()) {
            System.out.println(fl.dequeue());
        }
    }
}
