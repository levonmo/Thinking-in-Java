package object;

public class FinalArguments {

    public void with(final Gizmo g) {
        //无法完成赋值，因为参数定义为final，则允许该方法读取参数的信息，而无法改变参数的引用
        //g = new Gizmo();
    }

    public void without(Gizmo g) {
        g = new Gizmo();//可以改变参数的信息，随便改变参数的引用对象
    }

    public void f(final int i) {
        //这里同样是不能更改参数传人的值，只是允许读取参数的信息
        //i = 1;
    }

    public void g(int i) {
        i = 1;//如果不是final，则可以更改参数传入i的值
    }

}

class Gizmo {
    public void spin() {
    }
}
