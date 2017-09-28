package object3;

//下面是  使用模板  的C++示例，你将注意到用于参数化类型的语法十分相似，因为java是受C++的影响的
public class CPulsPuls {
	
	/*	
	 * 	template<class T> class Manipulator {
	 * 		T obj;
	 * 	public:
	 * 		Manipulator(T x) {  obj = x  }
	 * 		void manipulate() {  obj.f()  }
	 * 	};
	 * 	
	 * 	class HasF {
	 * 	public:
	 * 		void f() {...}
	 * 	}
	 */
	
	/*
	 * Manipulator类存储了一个类型T的对象，有意思的是manipulate()方法，它在obj上调用方法f()。
	 * 	那它是怎么知道f()方法是为类型参数T而存在的?原理是这样的：
	 * 	 ·当你实例化这个模板时，C++编译器将进行检查，因此在Manipulator<HasF>被实例化的这一刻，它就看到了HasF拥有一个方法f(),如果情况不是这样，就会出现一个编译错误，
	 * 		 这样类型安全就等到了保障。用C++编写这样的代码很简单，因为当模板被实例化时，模板代码就知道了其模板参数的类型了。java泛型就不同
	 */
}

//下面是java的泛型
class HasF {
	public void f() {}
}
class Manipulator<T> {
	private T obj;
	public Manipulator(T obj) {
		this.obj = obj;
	}
	public void manipulate() {
//		obj.f();//这里就会出现一个编译的错误
	}
	public static void main(String[] args) {
		HasF hasF = new HasF();
		Manipulator<HasF> manipulator = new Manipulator<HasF>(hasF);
		manipulator.manipulate();
		/*
		 *	由于擦除java编译器无法将manipulate()调用obj.f()这一个需要映射到HasF拥有f()这一事实上。
		 *	为了调用f(),我们必须协助泛型类，给定泛型类的边界，告知编译器只能接受这个边界的类型。这里重用的关键字extends。由于有了边界(限定)，下面的代码就可以编译了。看Manipulator2这个类
		 */
	}
}
class Manipulator2<T extends HasF> {
	/*
	 * 这个类 边界 <T extends HasF>声明T必须是类型HasF或者是HasF导出的类型。这样就可以安全的在obj上调用f()了
	 *   我们说泛型类型参数 将擦除 到它的第一个边界(它可能有多个边界)，就像上面一样，T擦除到了HasF，就好像在类的声明中用HasF替换了T一样
	 */
	private T obj;
	public Manipulator2(T obj) {this.obj = obj;}
	public void manipulate() {obj.f();}
}
//Manipulator2擦除后就像下面这样
class Manipulator3 {
	private HasF obj;
	public Manipulator3(HasF obj) {
		this.obj = obj;
	}
	public void manipulate() {obj.f();}
	/*
	 * 看Manipulator2和Manipulator3，泛型好像没有贡献任何好处。Manipulator3就是自己去执行擦除，就可以创建出没有泛型类的类了
	 * ·这里提出了很重要的一点就是：使用泛型类有什么好处，为什么要使用泛型类?
	 * 	·其实只有当你希望使用的 类型参数 比某个具体的类型(以及它的所有子类型) 更加"泛化"时--也就是说，当你希望你的代码能够跨多个类工作的时，使用泛型类才会有所帮助
	 * 	·其实也不一定要使用泛型，必须查看所有的代码，并确定它是否"足够复杂"到必须使用泛型的程度了
	 */
}
class ReturnGeneriType<T extends HasF> {
	private T obj;
	public ReturnGeneriType(T obj) {
		this.obj = obj;
	}
	public T get() {
		return obj;
	}
	public static void main(String[] args) {
		ReturnGeneriType gen = new ReturnGeneriType(new HasF());
		HasF hasF = gen.get();//这里返回的是确切的类型
		/*
		 * 使用泛型还有一个好处就是：
		 * 	如果有一个类有一个返回T的方法，那么泛型就有所帮助，因为他们之后返回的是确切的类型
		 */
	}
}
