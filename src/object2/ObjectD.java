package object2;

//创建一个接口，并从该接口继承两个接口，然后从后面两个接口多重继承第三个接口
public interface ObjectD extends ObjectDA, ObjectDB {

}

interface ObjectDA extends ObjectDC {
}

interface ObjectDB extends ObjectDC {
}

interface ObjectDC {
}