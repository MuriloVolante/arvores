public class No {
    String valor;
    No esquerda, direita;
    No prox;

    public No(String valor) {
        this.valor = valor;
        esquerda = direita = null;
    }

    public class Arvore {
        No raiz;
    }

    public No getEsquerda() {
        return esquerda;
    }

    public No getDireita() {
        return direita;
    }
}
