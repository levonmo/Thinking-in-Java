package code_list_three;

/*
 * 要调用new T()的尝试将会无法实现的，部分原因是因为擦除，而另一部分的原因是因为编译器不能验证T是否具有默认(无参)的构造器
 * 但是在C++中，这种操作很自然，很直观，并且很安全(它是在编译期进行检查)
 * java的解决方案是传递一个工厂方法，并使用它来创建新的实例。最便宜的工厂对象就是Class对象，因此如果使用类型标签，那么你就可以使用newInstance()来创建这个类型的新对象
 */
public class InstantiateGenericType {
	public static void main(String[] args) {
		ClassAsFactory<Employee> fe = new ClassAsFactory<Employee>(Employee.class);
		/*
		 * 但是有的类型没有默认的构造器的时候，选择这样的方式创建对象，在运行时就会出现一个错误
		 * 所以sun公司并不赞同这种方式，他们建议使用显示的工厂，并将限制其类型，使得这个类只能接受实现了这个工厂的类。看下面的一个类
		 */
	}
}
class ClassAsFactory<T> {
	T x;//这就是使用了类型标签
	public ClassAsFactory(Class<T> kind) {
		try {
			x = kind.newInstance();
		} catch (Exception e) {}
	}
}
class Employee {}

//使用显式的工厂，并限制其类型
class FactoryConstraint {
	public static void main(String[] args) {
//		new Toos<String>(new IntegerFactory());
		/*
		 * 这里会进行类型的检查的，Toos<T>中的T会匹配Toos<T>(class)中的class对象是否实现了Factory<T>接口，并且泛型是否一致
		 */
		new Toos<Integer>(new IntegerFactory());
	}
}

interface Factory<T> {T create();}
class Toos<T> {
	public <F extends Factory<T>> Toos(F factory) {factory.create();}
}
//每种类型都建立一种工厂，用来创建对象
class IntegerFactory implements Factory<Integer> {
	public Integer create() {return new Integer(0);}
 }


/*
 * 有一种方式使用了模板方法设计模式
 * create()是在子类中定义的，用来产生子类类型的对象
 */
abstract class GenericWithCreate<T> {
	final T element;
	public GenericWithCreate() {element = create();}
	abstract T create();
}
class DClass {}
class Creator extends GenericWithCreate<DClass> {
	DClass create() {return new DClass();}
	void f() {System.out.println(element.getClass().getName());}
}
class CreatorGeneric {
	public static void main(String[] args) {
		Creator c = new Creator();
		c.f();
	}
}