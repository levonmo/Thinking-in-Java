package object2;

//创建一个类，它持有一个String，并且有一个显示这个String的toString方法，将你的新类的若干个对象添加了Sequence对象中，然后显示它们
public class ObjectI {
	private String str;
	public String toString() {
		return str;
	}
	public static void main(String[] args) {
		Sequence sequence = new Sequence(12);
		//向数组中 加元素
		for(int i=0; i <12; i++) {
			sequence.add(Integer.toString(i));
		}
		Selector selector = sequence.getSelector();
		//进行遍历
		while(!selector.end()) {
			System.out.println(selector.current());
			selector.next();
		}
	}
}
