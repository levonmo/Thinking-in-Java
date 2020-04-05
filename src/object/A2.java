package object;

import object2.A1;

//在第二个包中创建一个protected的内部类，实现刚刚那个接口
public class A2 {
    protected class A2Inner implements A1 {
        public A2Inner() {
        }

        public void method() {
            System.out.println("A2Inner.method");
        }
    }

}
