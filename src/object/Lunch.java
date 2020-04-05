package object;


public class Lunch {
    public static void main(String[] args) {
        Soup.makeSoup();
        Soup2.access();
        Soup2.access();
        Soup2.access();// 无论调用该方法多少次，它只会创建 该对象一次。因为是static的作用，只会创建一份内存(也是单列模式的设计)
    }
}

class Soup {
    /*
     * 注意:如果没有明确地至少创建一个构造器，就会帮你创建一个默认构造器(不带任何参数的构造器)
     */
    private Soup() {
        System.out.println("Soup已经被创建");
    }//任何人都不能创建类对象(只能是这个类里卖弄)，就算是同一个编译单元也不可以

    public static Soup makeSoup() {
        return new Soup();
    }
}

class Soup2 {
    private Soup2() {
        System.out.println("Soup2已经被创建");
    }

    private static Soup2 s2 = new Soup2();

    public static Soup2 access() {
        return s2;
    }
}

