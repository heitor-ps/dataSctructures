public class Fila {
    public Object[] fila;
    public int posicaoFila;


    public Fila(){
        this.posicaoFila = 0;
        this.fila = new Object[10];
    }

    public boolean filaVazia(){
        if (this.posicaoFila == -1){
            return true;
        }else return false;
    }

    public void enfileirar(Object valor){
        if (this.posicaoFila < this.fila.length){
            this.fila[++posicaoFila] = valor;
        }
    }


    public Object desenfileirar(){
        if (filaVazia()){
            return null;
        }
        return this.fila[this.posicaoFila--];
    }

}
