package code_list_one;

//继承
class Cleanser {

    private String s = "Cleanser";

    public void append(String a) {
        s += a;
    }

    public void dilute() {
        append("dilute()");
    }

    public void apply() {
        append("apply()");
    }

    public void scrub() {
        append("scrub()");
    }

    public String toString() {
        return s;
    }

    public static void main(String[] args) {
        Cleanser x = new Cleanser();
        x.dilute();
        x.apply();
        x.scrub();
        System.out.println(x);//默认调用toString方法
    }
}

public class Detergent extends Cleanser {

    //重写
    public void scrub() {
        append("Detergent.scrub()");
        super.scrub();//调用父类的scrub方法
    }

    //添加一个新的方法
    public void foam() {
        append("foam()");
    }

    public static void main(String[] args) {
        Detergent x = new Detergent();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        System.out.println(x);//调用一个对象，默认是调用它的toString方法
        Cleanser.main(args);//调用另一个类中的main函数
    }

}

//从Detergent类中继承产生一个新的类。覆盖scrub()并添加一个名为sterilize()的新方法
class DetergentSon extends Detergent {

    //重写Detergent类的scrub()方法
    public void scrub() {
        System.out.println("DetergentSon.scrub");
    }

    //添加一个新的方法
    public void sterilize() {
        System.out.println("DetergentSon.sterilize");
    }

    public static void main(String[] args) {
        DetergentSon x = new DetergentSon();
        x.scrub();//重写的方法
        x.foam();//调用父类的方法
        x.apply();//调用父父类的方法
        x.sterilize();//调用该类新写的方法
    }
}
