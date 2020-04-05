package object2;

//创建一个类，它只有一个带构造器的参数，创建第二个类，含有一个方法可以返回第一个对象的引用。在这个方法里面，创建一个匿名类来给返回
public class ObjectN {
    private int i;

    public ObjectN(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }

    public static void main(String[] args) {
        ObjectNA objectNA = new ObjectNA();
        ObjectN method = objectNA.method();
        System.out.println(method.getI());
    }
}

class ObjectNA {
    public ObjectN method() {
        return new ObjectN(123) {
        };
    }
}
