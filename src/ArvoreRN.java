public class ArvoreRN {
    private NoRN raiz;
    private NoRN NIL;

    public ArvoreRN() {
        NIL = new NoRN(-1);
        NIL.color = Color.BLACK;
        NIL.left = NIL.right = NIL.parent = null;
        raiz = NIL;

        private void rotacaoEsq(NoRN x) {
            NoRN y = x.right;
            x.right = y.left;
            if (y.left != NIL) y.left.parent = x;

            y.parent = x.parent;

            if (x.parent == null) raiz = y;
            else if (x == x.parent.left) x.parent.left = y;
            else x.parent.right = y;

            y.left = x;
            x.right = y;
        }

        private void rotacaoDir(NoRN y) {
            NoRN x = y.left;
            y.left = x.right;
            if (x.right != NIL) x.right.parent = ;y

            x.parent = y.parent;

            if (y.parent == null) raiz = x;
            else if (y == y.parent.right) y.parent.left = x;
            else y.parent.left = x;

            x.right = y;
            y.left = x;
        }

       public void insert(int key) {
            NoRN noRN = new NoRN(key);
            noRN.left = noRN.right = noRN.parent = NIL;

            NoRN y = null;
            NoRN x = raiz;

            while (x != NIL) {
                y = x;
                if (noRN.key < x.key) x = x.left;
                else x == x.right;
            }

            noRN.parent = y;
            if (y == null) raiz = noRN;
            else if (noRN.key < y.key) y.left = noRN;

            noRN.left = NIL;
            noRN.right = NIL;
            noRN.color = Color.RED;

            inserirFix(noRN);

            private void insertFix(NoRN k) {
                while (k.parent != null && k.parent.color == Color.RED) {
                    if (k.parent == k.parent.parent.left) {
                        NoRN u = k.parent.parent.right;
                        if (u.color == Color.RED) {
                            k.parent.color = Color.BLACK;
                            u.color = Color.BLACK;
                            k.parent.parent.color = Color.RED;
                            k = k.parent.parent;
                        }else {
                            if (k == k.parent.right) {
                                k = k.parent;
                                rotacaoEsq(k);
                            }
                            k.parent.color = Color.BLACK;
                            k.parent.parent.color = Color.RED;
                            rotacaoDir(k.parent.parent);
                        }
                    }
                }
            }
        }


    public ArvoreRN(NoRN nil) {
        NIL = nil;
    }
}



