package object2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

//又是自己写的一个迭代器
public class MultiIterableClass extends IterableClass {

    //一个任意迭代的
    public Iterable<String> randomized() {
        return new Iterable<String>() {
            public Iterator<String> iterator() {
                List<String> shu = new ArrayList<String>(Arrays.asList(words));
                Collections.shuffle(shu);
                return shu.iterator();
            }
        };
    }

    //创建一个反向迭代的
    public Iterable<String> reversed() {
        return new Iterable<String>() {
            private int count = words.length - 1;//这就是最后一个元素的下标了

            public Iterator<String> iterator() {
                return new Iterator<String>() {
                    public boolean hasNext() {
                        return count > -1;
                    }

                    public String next() {
                        return words[count--];
                    }

                    public void remove() {
                        throw new UnsupportedOperationException();
                    }
                };
            }
        };
    }

    public static void main(String[] args) {
        MultiIterableClass mic = new MultiIterableClass();

        //这个类有三个迭代器

        //这个是正向遍历
        System.out.println("正向遍历");
        for (String str : mic) {
            System.out.print(str + " ");
        }
        System.out.println();

        //这个是反向遍历
        System.out.println("反向遍历");
        for (String str : mic.reversed()) {
            System.out.print(str + " ");
        }
        System.out.println();

        //这是任意方向遍历
        System.out.println("任意方向遍历");
        for (String str : mic.randomized()) {
            System.out.print(str + " ");
        }

    }
}
