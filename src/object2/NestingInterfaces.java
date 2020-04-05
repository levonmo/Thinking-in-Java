package object2;

//嵌套接口
class A {
    //接口
    interface B {
        void f();
    }//

    public interface C {
        void f();
    }

    private interface D {
        void f();
    }//私有接口(private关键字)，当使用这个接口的时候，不允许实现类进行类型的转换(也就是说不能向上转型)

    //实现类
    public class BImpl implements B {
        public void f() {
        }
    }//公开

    private class BImpl2 implements B {
        public void f() {
        }
    }//私有

    class CImpl implements C {
        public void f() {
        }
    }//包访问权限

    private class CImpl2 implements C {
        public void f() {
        }
    }//私有

    public class DImpl implements D {
        public void f() {
        }
    }

    private class DImpl2 implements D {
        public void f() {
        }
    }

    public D getD() {
        return new DImpl();
    }

    private D dRef;

    public void receiveD(D d) {
        dRef = d;
        dRef.f();
    }
}

interface E {
    interface G {
        void f();
    }//嵌套接口

    public interface H {
        void f();
    }//公开

    void g();//
}

public class NestingInterfaces {
    public class BImp implements A.B {
        public void f() {
        }
    }

    class CImpl implements A.C {
        public void f() {
        }
    }

    class EImpl implements E {
        public void g() {
        }
    }

    class EGImpl implements E.G {
        public void f() {
        }
    }

    class EImpl2 implements E {
        public void g() {
        }

        class EG implements E.G {
            public void f() {
            }
        }//这是嵌套类
    }

    public static void main(String[] args) {
        A a = new A();

    }
}
