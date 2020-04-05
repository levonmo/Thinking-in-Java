package code_list_three;

public class GenericClassRe {
	public static void main(String[] args) {
		
		Class intClass = int.class;
		intClass = double.class;
		
		Class<Integer> gen = int.class;
		gen = Integer.class;//same thing
//		gen = double.class;//Illegal
		
		/*
		 *普通的Class类允许你指向其他的Class对象，但是泛型语法就是不行，编译器就强制执行额外的类型检查 
		 */
		
		//如果你希望放松一些这样的限制，执行下面这样的代码行不行?
//		Class<Number> numClass = int.class;
		//这样是不行的，它无法工作是因为Integer Class对象 不是 Number Class对象的子类
		
		//为了在使用泛化的Class引用时放松限制，我使用了通配符，它是java泛型的一部分。通配符"?",表示任何事物，这个类。
		Class<?> intClass2 = int.class;
		//上面的代码是优于Class intClass = int.class;即便他们是等价的。Class<?>是使用了非具体的类引用。
		
		//这样就被限定为某种类型，或者是该类型的任何子类。与上面的Class<Number>是截然不同的。任何的Number和它的子类都是可以的
		Class<? extends Number> intClass3 = int.class;
		intClass3 = double.class;//double就是Number的子类，可所以编译是可以通过的

		//如果没有使用泛型，而是使用了普通的类型，你犯了错误就要直到运行的时候才被发现出来。而使用泛型 是在 编译期 就可以被发现出来

		
	}
}
