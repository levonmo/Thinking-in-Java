package code_list_one;

public class Hide {
    public static void main(String[] args) {
        Bart bart = new Bart();
        char c = bart.methodA('A');
        float f = bart.methodA(1.2f);
        float f1 = bart.methodA(1);//这里应该自动的进行类型的转换
        Milhouse milhouse = bart.methodA(new Milhouse());
        System.out.println(c);
        System.out.println(f);
        System.out.println(f1);
        System.out.println(milhouse);
        /*
         * 说明Bart中Homer中的所有重载方法都是可用的
         * 	要想覆盖一个重载的方法，则需要使用与基类完全相同的特征签名以及返回值类型()这样就可以覆盖原来的方法
         */
    }
}

class Homer {
    /*
     * 记得返回值类型不能作为重载的依据，参数才是重载的条件之一
     */
    char methodA(char c) {
        System.out.println("Homer.methodA.char");
        return c;
    }

    float methodA(float f) {
        System.out.println("Homer.methodA.float");
        return f;
    }
}

class Milhouse {
}

class Bart extends Homer {
    //这里进行了基类方法的重载，方法名一样参数不一样
    Milhouse methodA(Milhouse m) {
        System.out.println("Bart.methodA.Milhouse");
        return m;
    }
    /*
     * javaSE5.0新增加了@Override注解，它并不是关键字，但是可以当成关键字来使用
     * 	当你想要覆写某个方法时，可以选择添加这个注解，当你不留心重载(方法名一样，参数与返回值类型不一样) 而不是 覆写(覆写需要特征签名与返回值类型一样)时 就会报错
     * 	@Override注解可以防止你在不想重载时而意外进行了重载
     */
}