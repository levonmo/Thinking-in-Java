package object;

public class FieldAccess {
    public static void main(String[] args) {

        //到基类引用指向一个导出类对象
        Super su = new Sub();
        System.out.println(su.field);//对于域并没有多态
        System.out.println(su.getField());//对于方法就存在多态了

        Sub sup = new Sub();
        /*
         * 其实在这里sup对象包含了两个称为field的域：自己一个，基类一个(在创建sup对象时，已经为其创建子对象Super，只是你没有看见)
         * 	在引用Sub中的field域并不是Super中的(是Sup它自己的)，要想等到Super中的field域，必须显式的指明super.field
         */
        System.out.println(sup.field);
        System.out.println(sup.getField());
        System.out.println(sup.getSuperField());//这里是调用基类的域

    }
}

class Super {
    public int field = 0;

    public int getField() {
        return field;
    }
}

class Sub extends Super {
    public int field = 1;

    public int getField() {
        return field;
    }

    public int getSuperField() {
        return super.field;//调用基类的field域
    }
}
