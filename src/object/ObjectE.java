package object;

//编写一个程序，展示自动包装类型功能对所有的基本类型和包装类型都起作用
public class ObjectE {

    public static Integer changePackageType(int i) {
        Integer packageType = i;
        return packageType;
    }

    public static Double changePackageType(double d) {
        Double packageType = d;
        return packageType;
    }

    public static Float changePackageType(float f) {
        Float packageType = f;
        return packageType;
    }

    public static void main(String[] args) {
        int i = 47;
        System.out.println(i);
        //将基本类型int转换为其包装类型
        Integer integer = ObjectE.changePackageType(i);
        System.out.println(integer.hashCode());
        double d = 2.2;
        System.out.println("这个是基本类型：" + d);
        //将基本类型double转换为其包装类型
        Double dou = ObjectE.changePackageType(d);
        //可以输出一个哈希骂值，就是已经将基本类型转换为包装类型了
        System.out.println("转换为包装类的值是：" + dou + "该包装类的hashCode值是：" + dou.hashCode());
    }
} 
