package object3;

//现在我们不用LinkedList，来实现自己内部的链式存储机制
public class LinkedStack<T> {
	private static class Node<U> {
		U item;
		Node<U> next;
		Node() {
			this.item = null;;
			this.item = null;;
		}
		Node(U item,Node<U> next) {
			this.item = item;
			this.next = next;
		}
		boolean end() {
			return item == null && next == null;
		}
	}
	private Node<T> a = new Node<T>(); 
	//向容器放进一个item
	public void push(T item) {
		a = new Node<T>(item,a);
	}
	public T pop() {
		T result = a.item;
		if (!a.end()) {
			a = a.next;
		}
		return result;
	}
	/*
	 * 这个末端哨兵是在构建LinkedStack时创建的。然后，每调用一次push()方法，就会创建一个Node<>对象，并将其链接到前一个Node<T>对象，
	 * 当你调用pop()方法时，总是调用item()方法，然后就舍弃当前的item，指向下一个Node。但你一直舍弃舍弃到末端哨兵的时候，它只能等待null。说明堆栈已经空了 
	 */
	public static void main(String[] args) {
		LinkedStack<String> stack = new LinkedStack<String>();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		String s;
		while((s = stack.pop()) != null) {
			System.out.println(s);
		}
	}
}
