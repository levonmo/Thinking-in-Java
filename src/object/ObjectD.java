package object;

//编写一个程序，展示无论你创建了某个特定类的多少个对象，这个类中的某个特定的static域只有一个
public class ObjectD {

	static String s = new String("static变量只有唯一的实例");

	public static void main(String[] args) {
		ObjectD a = new ObjectD();
		ObjectD b = new ObjectD();
		ObjectD c = new ObjectD();
		ObjectD d = new ObjectD();
		System.out.println("打印的哈希码值是一样的");
		System.out.println(a.s.hashCode());
		System.out.println(b.s.hashCode());
		System.out.println(c.s.hashCode());
		System.out.println(d.s.hashCode());
	}
}
