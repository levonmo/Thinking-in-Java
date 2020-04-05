package code_list_two;

//创建一个包含内部类的类，在另一个独立的类中，创建这个内部类的实例
public class ObjectJ {
    public static void main(String[] args) {
        Outer outer = new Outer();
        code_list_two.Outer.Inner inner = outer.getInner();//创建内部类实例
    }
}

class Outer2 {
    //这是一个内部类
    class Inner {
        public void method() {
            System.out.println("Inner.method");
        }
    }

    //这个方法可以创建一个内部类
    public Inner getInner() {
        return new Inner();
    }
}