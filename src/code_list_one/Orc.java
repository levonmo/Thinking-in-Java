package code_list_one;

//protected关键字
public class Orc extends Villain {
    private int orcNumber;

    public Orc(String name, int orcNumber) {
        super(name);
        this.orcNumber = orcNumber;
    }

    public void change(String name) {
        set(name);//这里是调用父类的set方法，因为父类的set方法是protected，所以在它的导出类中是可以使用的。
        /*
         * 通过这个方法可以改变父类中的某个域(只能有它的导出类可以改变)
         */
    }

    public static void main(String[] args) {
        Orc orc = new Orc("aa", 12);
        orc.print();
        orc.change("bb");//父类私有的域已经被改变
        orc.print();
    }
}

class Villain {
    private String name;

    public Villain(String name) {
        this.name = name;
    }

    /*
     * 在它的导出类中，是可以访问这个方法的
     * 	如果是private的话就是只有本类可以访问
     * 	  如果是public就是任何人都可以使用
     */
    protected void set(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println(name);
    }
}
