/**
 * Created by tcgogogo on 16/8/17.
 */
public class DemoTest {

    public static void main(String[] args) {
        myHashMap hash = new myHashMap();
        hash.put(10, 20);
        hash.put(111, 21);
        System.out.println(hash.get(10));
        System.out.println(hash.get(111));
        System.out.println(hash.containsKey(10));
        System.out.println(hash.countLength(10));
        hash.clear();
    }
}
