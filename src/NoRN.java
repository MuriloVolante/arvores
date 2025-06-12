enum Color {
    RED, BLACK
}

public class NoRN {
    int key;
    Color color;
    NoRN left, right, parent;

    NoRN(int key) {
        this.key = key;
        this.color = Color.RED;
        this.left = null;
        this.right = null;
        this.parent = null;
    }

}
