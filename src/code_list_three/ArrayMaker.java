package code_list_three;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayMaker<T> {
	private Class<T> kind;
	public ArrayMaker(Class<T> kind) {
		this.kind = kind;
	}
	T[] create(int size) {
		return (T[])Array.newInstance(kind, size);//Array.newInstance()这个方法放进一个Class对象和size就会为这个对象创建一个数组
	}
	public static void main(String[] args) {
		ArrayMaker<String> arrayMaker = new ArrayMaker<String>(String.class);
		String[] arr = arrayMaker.create(9);
		System.out.println(Arrays.toString(arr));
		/*
		 * 在这里即使kind被存储为Class<T>,擦除也意味着它实际将被 存储 为Class，没有任何的参数，没有任何的类型信息。
		 * 因此当你使用它时，例如在创建数组的时，实际上是没有任何kind的类型信息的，所以必须进行强制类型转换(T[])，这将产生一个警告(警告不是编译时的错误)
		 * 对于在泛型中常见数组，使用Array.newInstance();是推荐的方式
		 * 
		 * 如果我们要创建的是容器，而不是数组，情况就是截然不同了。看下面的一个类
		 */
	}
}
class ListMaker<T> {
	List<T> create() {return new ArrayList<T>();}//这里并不要编写强制转换的代码，而上面的数组是要编写这样的代码的
	public static void main(String[] args) {
		ListMaker<String> listMaker = new ListMaker<String>();
		List<String> create = listMaker.create();//这里并不需要进行强制类型转换，编译器自动返回 正确的类型
		/*
		 * 这就很有意思了：
		 * 	为什么这里知道你的类型是什么?程序运行的时候不是进行 类型的擦除了吗? 为什么这里会自动返回 正确的类型的?
		 * 	·这就是边界的问题了，编译器是无法知道你具体的类型信息，但是它可以确保你放置的对象具有 T 类型。
		 * 		因此，即使擦除了有关实际类型的信息，编译器是可以确保 使用 类型的一致性。(就是它不知道你是什么类型，但是却可以确保在编译期间类型的一致性，否则编译时通过不了的)
		 * 
		 * 	·因为擦除在方法体中移除了类型信息，所以在运行时的问题就是边界：即对象进入和离开方法的地点。这正是编译器在编译期执行了 类型检查 并   插入转型代码   的地点。
		 * 		实际上就算你用了泛型，也是要进行强制类型转换的，但由于 泛型代码 在编译期确保了 类型的一致性，所以它允许你不用显式的编写 转型代码，而是编译器 自动帮你处理(编译器帮你进行类型转换了)。
		 * 		因此你编写的代码噪声将更小。
		 * 		所以在泛型中的所有动作都发生在边界处---对传递进来的值进行额外的编译期检查，并对传递出去的值进行转型。记住,"边界就是发生动作的地方"
		 * 
		 * 	下面有一个例子就是说明这些
		 */
	}
}
class SimpleHolder {
	private Object obj;
	public void set(Object obj) {this.obj = obj;}					//经过反编译，这两个类产生的字节码是一样的，证明它们的内部运行时一样的
	public Object get() {return obj;}								//set()和get()方法将直接存储和产生值，对于第一个类，转型是调用get()时进行转型
	public static void main(String[] args) {						
		SimpleHolder holder = new SimpleHolder();					
		holder.set("H");											
		String str = (String)holder.get();//这里显式的编写转型代码			
	}																
}																	
class GeneriHolder<T> {												
	private T obj;													//但是对于第二个类，增加了泛型，get()返回之后的转型消失了，但是在set()处进行了类型的检查
	public void set(T obj) {this.obj = obj;}						//因为使用了泛型，必须要进行检查，否则就不能保证内部类型的一致性了
	public T get() {return obj;}									//	
	public static void main(String[] args) {						//因为两个类的字节码是一样的，所以对于泛型类 get()返回的值进行转型仍旧是需要的，这与你自己编写转型
		GeneriHolder<String> holder = new GeneriHolder<String>();	//代码是一样的，就像第一个类一样。这里只是由编译器自动插入。
		holder.set("H");											
		String str = holder.get();//这里就不需要进行显式的编写转型代码了		
	}
}