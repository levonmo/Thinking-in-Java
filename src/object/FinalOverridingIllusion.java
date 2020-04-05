package object;

public class FinalOverridingIllusion {
    public static void main(String[] args) {
        OverridingPrivate2 op2 = new OverridingPrivate2();
        op2.f();
        op2.g();
        OverridingPrivate op = op2;
//		op.f();//调用不了
    }
}

class WithFinals {
    //	@Override//如果添加一个Override注解就可以解决这种问题，Override是为了想要覆盖基类的方法，但如果因为某种因素变成了重新定义，那么编译器就会产生一个错误
    private final void f() {
        System.out.println("WithFinals.f()");
    }

    private void g() {
        System.out.println("WithFinals.g()");
    }
}

class OverridingPrivate extends WithFinals {
    //这里是产生一个新的方法，并不是覆盖基类的方法
    private final void f() {
        System.out.println("OverridingPrivate.f()");
    }

    //这里也是，产生一个新的方法，并不覆盖原来的方法
    private void g() {
        System.out.println("OverridingPrivate.g()");
    }
}

class OverridingPrivate2 extends OverridingPrivate {
    public final void f() {
        System.out.println("OverridingPrivate2.f()");
    }

    public void g() {
        System.out.println("OverridingPrivate2.g()");
    }
}
