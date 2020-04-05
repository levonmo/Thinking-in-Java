package code_list_one;

import java.util.Random;

//编写一个程序，模拟投硬币的结果
public class ObjectG {
    public static void main(String[] args) {
        String s;
        Random random = new Random();
        int nextInt = random.nextInt(2) + 1;
        if (nextInt == 1) {
            s = "正面";
        } else {
            s = "反面";
        }
        System.out.println(s);
    }
}
