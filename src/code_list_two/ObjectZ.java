package code_list_two;

import java.util.PriorityQueue;

public class ObjectZ {
    public static void main(String[] args) {
        PriorityQueue<Double> queue = new PriorityQueue<Double>();
        //向队列中填充数据
        queue.offer(1.2);
        queue.offer(2.2);
        queue.offer(6.2);
        queue.offer(4.2);

        //peek()方法会返回队头，但是当没有元素的时候返回的是null
        while (queue.peek() != null) {
            //使用poll()方法移除--poll()和remove()方法都是移除队头元素，但是poll在队列为空的时候返回的是null，而使用remove()会抛出异常
            System.out.println(queue.poll());
        }
    }
}

