package code_list_three;

import java.util.ArrayList;
import java.util.List;

public class GenericVarargs {
	public static <T> List<T> makeList(T... args) {
		List<T> list = new ArrayList<T>();
		for (T t : args) {
			list.add(t);
		}
		return list;
	}
	public static void main(String[] args) {
		List<String> list = makeList("A");
		System.out.println(list);
		List<String> list2 = makeList("A","B","C");//可以有多个参数
		System.out.println(list2);
	}
}
