package code_list_three;

import code_list_one.A2;
import code_list_two.A1;

public class A3 extends A2 {
	//这里进行向上转型
	public A1 getA1() {
		return new A2Inner();
	}
	public static void main(String[] args) {
		A3 a3 = new A3();
		A1 a1 = a3.getA1();
		a1.method();
	}
}
