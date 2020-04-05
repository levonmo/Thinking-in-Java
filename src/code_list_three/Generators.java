package code_list_three;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*
 * 利用生成器，我们可以很方便的填充一个Collection，而泛型话这种操作是具有实际意义的
 * 	在这里:是完全使用了接口编程，而且加上泛型，耦合度是极低的
 */
public class Generators {
	//传人一个容器，一个生成器，一个数量。这个方法就会利用这个生成器生成一定数量的对象，填充该容器中
	public static <T> Collection<T> fill(Collection<T> coll,Generator<T> gen,int n) {
		for (int i = 0; i < n; i++) {
			coll.add(gen.next());
		}
		return coll;
	}
	public static void main(String[] args) {
		Collection<Coffee> coffee = fill(new ArrayList<Coffee>(), new CoffeeGenerator(), 4);
		System.out.println(coffee);
	}
	
	//练习，重载fill方法，使其返回值的类型是Collection的导出类：List，Queue和set。通过这种方式，我们就不会丢失容器的类型
	public static <T> List<T> fill(List<T> list) {
		return list;
	}
	public static <T> ArrayList<T> fill(ArrayList<T> list) {
		return list;
	}
	
}
