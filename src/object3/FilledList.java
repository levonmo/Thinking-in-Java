package object3;

import java.util.ArrayList;
import java.util.List;

class CountedInteger {
	private static long counter;
	private final long id = counter++;
	public String toString() {return Long.toString(id);}
}

public class FilledList<T> {
	private Class<T> type;
	public FilledList(Class<T> type) {
		this.type = type;
	}
	public List<T> create(int i) throws InstantiationException, IllegalAccessException {
		List<T> res = new ArrayList<T>();
		for (int j = 0; j < i; j++) {
			res.add(type.newInstance());
			//type.newInstance()会返回确切的类型
		}
		return res;
	}
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		FilledList<CountedInteger> f1 = new FilledList<CountedInteger>(CountedInteger.class);
		List<CountedInteger> create = f1.create(15);
		System.out.println(create);
	}
}
