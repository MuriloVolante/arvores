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

    public int contarNoFolhaRec(No no) {
        if (no == null) return 0;
        if (no.esquerda == null && no.direita == null) return 1;

        return contarNoFolhaRec(no.esquerda) + contarNoFolhaRec(no.direita);
    }

    public int contarNoFolha(No raiz) {
        if (raiz == null) return 0;

        int contador = 0;
        Queue<No> fila = new LinkedList<>();
        fila.add(raiz);

        while (!fila.isEmpty()) {
            No atual = fila.poll();

            if (atual.esquerda == null && atual.direita == null) {
                contador++;
            }
            if (atual.esquerda != null) fila.add(atual.esquerda);
            if (atual.direita != null) fila.add(atual.direita);
        }

        return contador;
    }

    public class ArvoreAVL {
        private No raiz;

        public void inserir(int valor) {
            raiz = inserir(raiz, valor);
        }

        private No inserir(No no, int valor) {
            if (no == null)
                return new No(valor);

            if (valor < no.valor)
                no.esquerda = inserir(no.esquerda, valor);
            else if (valor > no.valor)
                no.direita = inserir(no.direita, valor);
            else
                return no;

            no.altura = 1 + Math.max(altura(no.esquerda), altura(no.direita));

            no.balanceamento = altura(no.esquerda) - altura(no.direita);

            if (no.balanceamento > 1 && valor < no.esquerda.valor)
                return rotacaoDireita(no);

            if (no.balanceamento < -1 && valor > no.direita.valor)
                return rotacaoEsquerda(no);

            if (no.balanceamento > 1 && valor > no.esquerda.valor) {
                no.esquerda = rotacaoEsquerda(no.esquerda);
                return rotacaoDireita(no);
            }

            if (no.balanceamento < -1 && valor < no.direita.valor) {
                no.direita = rotacaoDireita(no.direita);
                return rotacaoEsquerda(no);
            }

            return no;
        }

        private int altura(No no) {
            return no == null ? 0 : no.altura;
        }

        private No rotacaoDireita(No y) {
            No x = y.esquerda;
            No T2 = x.direita;

            x.direita = y;
            y.esquerda = T2;

            y.altura = 1 + Math.max(altura(y.esquerda), altura(y.direita));
            x.altura = 1 + Math.max(altura(x.esquerda), altura(x.direita));

            y.balanceamento = altura(y.esquerda) - altura(y.direita);
            x.balanceamento = altura(x.esquerda) - altura(x.direita);

            return x;
        }

        private No rotacaoEsquerda(No x) {
            No y = x.direita;
            No T2 = y.esquerda;

            y.esquerda = x;
            x.direita = T2;

            x.altura = 1 + Math.max(altura(x.esquerda), altura(x.direita));
            y.altura = 1 + Math.max(altura(y.esquerda), altura(y.direita));

            x.balanceamento = altura(x.esquerda) - altura(x.direita);
            y.balanceamento = altura(y.esquerda) - altura(y.direita);

            return y;
        }
    }

        public void inserir(int valor) {
            raiz = inserir(raiz, valor);
        }

        private No inserir(No no, int valor) {
            if (no == null)
                return new No(valor);

            if (valor < no.valor)
                no.esquerda = inserir(no.esquerda, valor);
            else if (valor > no.valor)
                no.direita = inserir(no.direita, valor);
            else
                return no;

            no.altura = 1 + Math.max(altura(no.esquerda), altura(no.direita));
            no.balanceamento = altura(no.esquerda) - altura(no.direita);

            if (no.balanceamento > 1 && valor < no.esquerda.valor)
                return rotacaoDireita(no);

            if (no.balanceamento < -1 && valor > no.direita.valor)
                return rotacaoEsquerda(no);

            if (no.balanceamento > 1 && valor > no.esquerda.valor) {
                no.esquerda = rotacaoEsquerda(no.esquerda);
                return rotacaoDireita(no);
            }

            if (no.balanceamento < -1 && valor < no.direita.valor) {
                no.direita = rotacaoDireita(no.direita);
                return rotacaoEsquerda(no);
            }

            return no;
        }

    private No rotacaoDireita(No no) {
        return no;
    }

    private No rotacaoEsquerda(No no) {
        return no;
    }
    }

    private void altura(No esquerda) {
    return;
    }
