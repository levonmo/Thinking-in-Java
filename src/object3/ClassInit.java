package object3;

public class ClassInit {
	public static void main(String[] args) {
		//执行了.class，Init1类并没有初始化
		Class cs = Init1.class;
		//如果一个static final值是一个"编译器常量"，那么读取该值并不需要该类初始化
		System.out.println(Init1.staticFinal);
		System.out.println("---1----");
		//但是就是该域是static final，但是你的值并不是"编译器常量"，访问该值就需要对该类进行初始化
		System.out.println(Init1.staticFinal2);
		System.out.println("---2----");
		//访问static域，要对该类进行初始化，先初始化代码块 在初始化域
		System.out.println(Init2.staticNotFinal);
		System.out.println("---3----");
		try {
			//使用forName()来获取Class对象是要对该类进行初始化的
			Class c = Class.forName("object3.Init3");
			System.out.println(Init3.staticNotFinal);
		} catch (ClassNotFoundException e) {
			System.out.println("没有这个类");
		}
	}
}
class Intt {int i = 2;}
class Init1 {
	static final int staticFinal = 47;
	static final int staticFinal2 = (new Intt()).i;
	static {
		System.out.println("Init1");
	}
}
class Init2 {
	static int staticNotFinal = 147;
	static {
		System.out.println("Init2");
	}
}
class Init3 {
	static int staticNotFinal = 74;
	static {
		System.out.println("Init3");
	}
}