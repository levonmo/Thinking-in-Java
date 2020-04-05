package object2;

//创建一个包含嵌套类的接口，实现此接口并创建嵌套类的实例
interface ObjectRA {
    void method1();

    void method2();

    class ObjectRB implements ObjectRA {
        public void method1() {
            System.out.println("ObjectRB.method1");
        }

        public void method2() {
            System.out.println("ObjectRB.method2");
        }
    }
}

public class ObjectR {
    public static void main(String[] args) {
        ObjectRA.ObjectRB a = new ObjectRA.ObjectRB();
        a.method1();
        a.method2();
    }
}
