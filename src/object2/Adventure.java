package object2;

public class Adventure {
    public static void a(CanFigth x) {
        x.figth();
    }

    public static void b(CanSwim x) {
        x.swim();
    }

    public static void c(CanFly x) {
        x.fly();
    }

    public static void d(ActionCharacter x) {
        x.figth();
    }

    public static void main(String[] args) {
        Hero hero = new Hero();
        a(hero);
        b(hero);
        c(hero);
        d(hero);
        /*
         *	ActionCharacter的 figth方法被调用两次
         */
    }
}

interface CanFigth {
    void figth();
}

interface CanSwim {
    void swim();
}

interface CanFly {
    void fly();
}

interface CanClimb {
    void climb();
}

class ActionCharacter {
    public void figth() {
        System.out.println("ActionCharacter.figth");
    }
}

class Hero extends ActionCharacter implements CanFigth, CanSwim, CanFly {//继承一个类，实现多个接口

    /*
     * CanFigth接口的figth方法没有实现，因为与继承的ActionCharacter中的figth方法冲突，当转型为CanFigth类调用figth方法时，调用的是ActionCharacter的
     */
    public void fly() {
        System.out.println("Hero.fly");
    }

    public void swim() {
        System.out.println("Hero.swim");
    }
}
