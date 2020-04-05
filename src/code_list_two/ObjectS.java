package code_list_two;

//创建一个包含内部类的类，此内部类有一个非默认的构造器。创建另一个也包含内部类的类，此内部类继承自第一个内部类
public class ObjectS {
    class ObjectSC extends ObjectSA.ObjectSB {
        public ObjectSC(ObjectSA objectSA, String s) {
            objectSA.super(s);
        }
    }
}

class ObjectSA {
    class ObjectSB {
        private String s;

        public ObjectSB(String s) {
            this.s = s;
        }
    }
}
