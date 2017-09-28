package object2;

import java.util.Iterator;

//迭代器
public class IterableClass implements Iterable<String> {
	protected String[] words = "A,B,C,D,E,F,G,H,I".split(",");
	//这就自己写了一个迭代器
	public Iterator<String> iterator() {
		/*
		 * 返回的是实现了Iterator<String>的匿名内部类的实例，该匿名内部类可以遍历数组中的所有字母
		 * 	实现Iterable接口，就要实现iterator方法，因为在Iterable内中有一个抽象方法是iterator。并且它的类型是Iterator
		 */
		return new Iterator() {
			private int index = 0;
			public boolean hasNext() {
				return index < words.length;
			}
			public Object next() {
				return words[index++];
			}
			public void remove() {
				throw new UnsupportedOperationException();
			}
		};
	}
	
	public static void main(String[] args) {
		IterableClass it = new IterableClass();
		for (String str : it) {
			System.out.print(str + " ");
		}
	}
	
}
