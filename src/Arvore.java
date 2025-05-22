import java.util.LinkedList;
import java.util.Queue;

public class Arvore {
    public No raiz;
    public No filho;

    public Arvore(No raiz, No filho) {
        this.raiz = raiz;
        this.filho = filho;
    }

    public int contarNo(No n) {
        if (n == null) return 0;
        return 1 + contarNo(n.esquerda) + contarNo(n.direita);
    }


    public void preOrdem(No n) {
        if (n != null) {
            System.out.print(n.valor);
            preOrdem(n.esquerda);
            preOrdem(n.direita);
        }

    }

    public void emOrdem(No n) {
        if (n != null) {
            emOrdem(n.esquerda);
            System.out.println(n.valor);
            emOrdem(n.direita);
        }


    }

    public void posOrdem(No n) {
        if (n != null) {
            posOrdem(n.esquerda);
            posOrdem(n.direita);
            System.out.println(n.valor);
        }
    }

    public void emNivel() {
        if (raiz == null) return;

        Queue<No> contar = new LinkedList<>();
        contar.add(raiz);

        while (!contar.isEmpty()) {
            No atual = contar.poll();
            System.out.println(atual.valor);

            if (atual.esquerda != null) contar.add(atual.esquerda);
            if (atual.direita != null) contar.add(atual.direita);
        }
    }
}
