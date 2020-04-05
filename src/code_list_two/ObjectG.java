package code_list_two;

//验证，接口中的域都是隐式的static和final
public class ObjectG {
    public static void main(String[] args) {
        System.out.println(ObjectGA.A);//使用类名就可以直接访问，证明是static
//		ObjectGA.A = 2;//接口中的域都是final，不能改变它的值

    }
}

interface ObjectGA {
    int
            A = 1, B = 2;
}