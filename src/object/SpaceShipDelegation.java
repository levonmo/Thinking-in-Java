package object;

//这种是代理，比继承更加的更加灵活，引用一个成员对象，想要该对象什么方法就调用什么，可以只使用在成员对象中的某个方法，使用继承的话就是强制继承它的所有方法
public class SpaceShipDelegation {
    private String name;
    private SpaceShipControls controls = new SpaceShipControls();//这就是代理，引入一个成员对象，比继承更加的灵活

    public SpaceShipDelegation(String name) {
        this.name = name;
    }

    public void back(int velocity) {
        controls.back(velocity);//可以选择使用其中的几个方法
    }

    public void forward(int velocity) {
        controls.forward(velocity);
    }

    public static void main(String[] args) {
        SpaceShipDelegation spaceship = new SpaceShipDelegation("NSEA");
        spaceship.back(100);
    }
}


/*
 * 这种是使用继承方法，强制你继承它的所有方法
 * 	SpaceShipControls的所有方法在SpaceShip中都暴露出来了
 */
class SpaceShip extends SpaceShipControls {
    private String name;

    public SpaceShip(String name) {
        this.name = name;
    }

    void back(int i) {
        System.out.println("飞船后退");
    }
}



