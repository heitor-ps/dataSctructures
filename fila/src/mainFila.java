public class mainFila {
    public static void main(String[] args) {
        Fila fl = new Fila();

        fl.enfileirar("disgrasa");
        fl.enfileirar("bosta");
        fl.enfileirar("askaposka");
        fl.enfileirar("porra");

        while (!fl.filaVazia()){
            System.out.println(fl.desenfileirar());
        }



    }
}
