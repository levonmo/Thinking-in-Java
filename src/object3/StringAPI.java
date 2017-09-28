package object3;

public class StringAPI {
	/*
	 * ·length():String中的字符个数
	 * ·charAt(int i):取得该索引位置上的char
	 * ·toCharArray():将一个String对象生成一个char[]
	 * ·equals():比较两个String的内容是不是一样
	 * ·equalsIgnoreCase():比较String对象的内容是否一样，忽略大小写
	 * ·contains(String s):如果该String对象包含的参数的内容，就返回ture
	 * ·contentEquals(String s):如果该String对象与s对象的内容完全一致就返回true
	 * ·startsWith(String s):表明String是否以此参数起始
	 * ·endsWith(String s):表明String是否以此参数结束
	 * ·indexOf(String s):如果该String并不包含此参数，就返回-1.否则就返回该参数在String中的索引
	 * ·lastIndexOf(String s):和上面的功能一样，只是这个是从后面就行检索的.但是索引值还是从前面开始计算，第一个字符的索引值为零
	 * ·substring(int index, int ends):指定开始和结束的索引值返回一个新的String
	 * ·substring(int index):还有一个重载的，输入开始索引，截取到最后的字符
	 * ·concat(String s):返回一个新的 String对象，内容为原始String连接上参数的String
	 * ·replace(String s1,String s2):s1旧字符，s2是新字符。返回替换后的新String对象。如果没有替换发生，返回原始对象
	 * ·toLowerCase(),toUpperCasr():改变大小写，如果没有发生更改，则返回原始对象
	 * ·trim():将String两边的空白字符删除
	 * ·valueOf():返回一个表示参数内容的String，接受输入类型有char，boolean，int，long，float，double
	 * ·intern()：为每个唯一的字符序列生成一个且仅生成一个String引用
	 * 
	 * 	从这个表中可以看出，当需要改变字符串的内容时，String类的方法都会返回一个新的String对象。
	 * 	同时，如果内容没有改变的话，String方法只是返回指向原对象的引用，这样可以节约存储空间以及避免额外的开销
	 * 	
	 */
	public static void main(String[] args) {
		String a = "abcdefghijk";			System.out.println(a.length());
		char charAt = a.charAt(3);			System.out.println(charAt);//3索引上的char是d，因为是从零开始计算索引的
		char[] charArray = a.toCharArray(); System.out.println(charArray);//将一个个字符分割开 为一个 char数组对象
		boolean e = a.equals("abcdefghijk");System.out.println(e);//比较的是内容是不是一样
		boolean contains = a.contains("abc");System.out.println(contains);
		boolean c = a.contentEquals("abcdefghijk");System.out.println(c);
		boolean s = a.startsWith("abc");		System.out.println(s);
		int indexOf = a.indexOf("d");		System.out.println(indexOf);//存在d，并且d在该String中的索引正是3(从0开始计算)
		int li = a.lastIndexOf("a");		System.out.println(li);
		String s1 = a.substring(0,2);		System.out.println(s1);
		String concat = a.concat("abc");	System.out.println(concat);
		String r = a.replace("abc", "aaa");	System.out.println(r);
		String trim = "   abc   ".trim();	System.out.println(trim);
	}
}
