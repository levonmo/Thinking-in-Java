package code_list_two;

import java.util.PriorityQueue;

//创建一个继承自Object的简单类，它不包含任何成员，展示你不能将这个类多个实例成功的添加到一个PriorityQueue中。在17章会讲到这个问题
public class Object1 {
    public static void main(String[] args) {
        PriorityQueue<Object1A> queue = new PriorityQueue<Object1A>();
        queue.offer(new Object1A());
        queue.offer(new Object1A());
        queue.offer(new Object1A());
        queue.offer(new Object1A());
        queue.offer(new Object1A());
        System.out.println(queue.size());
        //运行的结果是报错的，就是不能将多个实例添加到一个PriorityQueue中去
    }
}

class Object1A {
}
