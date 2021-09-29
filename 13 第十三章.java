import code_list_three.Concatenation;
import code_list_three.Immutable;
import code_list_three.StringAPI;
import test.ArrayListDisplay;

public class 第十三章 {

    /*
     * 第十三章：字符串(String)
     * 	·不可变的String
     */
    Immutable immutable;
    /*
     * ·重载 "+" 与StringBuilder
     * 	·String对象是不可变的，可以给String对象多个别名。String对象具有只读性，所以指向它的任何引用都不能改变它。
     * 	·不可变性会带来一定的效率问题，为String对象重载的"+"操作符就是一个例子。重载的意思是，一个操作符在应用与特定 的类时，被赋予了不同的意思
     */
    Concatenation concatenation;

    /*
     * ·无意识的递归
     */
    ArrayListDisplay arrayListDisplay;

    /*
     * ·String类基本的API
     */
    StringAPI stringAPI;


}
