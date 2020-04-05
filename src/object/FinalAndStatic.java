package object;

public class FinalAndStatic {

    private final Obj a = new Obj();//使用final关键字，在定义变量的时候必须对其进行赋值，赋值后就不能改变(是指变量的引用不能改变，对象内容可以改变)，每个对象拥有独一无二的一份

    private static final Obj b = new Obj();//所有对象共享一份，完成赋值不能改变，只占一份内存

    public static void main(String[] args) {
        //创建两个对象
        FinalAndStatic fas1 = new FinalAndStatic();
        FinalAndStatic fas2 = new FinalAndStatic();
        //final的hashCode
        System.out.println(fas1.a.hashCode());
        System.out.println(fas2.a.hashCode());
        /*
         * fianl+static的hashCode
         * 就算是final，两个对象的a的值都是不一样的，每个对象都独享一份
         */
        System.out.println(fas1.b.hashCode());
        System.out.println(fas2.b.hashCode());
        /*
         * final+static：所有对象共享一份，hashCode都是一样的
         */
    }
}

class Obj {

}