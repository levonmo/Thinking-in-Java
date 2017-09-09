package object;
public class StaticPolymorphism {
	public static void main(String[] args) {
		
		StaticSuper staticSuper = new StaticSub();
		String staticGet = staticSuper.staticGet();
		System.out.println(staticGet);
		/*
		 * 这是调用静态方法，用基类的引用指向导出类对象，但调用的是基类的静态方法，所以对于静态方法是不存在多态的
		 */
		
		String dynamicGet = staticSuper.dynamicGet();
		System.out.println(dynamicGet);
		/*
		 * 这种非静态对象就与上面的不同了，调用的是导出类的方法
		 */
	}
}
class StaticSuper {
	//这是一个静态方法
	public static String staticGet() {
		return "StaticSuper.staticGet()";
	}
	//这是一个非静态方法
	public String dynamicGet() {
		return "StaticSuper.dynamicGet()";
	}
}
class StaticSub extends StaticSuper {
	//这是导出类的一个静态方法，不存在多态
	public static String staticGet() {
		return "StaticSub.staticGet()";
	}
	public String dynamicGet() {
		return "StaticSub.dynamicGet()";
	}
}
