package code_list_three;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class LostInformation {
	public static void main(String[] args) {
		
		List<Frob> list = new ArrayList<Frob>();
		HashMap<Frob, Fnorkle> map = new HashMap<Frob, Fnorkle>();
		Quark<Fnorkle> quark = new Quark<Fnorkle>();
		Particle<Long, Double> p = new Particle<Long,Double>();
		
		System.out.println(Arrays.toString(list.getClass().getTypeParameters()));
		System.out.println(Arrays.toString(map.getClass().getTypeParameters()));
		System.out.println(Arrays.toString(quark.getClass().getTypeParameters()));
		System.out.println(Arrays.toString(p.getClass().getTypeParameters()));
		/*
		 * 在JDK文档中介绍，Class.getTypeParameters()将"返回一个TypeVariable对象数组，表示有泛型声明所声明的类型参数 "  这好像是在暗示你可能
		 * 	发现参数类型的信息。但是实际上并不是这样的，正如你从输出中所看到的，输出的只是用于参数占位符的标识符，这并不是有用的信息
		 * 
		 * 	·因此，残酷的现实是：在泛型代码的内部，无法获得  任何有关泛型参数类型  的信息
		 * 		因此，你可以知道诸如类型参数标识符和泛型类型边界这类的信息--但是你却不能创建  该类型参数的类型  的实例。
		 * 		class A<T> {
		 * 			Class clas = T.class;
		 * 		}
		 * 		上面这段代码是无法通过编译的，因为编译器根本无法找到T的实际类型是什么，就更无法找到它的Class对象了
		 */
	}
}
class Frob {}
class Fnorkle {}
class Quark<Q> {}
class Particle<POSITION,MOMENTUM> {}
