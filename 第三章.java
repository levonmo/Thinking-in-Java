import object.Dog;
import object.ObjectG;
import object.PassObject;
import object.Value;

public class 第三章 {

    /*
     * ·第三章：操作符
     * 	·使用java操作符
     *	  ·基本所有的操作符都只能操作"基本类型"。但这些操作符能操作对象"="，"=="，"!="，除此之外，String类支持"+"和"+="
     *
     *	·算术操作符
     *	  ·整数的除法会直接去掉结果的小数位，而不是四舍五入地圆整结果
     *	  ·同时进行运算与赋值操作。例如:要将x加4，并将结果赋回给x，可以这么写:x+=4
     *	  ·自动递增和递减(具体的区别可以看下面的例子):
     *		·前缀式:先执行运行，在赋值
     *		·后缀式：先赋值，再运行
     *	·关系操作符
     *	  ·关系操作符生成的是一个boolean结果，是计算操作数值之间的关系。
     *		如果关系是真实的，关系表达式会生成true,如果不真实生成false。
     *		有<,>,<=,>=,==,!=。
     *	  ·等于和不等于适用于所有的基本数据类型，而其他比较符不适合boolean类型(其他类型没有意义)。
     *	  ·测试对象的等价性：使用==和！=可以比较对象是不是同一个对象(基本类型和所有的对象都适合)，
     *		equals方法(不适合基本类型)比较的是两个对象的内容是不是一样的。
     *
     *	·逻辑运算符
     *	  ·"&&"与 "||"或,"!"非
     *	  ·能根据参数的逻辑关系，生成一个布尔值(true或false)
     * 	  ·短路:当 使用"&&" 运行符时，会遇到一种"短路"现象，即一旦确定表达式的值，就不再计算下面的部分了(可以将性能提高 )。
     *	  ·指数记数法:在java中看见 1.39e-43f这样的表达式，它真正的含义是1.39*10的43次方
     *	  ·三元操作符(if-else):boolean-exp ? value0 : value1  ，如果boolean-exp的值为true就计算value0，false就计算value1.
     *	  ·类型转换操作符:
     *		·窄化转化:将  精度高  的转换为  精度低  的，可能会面临信息丢失，必须使用强制类型转换。例如:double d = 2.2; int i = (int)d;
     *		·扩展转换:将  低精度  的转换为  高精度  的，不用使用强制类型转换，因为新类型肯定能容纳原来类型的信息，例如:int i = 2; double b = i;(这里不用进行强制类型转换)
     *		·截尾和舍入:在执行窄化转换时，，如果将一个浮点数转化为整型值。将29.7转换为int，结果会是29，要想是四舍五入使用的是Math.round(29.7)，等到的就是30了
     *
     *	  ·提升
     *		·对基本数据类型执行运算，只要类型比int小(即char，byte，short)，那么在运算之前，这些值会自动转换成int。这样一来，生成的结果就是int类型的
     *		·如果想把结果赋值给较小的类型，就必须使用类型转换(可能会出现信息丢失)
     *		·通常，表达式中出现最大的数据类型决定了表达式最终结果的数据类型。一个float与double进行运算，结果就是double(double的数据类型大，double可以容纳float，int的数据类型小)
     *			如果将一个int和long值相加，则结果为long(long可以包含int了)
     *
     *
     *	·float 与 double 的区别
     *	  ·float是单精度浮点数，内存分配4个字节，占32位，有效小数位6-7位 double是双精度浮点数，内存分配8个字节，占64位，有效小数位15位
     *	  ·java中默认声明的小数是double类型的，例如double = 4.0 。如果float = 4.0 就会报错，需要使用下面的写法:float = 4.0f或者float x = (float)4.0
     *		其中4.0f后面的f只是为了区别double，并没有其他的意义。
     *	  ·对于编程人员来收，double对float的区别试试：double具有更高的精度，但是double消耗的内存是float的两倍，且double运行的效率比float慢
     *
     *	·整型byte,short,int,long取值范围大小 (这几个都是整数型，上面两个是小数型)
     *	  ·byte的取值范围最小  2的7次方 -1  。(-127到127)
     *	  ·short  2的15次方-1。（-32767到32767）
     *	  ·int  2的31次方－1 。
     *	  ·long  2的63次方-1。
     *
     */

    public static void main(String[] args) {
        charToInt();


        //前缀式与后缀式的区别
        increment();


        //测试对象的等价性
        objectEqual();
        objectEqual2();

        //注意数值过界
        overFlow();

        /*
         * 练习
         */
        PassObject passObject;
        Dog dog;
        ObjectG objectG;
    }

    private static void charToInt() {
        char a = 'a';
        int b = a;
        System.out.println(b);
        char c = '1';
        int d = (int) c;
        System.out.println(d);
    }

    private static void increment() {
        int i = 1;
        int a = ++i;
        System.out.println("前缀式是先进行运行，再将赋值给a，a=" + a);
        int j = 1;
        int b = j++;
        System.out.println("后缀式是先进行赋值给a，再进行运行，b=" + b);
    }

    //测试对象的等价性
    private static void objectEqual() {
        Integer n1 = new Integer(47);
        Integer n2 = new Integer(47);
        /*
         * ==  运算符是用来比较是不是同一个对象的
         * 	如果想比较两个对象的内容是否一样，那么就要使用所有对象都适用的方法equals()。但是这个方法不适合于基本类型，基本类型使用==和！=即可。
         */
        System.out.println(n1 == n2);
        System.out.println(n1 != n2);
        //equals()方法是用来比较两个对象的内容是不是一样的
        System.out.println(n1.equals(n2));
    }

    private static void objectEqual2() {
        Value v1 = new Value();
        Value v2 = new Value();
        v1.i = v2.i = 100;
        System.out.println(v1.equals(v2));
        /*
         * 这次令人费解，结果又是false，这是由于equals()的默认行为是比较引用，所以最好在自己的新类中覆盖equals()方法，。
         * 	上一个之所以是true是因为，大多数的java类库都实现了equals()方法，以便用来比较对象的内容，而不是比较对象的引用
         */
    }


    //注意数值过界
    private static void overFlow() {
        int big = Integer.MAX_VALUE;
        System.out.println("big:" + big);
        /*
         * 如果两个足够大的int值执行乘法运算，结果就会溢出，等到的就不是你想要的结果了。这说明java好，但也没有那么好
         */
        int biggger = big * 2;
        System.out.println(biggger);
    }


}