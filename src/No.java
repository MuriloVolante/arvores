public class No {
    String valor;
    No esquerda, direita;
    public int balanceamento;

    public No(String valor, No direita, No esquerda, int balanceamento) {
        this.valor = valor;
        esquerda = direita = null;
        this.balanceamento = 0;
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
