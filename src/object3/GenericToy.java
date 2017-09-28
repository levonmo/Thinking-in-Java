package object3;

public class GenericToy {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		//返回FancyToy的Class对象
		Class<FancyToy> ftClass = FancyToy.class;
		//通过Class对象，获取其实例
		FancyToy fancyToy = ftClass.newInstance();//FancyToy要有默认的构造器
		
		//获取基类的Class对象
		Class<? super FancyToy> superclass = ftClass.getSuperclass();
		/*
		 * 这里为什么返回的是Class<? super FancyToy>，而不直接返回Toy?
		 * 	因为不仅仅要表示它的类型是什么，它还是FancyToy的基类。正是由于这种含糊性，想通过Class对象，获取其实例，返回值就不是一个精确的类型，而是一个Object
		 */
		Object newInstance = superclass.newInstance();
		System.out.println(newInstance instanceof Toy);//里面的类型信息并没有 丢失，还可以进行类型的转换  转化为Toy类型的
	}
}
