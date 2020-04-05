package code_list_three;

import java.util.Random;

public class Concatenation {
	public static void main(String[] args) {
		String mango = "mango";
		String s = "abc" + mango + "def" + 37;
		System.out.println(s);
		/*
		 * ·这段代码是这样工作的
		 *   ·编译器自动引入了StringBuilder类。虽然我们没有在源码中使用StrinBuilder类，但是编译器却自做自张地使用了它，因为它很高效
		 * 	
		 * ·在这个例子中，
		 * 	  ·编译器自动的创建一个StringBuilder对象，用以构造最终的String字符串，并为每个字符串调用一次StringBuilder的append()方法。最终调用toString方法，返回给调用者
		 * 
		 */
	}
}
//下面用两种方式生成一个String对象
class WhitherStringBulder {
	
	//第一种是使用+操作符进行 拼接出一个新的 字符串
	public String implicit(String[] strArr) {
		String res = "";
		for (int i = 0; i < strArr.length; i++) {
			res += strArr[i];
			//如果是使用这种循环的话，编译器就会帮你创建很多的StringBuilder。一次循环帮你创建一个StringBuilder对象
		}
		return res;
	}
	
	//第二种是创建一个StringBuilder对象，然后使用该对象的API进行拼接新的字符串
	public String explicit(String[] strArr) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < strArr.length; i++) {
			sb.append(strArr[i]);//使用这种StringBuilder的API来进行字符串的连接的话就不会帮你创建很多对象，自会帮你创建一个对象
		}
		return sb.toString();
	}
}
/*
 * 当你为一个类编写toString()方法时，如果字符串操作比较简单，那就可以信赖编译器，它会为你合理地构造最终的结果。但是，如果你在toString()中使用循环，
 * 那么最好自己创建一个StringBuilder对象，用它来构造结果
 */
class UsingStringBuiler {
	public static Random rand = new Random(47); 
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i < 25; i++) {
			sb.append(rand.nextInt(100));
			sb.append(",");
		}
		sb.delete(sb.length() - 3, sb.length());
		sb.append("]");
		return sb.toString();
	}
	public static void main(String[] args) {
		UsingStringBuiler usingStringBuiler = new UsingStringBuiler();
		System.out.println(usingStringBuiler.toString());
	}
}

