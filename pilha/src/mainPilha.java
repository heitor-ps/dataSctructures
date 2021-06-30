public class mainPilha {
    public static void main(String[] args) {
        Pilha p = new Pilha();

        p.empilhar("Portuguesa");
        p.empilhar("Frango catupiry");
        p.empilhar("Calabresa");
        p.empilhar("Quatro Queijos");
        p.empilhar(10);
        while (p.pilhaVazia() == false){
            System.out.println(p.desempilhar());
        }
    }
}
