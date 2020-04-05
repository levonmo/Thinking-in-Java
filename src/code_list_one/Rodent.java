package code_list_one;

/*
 * 创建Rodent数组，填充不同的Rodent类型，然后调用基类的方法
 */
public class Rodent {
    public void eat() {
    }//定义一个通用方法

    public static void main(String[] args) {
        //填充一个数组
        Rodent[] rodent = new Rodent[3];
        rodent[0] = new Mouse();
        rodent[1] = new Gerbil();
        rodent[2] = new Hamster();
        for (Rodent r : rodent) {
            r.eat();
        }
    }
}

class Mouse extends Rodent {
    public void eat() {
        System.out.println("Mouse");
    }
}

class Gerbil extends Rodent {
    public void eat() {
        System.out.println("Gerbil");
    }
}

class Hamster extends Rodent {
    public void eat() {
        System.out.println("Hamster");
    }
}