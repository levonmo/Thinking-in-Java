package object2;

import java.util.Random;

public class TestRandVals {
	public static void main(String[] args) {
		System.out.println(RandVals.RANDOM_INT);
		System.out.println(RandVals.RANDOM_LONG);
		System.out.println(RandVals.RAND_FLOAT);
		System.out.println(RandVals.RAND_DOUBLE);
		
		System.out.println(RandVals.RANDOM_INT);
		System.out.println(RandVals.RANDOM_LONG);
		System.out.println(RandVals.RAND_FLOAT);
		System.out.println(RandVals.RAND_DOUBLE);
		//无论被访问多少次，一旦被初始化，它们的值都是唯一的
		System.out.println(RandVals.RANDOM_INT);
		System.out.println(RandVals.RANDOM_LONG);
		System.out.println(RandVals.RAND_FLOAT);
		System.out.println(RandVals.RAND_DOUBLE);
		/*
		 * 一旦被初始化，那么接口RandVals中的域就是已经确定了，无论是访问多少次都是不会改变的。而且是存储在一块区域里面的
		 * 	当然，这些域并不是接口的一部分，它们的值被存储在该接口的静态存储区域内。
		 */
	}
}
interface RandVals {
	Random RAND = new Random();
	int RANDOM_INT = RAND.nextInt();
	long RANDOM_LONG = RAND.nextLong();
	float RAND_FLOAT = RAND.nextLong();
	double RAND_DOUBLE = RAND.nextDouble();
	/*
	 * 接口中的所有域都是默认是static和final
	 */
}