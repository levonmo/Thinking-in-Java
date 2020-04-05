package code_list_two;

public class ObjectE {
    static void h(ObjectEA o) {
        o.a();
        o.b();
    }

    static void i(ObjectEB o) {
        o.c();
        o.d();
    }

    static void j(ObjectEC o) {
        o.e();
        o.f();
    }

    static void k(ObjectED o) {
        o.g();
    }

    public static void main(String[] args) {
        //一个接口引用可以向上转型为四种类型
        ObjectED o = new ObjectEF();
        h(o);//将ObjectED类型向上转型为ObjectEA
        i(o);//将ObjectED类型向上转型为ObjectEB
        j(o);//将ObjectED类型向上转型为ObjectEC
        k(o);//将ObjectED类型向上转型为ObjectED
    }
}

//接口
interface ObjectEA {
    public void a();

    public void b();
}

interface ObjectEB {
    public void c();

    public void d();
}

interface ObjectEC {
    public void e();

    public void f();
}

interface ObjectED extends ObjectEA, ObjectEB, ObjectEC {
    public void g();
}

//实现类
class ObjectEG {
}

class ObjectEF extends ObjectEG implements ObjectED {
    public void a() {
    }

    public void b() {
    }

    public void c() {
    }

    public void d() {
    }

    public void e() {
    }

    public void f() {
    }

    public void g() {
    }
}