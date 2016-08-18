/**
 * Created by tcgogogo on 16/8/18.
 */
class HashNode {

    private int key;
    private int value;
    public HashNode next;

    public HashNode() {}

    public HashNode(int k, int v) {
        this.key = k;
        this.value = v;
        this.next = null;
    }

    public int getKey() {
        return key;
    }

    public int getValue() {
        return value;
    }
}