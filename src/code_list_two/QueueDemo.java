package code_list_two;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();
        queue.offer("H");//offer()方法将一个元素插进到队尾
        queue.offer("E");
        queue.offer("L");

        String peek = queue.peek();
        System.out.println("取出队头" + peek);
        String element = queue.element();
        System.out.println("取出队头" + element);
        String remove = queue.remove();
        System.out.println("移除队头" + remove);
        String element1 = queue.element();
        System.out.println("移除一次后再取出队头" + element1);
        /*
         * 	peek()和element()方法都将在不移除的情况下返回队头
         * 	但是peek()方法在队列为空时返回null，而element()方法在队列为空时会抛出异常
         * 	remove()方法移除队头并返回--但队列为空时，会抛出异常NoSuchElementException
         */
    }
}
