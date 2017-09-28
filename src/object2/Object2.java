package object2;

import java.util.Iterator;

//自己动手编写一个迭代器B 
public class Object2<T> implements Iterable<T>{
	protected T[] t;
	public Object2(T[] t) {
		this.t = t;
	}
	public Iterator<T> iterator() {
		return new Iterator(){
			private int count = 0;
			public boolean hasNext() {
				return count < t.length;
			}
			public Object next() {
				return t[count++];
			}
			public void remove() {
			}
		};
	}
 	public static void main(String[] args) {
		Integer[] arr = {1,2,3,4,5,6};
		Object2<Integer> object2 = new Object2<Integer>(arr);
		for (Integer i : object2) {
			System.out.print(i + " ");
		}
	}
}
class Object2A<T> extends Object2 {
	public Object2A(T[] t) {
		super(t);
	}
	public Iterable<T> iterator2() {
		return new Iterable() {
			public Iterator iterator() {
				return new Iterator() {
					public int count = t.length - 1;//这是最后一个下标的元素
					public boolean hasNext() {
						return count != -1;
					}
					public Object next() {
						return t[count--];
					}
					public void remove() {
					}
				};
			}
		};
	}
	public static void main(String[] args) {
		Integer[] arr = {1,2,3,4,5,6};
		Object2A object2a = new Object2A(arr);
		for (Object o : object2a) {
			System.out.print(o);
		}
		System.out.println();
		//这样就可以进行反向遍历了
		for (Object o : object2a.iterator2()) {
			System.out.print(o);
		}
	}
}