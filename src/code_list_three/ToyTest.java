package code_list_three;

public class ToyTest {
	static void printInfo(Class c) {
		System.out.println("类的名字" + c.getName());
		System.out.println("是否是一个接口" + c.isInterface());
		System.out.println("不含包名的类名" + c.getSimpleName());
		System.out.println("全限定类名" +  c.getCanonicalName());
	}
	public static void main(String[] args) {
		Class c = null;
		try {
			c = Class.forName("code_list_three.FancyToy");
		} catch (ClassNotFoundException e) {
			System.out.println("没有找对应的类");
		}
		printInfo(c);

		System.out.println("----------------------------");
		Class[] interfaces = c.getInterfaces();//获取实现了接口的 Class对象
		for (Class in : interfaces) {
			printInfo(in);
		}
		
		System.out.println("----------------------------");
		Class up = c.getSuperclass();//获取了 继承基类的 Class对象
		printInfo(up);//打印了基类的信息，基类的类型是一个Toy
		System.out.println("----------------------------");
		try {
			
			Object obj = null;//这里是Object引用
			obj = up.newInstance();//实现"虚拟构造器"的一种途径，必须有默认的构造器。创建了一个Toy对象
			System.out.println(obj.getClass());//上面得到的是Object的引用，但是这个引用指向的却是Toy对象
			/*
			 * 这里打印出来的是Toy的Class对象
			 */
			
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}
interface HasBatteries {}
interface Waterproof {}
interface Shoots {}
class Toy {
	Toy() {}
	Toy(int i ) {}
}
class FancyToy extends Toy implements HasBatteries, Waterproof, Shoots {
	FancyToy() {super(1);}
}
