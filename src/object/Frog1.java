package object;

public class Frog1 extends Amphibian1 {//2.寻找该类是否有基类(通过extends关键字可以知道)，依次类推，最后到根基类
    private Charateristic p = new Charateristic("a3");
    private Description d = new Description("b3");

    public Frog1() {
        System.out.println("Frog1");
    }

    protected void dispose() {
        System.out.println("Frog1.dispose");
        d.dispose();
        p.dispose();
        super.dispose();
    }

    public static void main(String[] args) {//1.首先加载main方法(一个static方法)
        //  6.同样的方法Frog1被实例化
        Frog1 frog1 = new Frog1();
        System.out.println("Bye!");
        frog1.dispose();
        /*
         * 7. 调用dispose方法
         * 	这里刚好与前面的相反，先执行导出类的dispose方法，在依次执行到根基类的dispose方法，从输出的结果来看，Frog1对象的所有部分都是按照创建的逆序进行销毁
         */
    }
}

class Charateristic {
    private String s;

    public Charateristic(String s) {
        this.s = s;
        System.out.println("Charateristic构造器");
    }

    protected void dispose() {
        System.out.println("Charateristic.dispose");
    }
}

class Description {
    private String s;

    public Description(String s) {
        this.s = s;
        System.out.println("Description构造器");
    }

    protected void dispose() {
        System.out.println("Description.dispose");
    }
}

class LivingCreature {
    /*
     * 3.这里是根基类，首先是创建该类的对象。先初始化域(成员变量)，Charateristic和Description对象都被创建(各自的构造器被调用)，
     *   成员变量实例化的顺序是按照你编写的顺序。然后再调用LivingCreature的构造器，LivingCreature对象被创建。依次类推，同样的方法创建下一个导出类
     *
     */
    private Charateristic p = new Charateristic("a");
    private Description d = new Description("b");

    public LivingCreature() {
        System.out.println("LivingCreature构造器");
    }

    protected void dispose() {
        System.out.println("LivingCreature.dispose");
        d.dispose();
        p.dispose();
    }
}

class Animal extends LivingCreature {
    /*
     * 4.上面已经创建了基类LivingCreature的对象，就有了创建该对象的条件了。先初始化成员变量(构造器被调用)，成员初始化完，创建该对象
     */
    private Charateristic p = new Charateristic("a1");
    private Description d = new Description("b1");

    public Animal() {
        System.out.println("Animal");
    }

    protected void dispose() {
        System.out.println("Animal.dispose");
        d.dispose();
        p.dispose();
        super.dispose();
    }
}

class Amphibian1 extends Animal {
    /*
     * 5.同样的方法创建该对象
     */
    private Charateristic p = new Charateristic("a2");
    private Description d = new Description("b2");

    public Amphibian1() {
        System.out.println("Amphibian1");
    }

    protected void dispose() {
        System.out.println("Amphibian1.dispose");
        d.dispose();
        p.dispose();
        super.dispose();
    }
}
