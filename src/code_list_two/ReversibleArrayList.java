package code_list_two;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

//自己设计一个反向遍历的foreach语句
public class ReversibleArrayList<T> extends ArrayList<T> { //继承类ArrayList，间接继承了Iterable
	public ReversibleArrayList(Collection<T> c) {
		super(c);
	}
	//这个迭代器可以进行反向的遍历
	public Iterable<T> reversed() {
		return new Iterable<T>() {
			public Iterator<T> iterator() {
				return new Iterator() {
					int current = size() - 1; //size()方法是ArrayList中的，找出有多少的元素-1，就是最后一个元素的下标了
					public boolean hasNext() {
						return current > -1;
					}
					public Object next() {
						return get(current--);
					}
					public void remove() {
						throw new UnsupportedOperationException();
					}
					
				};
			}
		};
	}
	
	public static void main(String[] args) {
		ReversibleArrayList<String> list = new ReversibleArrayList<String>(Arrays.asList("A","B","C","D")); 
		
		//正向遍历的foreach
		Iterator<String> iterator = list.iterator();
		System.out.println("正向遍历");
		for (String str : list) {
			System.out.print(str + " ");
		}
		System.out.println();
		
		//获得反向遍历迭代器，反向遍历的foreach的可以使用了
		Iterable<String> reversed = list.reversed();
		System.out.println("反向遍历");
		/*
		 * 如果直接将list对象置于foreach语句中，将得到默认向前迭代器。但是如果在该对象上调用reversed()方法，就会产生不同的行为。因为自己自定义的reversed是实现了反向排序的
		 */
		for (String str : reversed) {
			System.out.print(str + " ");
		}
	}
}
