package code_list_three;

public class SimpleProxyDemo implements Interface {
	private Interface proxied;
	public SimpleProxyDemo(Interface proxied) {
		this.proxied = proxied;
	}
	public void doSomething() {
		System.out.println("SimpleProxyDemo.doSomething");
		proxied.doSomething();
	}
	public void somethingElse(String args) {
		System.out.println("SimpleProxyDemo.somethingElse");
		proxied.somethingElse(args);
	}
	public static void consumer(Interface iface) {
		iface.doSomething();
		iface.somethingElse("H");
	}
	public static void main(String[] args) {
		consumer(new RealObject());
		consumer(new SimpleProxyDemo(new RealObject()));
	}
}

interface Interface {
	void doSomething();
	void somethingElse(String args);
}
class RealObject implements Interface {
	/*
	 * 在任何时刻，只要你想将额外的操作从"实际的"对象中分离到不同的地方，这些代码是你不希望将其合并带应用中的代码，因此代理使得你可以很容易地添加或者移除他们
	 */
	public void doSomething() {
		System.out.println("RealObject.doSomething");
	}
	public void somethingElse(String args) {
		System.out.println("RealObject.somethingElse");
	}
}