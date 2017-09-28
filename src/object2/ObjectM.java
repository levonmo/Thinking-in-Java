package object2;

//创建一个至少一个方法接口，在某个方法中定义一个内部类以实现该接口。这个方法返回对该接口的引用
public class ObjectM {
	public ObjectMA method() {
		class ObjectMInner implements ObjectMA {
			public void method() {
				System.out.println("HH");
			}
		}
		return new ObjectMInner();//上面是用接口来接收返回值，这里传递一个实现了该接口的实例。所以这里会进行向上转型
	}
	
}
//这是一个接口
interface ObjectMA {
	void method();
}