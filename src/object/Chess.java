package object;

//初始化带有参数的构造器
public class Chess extends BoardGame {

	public Chess(int i) {
		/*
		 * 要想使用带有参数的构造器必须将参数 通过super传到父类
		 */
		super(i);
		System.out.println("Chess对象创建" + "i=" + i);
	}
	
	public static void main(String[] args) {
		Chess chess = new Chess(12);//指定参数创建对象，分别调用了三个带有参数的构造器，创建了两个基类的子对象，一个外部对象。
	}

}
class Game {
	Game(int i) {
		System.out.println("Game对象创建" + "i=" + i);
	}
}
class BoardGame extends Game {

	BoardGame(int i) {
		super(i);//调用Game带有参数的构造器
		System.out.println("BoardGame对象创建" + "i=" + i);
	}
	
}

