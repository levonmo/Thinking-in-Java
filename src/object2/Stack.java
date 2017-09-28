package object2;

import java.util.LinkedList;

//实现一个栈，主要有几个方法：一个是压栈 ，一个是从栈中取出元素，最后一个在栈中删除元素
public class Stack<T> {
	private LinkedList<T> list = new LinkedList<T>();
	//压栈：向栈中添加元素
	public void push(T v) {
		list.addFirst(v);
	}
	//从 栈顶 取出元素
	public T peek() {
		return list.getFirst();
	}
	//删除 栈顶 的元素。返回被删除的元素
	public T pop() {
		return list.removeFirst();
	}
	public boolean isEmpty() {
		return list.isEmpty();
	}
	public String toString() {
		return list.toString();
	}
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		System.out.println("容器元素的排序" + stack.toString());//这时候3是在栈顶的，因为3是最后进去的
		System.out.println("从栈中取出元素" + stack.peek());//这时候从栈顶取出的元素就是3了
		stack.pop();//从栈中删除元素
		System.out.println(stack);//这就剩下先前在栈底的两个元素了
		while(!stack.isEmpty()) {//如果栈不为空 就从栈中取出元素
			Integer peek = stack.peek();
			System.out.println(peek);
			//从栈中删除元素
			stack.pop();
		}
	}
}
