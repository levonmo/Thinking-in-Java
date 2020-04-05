package code_list_two;

public class DotThis {
    void f() {
        System.out.println("DotThis.f()");
    }

    //这是一个内部类
    public class Inner {
        public DotThis outer() {
            return DotThis.this;
        }
    }

    //调用这个方法，返回一个内部类的对象
    public Inner inner() {
        return new Inner();
    }

    public static void main(String[] args) {
        DotThis dotThis = new DotThis();
        DotThis.Inner dti = dotThis.inner();//获取内部类对象
        dti.outer().f();//因为outer方法返回的是一个外部类的引用，所以调用内部类.outer方法，实际上是得到外部类的引用。并可以调用外部类的方法
    }
}
