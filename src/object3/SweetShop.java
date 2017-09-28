package object3;

public class SweetShop {
	public static void main(String[] args) {
		System.out.println("inside main");
		new Candy();
		System.out.println("After creating Candy");
		try {
			Class.forName("object3.Gum");
			/*
			 * ·从输出的结果可以看到，Class对象仅在需要的时候才被加载，static初始化是在类加载时进行的
			 * ·forName()：属于Class类的一个static方法，可以获取Class对象的引用，返回的就是一个Class对象的引用
			 *	使用forName的一个副作用就是:一但调用forName()，该类的就会被加载，static字句就会被初始化。(下面会介绍一种使用类名.class不会加载类的)
			 * ·Class.forName()是获取Class对象的一种方法，你还可以通过具体的对象 来 获取 Class对象。
			 * 		例如:对象.getClass就可以了。这个方法属于Object的一部分
			 * 
			 */
		} catch (ClassNotFoundException e) {
			System.out.println("not Gum");
		}
		System.out.println("After Class.forName(Gum)");
		new Cookie();
	}
}
class Candy {
	static {System.out.println("Loading Candy");}
}
class Gum {
	static {System.out.println("Loading Gum");}
}
class Cookie {
	static {System.out.println("Loading Cookie");}
}