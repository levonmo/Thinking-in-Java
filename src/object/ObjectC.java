package object;

/*
 * 编写一个程序:需要多少的字节才能容纳一个特定的String对象中的信息
 */
public class ObjectC {

    public int storage(String s) {
        return s.length() * 2;
    }

    public static void main(String[] args) {
        String s = new String("这是一个字段");
        ObjectC objectC = new ObjectC();
        int storage = objectC.storage(s);
        System.out.println(storage);
    }
}
