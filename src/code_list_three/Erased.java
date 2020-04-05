package code_list_three;

public class Erased<T> {
	private final int SIZE = 100;
	public static void f(Object arg) {
//		if(arg instanceof T) {}  //ERROR: T 在运行时 是没有任何的信息的
//		T var = new T();
	}
	public static void main(String[] args) {
		
	}
}

//前面的示例中对使用instanceof的尝试是失败的，因为类型信息已经被擦除了。如果引入类型标签，就可以使用动态额isInastance()

class Building {}
class House extends Building {}

class ClassTypeCap<T> {
	Class<T> kind;//应该是这里使用了类型标签
	public ClassTypeCap(Class<T> kind) {
		this.kind = kind;
	}
	public boolean f(Object obj) {
		return kind.isInstance(obj);
	}
	public static void main(String[] args) {
		ClassTypeCap<Building> clas = new ClassTypeCap<Building>(Building.class);
		System.out.println(clas.f(new Building()));
		System.out.println(clas.f(new House()));
		ClassTypeCap<House> clas2 = new ClassTypeCap<House>(House.class);
		System.out.println(clas2.f(new Building()));
		System.out.println(clas2.f(new House()));
	}
}