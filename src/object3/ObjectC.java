package object3;

//创建一个有两个方法的接口，以及一个实现了改接口的实现类。在另一个类中，创建一个泛型方法，它的参数类型由这个接口定义了边界，并展示该接口的方法 在这里是可调用的
public class ObjectC {
	public static <T extends ObjectCA> void methodD(T t) {
		t.methodA();
		t.methodB();
	}
	public static void main(String[] args) {
		methodD(new ObjectCB());
//		methodD(new methodD());//这个类不是ObjectCA类型的，所以编译是失败的
	}
}
interface ObjectCA {
	void methodA();
	void methodB();
}
class ObjectCB implements ObjectCA {
	public void methodA() {System.out.println("methodA");}
	public void methodB() {System.out.println("methodB");}
	public void methodC() {System.out.println("methodC");}
}
class ObjectCD {}