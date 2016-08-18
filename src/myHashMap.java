/**
 * Created by tcgogogo on 16/8/18.
 */
class myHashMap {

    private final int PRIME = 101;
    private final int SIZE = 10000;
    public HashNode[] hashMap = new HashNode[SIZE];

    public int getHashCode(int keyNumber) {
        return keyNumber % PRIME;
    }

    public void put(int key, int value) {
        int index = getHashCode(key);
        HashNode pNode = new HashNode(key, value);
        pNode.next = hashMap[index];
        hashMap[index] = pNode;
    }

    public int get(int key) {
        int value = -1;
        int index = getHashCode(key);
        HashNode pNode = hashMap[index];
        while (pNode != null) {
            if (pNode.getKey() == key) {
                value = pNode.getValue();
                break;
            }
            pNode = pNode.next;
        }
        return value;
    }

    public boolean containsKey(int key) {
        int index = getHashCode(key);
        HashNode pNode = hashMap[index];
        if (pNode == null) {
            return false;
        }
        return true;
    }

    public int countLength(int key) {
        int count = 0;
        if(containsKey(key)) {
            int index = getHashCode(key);
            HashNode pNode = hashMap[index];
            while (pNode != null) {
                count ++;
                pNode = pNode.next;
            }
        }
        return count;
    }
    public void clear() {
        for (int i = 0; i < SIZE; i++) {
            if (hashMap[i] != null) {
                hashMap[i].next = null;
            }
        }
    }
}
