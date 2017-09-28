package object3;

//String对象是不可变的
public class Immutable {
	public static String upcase(String s) {
		return s.toUpperCase();
	}
	public static void main(String[] args) {
		String q = "aaabb";
		System.out.println(q);
		String qq = upcase(q);
		/*
		 * 当q传给upcase()方法时，实际上传递的是一个引用的拷贝。
		 * 	其实，每当把String对象作为方法的参数时，都会复制一份引用，而该引用所指的对象其实一直待在单一的物理位置上，从未动过
		 *	返回的qq也是一个全新的对象了 
		 */
		System.out.println(qq);
		System.out.println(q);
	} 
}
