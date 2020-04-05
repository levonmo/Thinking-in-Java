package code_list_three;

//如果指定Holder3可以持有某个基类类型，那么它也能持有导出类
public class ObjectA {
	public static void main(String[] args) {
		Holder3<Automobile> h3 = new Holder3<Automobile>(new Automobile());//h3持有的是Automobile类型
		h3.set(new Automobile2());//也可以持有它的导出类Automobile2
	}
}
class Automobile2 extends Automobile {}
