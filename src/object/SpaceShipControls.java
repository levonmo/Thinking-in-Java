package object;

public class SpaceShipControls {

	//没有权限修饰符默认是包访问权限
	void up(){}
	void down(){}
	void left(){}
	void rigth(){}
	void forward(int i){System.out.println("飞船加速" + i);}
	void back(int i){System.out.println("飞船减速" + i);}
}
