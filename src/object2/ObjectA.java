package object2;

//参加一个不包含任何抽象方法的抽象类，并验证我们不能为该类创建任何实例
public class ObjectA {
    public static void main(String[] args) {
        //new ObjectAA();//不能实例化抽象类实例
    }
}

abstract class ObjectAA {
    public void methodA() {
    }

    public void methodB() {
    }
}
