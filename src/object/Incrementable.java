package object;

public class Incrementable {

    //这个方法对Static中的成员变量i进行加一操作
    public static void increment() {
        //成员变量i是一个静态的变量
        StaticTest.i++;
    }

    public static void main(String[] args) {
        Incrementable sf = new Incrementable();
        //使用类型为对Incrementable对象对StaticTest中的i变量加一，i的值本来是47
        sf.increment();
        //使用类名对StaticTest中的i变量加一
        Incrementable.increment();
        //静态变量在内存中是一份的，对了所有的对象，都只是一份的
        System.out.println(StaticTest.i);
    }

}
