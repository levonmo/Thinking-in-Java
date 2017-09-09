package object;

public class Book {
	boolean checkedOut = false;
	public Book(boolean checkedOut) {
		this.checkedOut = checkedOut;
	}
	//每本书都要签入
	public void checkIn(){
		checkedOut = false;
		System.out.println("书被签入");
	}
	//当进行垃圾回收前调用这个方法
	protected void finalize()  {
		//如果没有被签入，checkedOut就为true，这时候当回收该对象的时候就会执行下面的代码
		if (checkedOut) {
			System.out.println("书没有被签入");
		}
	}
	public boolean getCheckedOut(){
		return checkedOut;
	}
	public static void main(String[] args) {
		Book book = new Book(true);
		book.checkIn();//将书签入
		new Book(true);
		System.gc();//强制进行终结动作(回收)，new出来的书还没有被签入
		/*
		 * 本例的终结条件是:所有的Book对象在被垃圾回收前都应该被签入。但在main()方法中，由于程序员的错误，有一本书未被签入。
		 * 	要是没有finalize()方法来验证终结条件，将很难发现这种缺陷。
		 * 注意:System.gc()用于强制进行终结动作。即使没有这样做，通过重复的执行程序(假设程序将分配大量的存储空间而导致垃圾回收动作的执行，垃圾回收器是当内存满了才进行清理工作的)，
		 * 	最终也会将Book对象回收(但是Book还有一个对象没有被签入)
		 */
	}
}