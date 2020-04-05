package object;

//将DataOnly的代码找出，写成一个程序，然后编译，运行
public class DataOnly {
    int i;
    double d;
    boolean b;

    public static void main(String[] args) {
        DataOnly data = new DataOnly();
        data.i = 47;
        data.d = 1.1;
        data.b = false;
        //第五个练习，把它打印出来
        System.out.println(data.i);
        System.out.println(data.d);
        System.out.println(data.b);
    }
}
