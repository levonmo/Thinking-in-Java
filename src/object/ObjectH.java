package object;

/*
 * 创建一个类，它应带有一个被重载了三次的方法。继承产生一个新类，并添加一个该方法的重载定义，展示这四个方法在导出类中都是可以使用的。
 */
public class ObjectH {

	public static void main(String[] args) {
		ObjectHAB hac = new ObjectHAB();
		//分别调用这四个方法
		char c = hac.methodA('A');
		float f = hac.methodA(1.2f);
		int i = hac.methodA(1);
		ObjectHAC objecyhac = hac.methodA(new ObjectHAC());
		System.out.println(c);
		System.out.println(f);
		System.out.println(i);
		System.out.println(objecyhac);
	}
}
class ObjectHA {
	char methodA(char c) {
		System.out.println("ObjectHA.methodA.char");
		return c;
	}
	float methodA(float f) {
		System.out.println("ObjectHA.methodA.float");
		return f;
	}
	int methodA(int i) {
		System.out.println("ObjectHA.methodA.int");
		return i;
	}
}
class ObjectHAC{}
class ObjectHAB extends ObjectHA {
	//这又是一个重载的方法。这样的话就等于有四个重载的方法了(基类三个，本类一个)
	ObjectHAC methodA(ObjectHAC hac) {
		System.out.println("ObjectHAB.methodA.ObjectHAC");
		return hac;
	}
}
