package object;

//创建一个包含一个float域的类，并用这个类展示别名机制
public class ObjectF {

	float num;
	
	public static void main(String[] args) {
		ObjectF a = new ObjectF();
		ObjectF b = new ObjectF();
		a.num = 1;
		b.num = 2;
		System.out.println("a中num的值：" + a.num + "  " + "b中num的值是：" + b.num);
		//这就是别名机制，对象.属性  ，这样便可以保持两个对象彼此独立
		a.num = 3;
		System.out.println("a中num的值：" + a.num + "  " + "b中num的值是：" + b.num);
	}
	
}
