package code_list_three;

public class BasicGenerator<T> implements Generator<T> {
	private Class<T> type;
	public BasicGenerator(Class<T> type) {
		this.type = type;
	}
	//这是生成一个对象
	public T next() {
		try {
			return type.newInstance();
		} catch (Exception e) {throw new RuntimeException();}
	}
	//这是生成一个Generator(对象生成器)
	public static <T> Generator<T> create(Class<T> type) {
		return new BasicGenerator<T>(type);
	}
	/*
	 * 这个类是为了生成某个类的对象，而create()方法可以创建一个  这样的对象(用于生成对象)。主要调用create()方法，并传人一个Class类型。
	 * 	为了生成一个 具有生成对象 的对象，可以直接调用BasicGenerator.create(Mytype.class),
	 * 		而不用执行麻烦的new BasicGenerator<Mytype>(Mytype.class) 如果你没有使用上面这种方法的话你就必须要使用new关键字来这种操作了
	 */
	//通过BasicGenerator，可以很容易的为CountedObject创建一个Generator
	public static void main(String[] args) {
		Generator<CountedObject> gen = BasicGenerator.create(CountedObject.class);//创建一个具有生成对象的Generator(对象生成器)
		for (int i = 0; i < 4; i++) {
			System.out.println(gen.next());
		}
		/*
		 * 可以看到，使用泛型方法创建的Generator对象，大大减少了我们要编写的代码。java泛型要求传人Class对象，以便也可以在create()中进行  类型推断
		 */
	}
}
//这是一个简单具有默认构造器的类
class CountedObject {
	private static long counter = 0;
	private final long id = counter++;//这里可以记录创建了多少的对象实例。因为创建一个对象就要初始化一个这个域，所以可以统计出的
	public long id() {return id;}
	public String toString() {
		return "createObject" + id;
	}
}
