public class Arvore {
    No raiz;

    int altura(No no) {
        if (no == null)
            return 0;
        return no.altura;
    }

    int fatorBalanceamento(No no) {
        if (no == null)
            return 0;
        return altura(no.esquerdo) - altura(no.direito);
    }

    No rotacaoDir(No y) {
        No x = y.esquerdo;
        No T2 = x.direito;

        x.direito = y;
        y.esquerdo = T2;

        y.altura = Math.max(altura(y.esquerdo), altura(y.direito)) + 1;
        x.altura = Math.max(altura(y.esquerdo), altura(y.direito)) + 1;

        return x;
    }

    No rotacaoEsq(No y) {
        No x = y.direito;
        No T2 = x.esquerdo;

        x.esquerdo = y;
        y.direito = T2;

        x.altura = Math.max(altura(y.esquerdo), altura(y.direito)) + 1;
        y.altura = Math.max(altura(y.esquerdo), altura(y.direito)) + 1;

        return y;
    }

    No inserir(No no, int chave) {
        if (no == null)
            return new No(chave);

        if (chave < no.chave)
            no.esquerdo = inserir(no.esquerdo, chave);
        else if (chave > no.chave)
            no.direito = inserir(no.direito, chave);
        else
            return no;

        no.altura = 1 + Math.max(altura(no.esquerdo), altura(no.direito));

        int balanceamento = fatorBalanceamento(no);

        if (balanceamento > 1 && chave < no.esquerdo.chave)
            return rotacaoDir(no);

        if (balanceamento < 1 && chave > no.direito.chave)
            return rotacaoEsq(no);

        if (balanceamento > 1 && chave > no.esquerdo.chave) {
            no.esquerdo = rotacaoEsq(no.esquerdo);
            return rotacaoDir(no);
        }

        if (balanceamento < 1 && chave < no.direito.chave) {
            no.direito = rotacaoEsq(no);
        }

        return no;
    }
}
