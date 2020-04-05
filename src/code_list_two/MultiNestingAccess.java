package code_list_two;

//内部类的多层嵌套
public class MultiNestingAccess {
    public static void main(String[] args) {
        MNA mna = new MNA();
        //创建一个内部类A对象。通过new关键字，外围类对象.new + 内部类类名   就可以创建一个内部类对象，同时也与外围类建立了关系
        MNA.A a = mna.new A();
        //创建一个A类的内部类对象B
        MNA.A.B b = a.new B();
        b.h();
        /*
         * 可以看见在MNA.A.B调用外围类的g()和f()不需要任何的条件
         */
    }
}

//这是一个多层嵌套类
class MNA {
    public void f() {
        System.out.println("f");
    }

    class A {
        private void g() {
            System.out.println("g");
        }

        public class B {
            void h() {
                g();
                f();
            }
        }
    }
}