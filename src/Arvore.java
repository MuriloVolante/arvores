public class Arvore {
    public No raiz;
    public No filho;
    public No n;

    public Arvore(No raiz, No filho) {
        this.raiz = raiz;
        this.filho = filho;

    }

    public int contarNo(No n) {
        if (n == null) return 0;
        return 1 + contarNo(n.esquerda) + contarNo(n.direita);

    }

    public void buscaPrO(No n) {
        if (n != null) {
            System.out.print(n.valor + " ");
            buscaPrO(n.esquerda);
            buscaPrO(n.direita);
        }
    }
}
