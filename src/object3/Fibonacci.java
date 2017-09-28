package object3;

import java.util.Iterator;

public class Fibonacci implements Generator<Integer> {
	private int count = 0;
	public Integer next() {
		return fib(count++);
	}
	public int fib(int n) {
		if (n < 2) {return 1;}
		return fib(n-2) + fib(n-1);
	}
	public static void main(String[] args) {
		Fibonacci gen = new Fibonacci();
		for (int i = 0; i < 18; i++) {
			System.out.println(gen.next());//这种调用一次next()方法就返回一个对象给你，泛型接口用于生产对象
		}
	}
}
/*
 * 如果想更进一步，编写一个实现Iterable的Fibonacci生成器。我们的一个选择就是重写该类，令其实现所需的接口，但是你并不是总拥有源代码的控制权
 * 	这样，我们还有另一种选择，就是使用 适配器 来实现需要的接口。这是一个钟设计模式
 */
class IterableFibonacci extends Fibonacci implements Iterable<Integer> {
	private int n;
	public IterableFibonacci(int n) {
		this.n = n;
	}
	public Iterator<Integer> iterator() {
		return new Iterator<Integer>() {
			public boolean hasNext() {
				return n > 0;
			}
			public Integer next() {
				n--;
				return IterableFibonacci.this.next();
			}
			public void remove() {
			}
		} ;
	}
	public static void main(String[] args) {
		for (int st : new IterableFibonacci(18)) {
			System.out.println(st);
		}
	}
}









