public class Fila {
    public Object[] fila;
    public int posicaoFila;
    public int tamanhoFila;


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

}
