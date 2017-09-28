package object3;
import java.util.Iterator;
import java.util.Random;
/*
 * 泛型也可以适应于接口。例如生成器，这是一种专门负责创建对象的类。实际上，这是工厂方法设计模式的一种应用。
 */
interface Generator<T> {T next();}
/*
 * 这是一个泛型接口。参数化的Generator接口确保了next()的返回值是参数类型的
 */
public class Coffee {
	private static long counter = 0;
	private final long id = counter++;
	public String toString() {return this.getClass().getSimpleName() + " " + id;}
	public static void main(String[] args) {
		CoffeeGenerator gen = new CoffeeGenerator();
		for (int i = 0; i < 5; i++) {
			System.out.println(gen.next());
		}
		for (Coffee c : new CoffeeGenerator(5)) {
			System.out.println(c);
		}
	}
}
class Latte extends Coffee {}
class Mocha extends Coffee {}
class Cappuccino extends Coffee {}
class Americano extends Coffee {}
class Breve extends Coffee {}

//编写一个类，实现Generator<Coffee>接口，它能随机生成不同类型的Coffee对象
class CoffeeGenerator implements Generator<Coffee>,Iterable<Coffee> {
	private Class[] types = {Latte.class,Mocha.class,Cappuccino.class,Americano.class,Breve.class};
	private static Random rand = new Random(47);
	public CoffeeGenerator() {}
	private int size = 0;
	public CoffeeGenerator(int size) {
		this.size = size;
	}
	//这是Generator<>接口的方法,调用的话就返回一个随机对象
	public Coffee next() {
		try {
			return (Coffee)types[rand.nextInt(types.length)].newInstance();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	//这是迭代器的方法
	public Iterator<Coffee> iterator() {
		return new Iterator<Coffee>() {
			int count = size;
			public boolean hasNext() {
				return count > 0;
			}
			public Coffee next() {
				count--;
				return CoffeeGenerator.this.next();//.this是又回去到了外部了
			}
			public void remove() {
				throw new UnsupportedOperationException();
			}
		};
	}
	
}

