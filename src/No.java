public class No {
    int valor;
    No esquerda, direita;
    public int balanceamento;
    public int altura;

    public No(int valor, No esquerda, No direita, int balanceamento, int altura) {
        this.valor = valor;
        this.esquerda = esquerda;
        this.direita = direita;
        this.balanceamento = balanceamento;
        this.altura = altura;
    }

    public No(int valor) {
    }

    public No getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(No esquerda) {
        this.esquerda = esquerda;
    }

    public No getDireita() {
        return direita;
    }

    public void setDireita(No direita) {
        this.direita = direita;
    }

    public int getBalanceamento() {
        return balanceamento;
    }

    public void setBalanceamento(int balanceamento) {
        this.balanceamento = balanceamento;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
}
