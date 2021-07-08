public class Fila {
    public Object[] fila;
    public int posicaoFila;
    public int tamanhoFila;

    //CÓDIGO AINDA NÃO TÁ RODANDO
    public Fila(){
        this.fila = new Object[10];
        this.posicaoFila = fila.length-1;
        this.tamanhoFila = fila.length-1;

    }

    public boolean filaVazia(){
        if (this.tamanhoFila){
            return true;
        }else return false;
    }

    public void enqueue(Object valor){
        if (this.tamanhoFila <= fila.length-1 && this.tamanhoFila >= 0){
            this.fila[this.tamanhoFila--] = valor;
        }else System.out.println("Impossible insertion (overflow)");
    }

    public Object dequeue(){
        if (filaVazia()){
            return null;
        }
        else return this.fila[this.posicaoFila--];
    }
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
//CÓDIGO AINDA NÃO TÁ RODANDO
