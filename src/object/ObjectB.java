package object;

/*
 * 创建一个类，包含一个int域和一个char域，它们都没有初始化，将他们打印出来，以验证java的执行了默认的初始值
 */
public class ObjectB {
    int i;
    char a;

    public static void main(String[] args) {
        ObjectB objectB = new ObjectB();
        System.out.println("基本类型int的默认值是" + objectB.i);
        System.out.println("基本类型char的默认值是" + objectB.a);
    }
}
