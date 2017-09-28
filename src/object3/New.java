package object3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class New {
	public static <K,V> Map<K,V> map() {
		return new HashMap<K,V>();
	}
	public static <T> List<T> list() {
		return new ArrayList<T>();
	}
	public static <T> LinkedList<T> llist() {
		return new LinkedList<T>();
	}
	public static <T> Set<T> set() {
		return new HashSet<T>();
	}
	public static void main(String[] args) {
		Map<String, List<String>> map = New.map();
		List<String> list = New.list();
		LinkedList<String> llist = New.llist();
		Set<String> set = New.set();
		/*
		 *   类型参数推断  避免了  重复的  泛型参数列表
		 *   类型推断只对赋值操作有效(List<String> list = New.list();像这种形式就是赋值)，其他的时候并不起作用。
		 *   	例如:如果你将一个泛型方法调用的结果(例如New.map())作为参数，传递给另一个方法，这时编译器并不会进行类型判断，编译器是将该泛型方法的返回值
		 *   	赋于一个Object类型的变量。下面的g()方法证明这一点
		 */
		g(New.list());
		Map<String, List<? extends String>> map2 = New.map();
	}
	public static <T> void g(List list) {}
	
}
