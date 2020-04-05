package code_list_one;

//初始化基类
public class Cartoon extends Drawing {

    public Cartoon() {
        System.out.println("Cartoon对象创建");
    }

    public static void main(String[] args) {
        Cartoon cartoon = new Cartoon();
        /*
         * 当创建一个Cartoon对象时，首先创建一个最顶层的父类，然后一级级往下创建基类的子对象
         * 	基类在导出类构造器调用之前就已经完成初始化了
         */
    }

}

class Art {
    Art() {
        System.out.println("Art对象创建");
    }
}

class Drawing extends Art {
    Drawing() {
        System.out.println("Drawing对象创建");
    }
}
