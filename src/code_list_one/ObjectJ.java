package code_list_one;

//创建一个包包含两个方法的基类。在第一个方法中可以调用第二个方法，产生一个继承自该基类的导出类，且覆盖基类中的第二个方法。为导出类创建一个对象
public class ObjectJ {

    public void methodA() {
        System.out.println("ObjectJ.mehodA");
        mehodB();
    }

    public void mehodB() {
        System.out.println("ObjectJ.mehodB");
    }

    public static void main(String[] args) {
        //为导出类创建一个对象，并向上转型到基类型  ，并调用第一个方法
        ObjectJ objectJ = new ObjectJA();
        objectJ.methodA();
        /*
         * 用基类的引用指向一个导出类实例，调用一个方法(这个方法在导出类没有重写)，但是该方法内部还调用一个方法(在导出类中有重写，一样是遵守多态的)
         * 	在基类内部调另一个方法，如果该方法在导出类中有重写，则是调用导出类中重写的那个方法
         */
    }
}

class ObjectJA extends ObjectJ {
    public void mehodB() {
        System.out.println("ObjectJA.mehodB");
    }
}
