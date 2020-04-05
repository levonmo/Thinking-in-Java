package object;

//创建一个带有final方法的类，由此继承产生一个类并尝试覆盖该方法。
public class ObjectI extends ObjectIA {

    //尝试覆盖基类带有final的f()方法,当然是失败的
    //public void f() {}

    public void g() {
        System.out.println("ObjectI.g()");
    }

    public static void main(String[] args) {
        ObjectI objectI = new ObjectI();
        objectI.f();//虽然导出类不能重写该方法，但是导出类还是可以访问到该方法的
        objectI.g();//基类的g()方法被覆盖

    }
}

class ObjectIA {
    //带有final的方法，它的导出类不能覆盖该方法，导出类要想重写该方法的话就会报错
    public final void f() {
        System.out.println("ObjectIA.f()");
    }

    public void g() {
        System.out.println("ObjectIA.g()");
    }
}