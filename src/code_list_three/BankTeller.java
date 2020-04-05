package code_list_three;

import java.util.ArrayList;
import java.util.List;

public class BankTeller {
	public static void main(String[] args) {
		List<Customer> list = new ArrayList<Customer>();
		Generators.fill(list, Customer.generator(), 4);//Customer.generator()调用一次生成一个个generator对象
		System.out.println(list);
		List<Teller> list2 = new ArrayList<Teller>();
		Generators.fill(list2, Teller.generator, 5);//Teller.generator  只生成一个对象
		System.out.println(list2);
		/*
		 * Customer和Teller类都是只有private的构造器，这就强制你使用Generator对象(对象生成器)。强制你使用对象生成器来创建对象
		 * 	Customer有一个generator()的方法，每次执行都会生成一个新的对象，但是其实我们并不需要多个对象，对象生成器(Generator)只要一个就可以了/
		 * 	Teller就只创建一个generator对象。在main方法中也可有看到，这两种创建Generator的方式都在fill里面使用了
		 * 	
		 */
	}
}
class Customer {
	private static long counter = 1;
	private final long id = counter++;
	private Customer() {}
	public String toString() {return "Customer" + id;}
	public static Generator<Customer> generator() {
		return new Generator<Customer>() {
			public Customer next() {
				return new Customer();
			}
		};
	}
}
class Teller {
	private static long counter = 1;
	private final long id = counter++;
	private Teller() {}
	public String toString() {return "Teller" + id;}
	public static Generator<Teller> generator = new Generator<Teller>() {
		public Teller next() {
			return new Teller();
		}
	};
}
