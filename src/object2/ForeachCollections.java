package object2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

//这是一个迭代器，会进行遍历
public class ForeachCollections {
    public static void main(String[] args) {
        Collection<String> cs = new ArrayList<String>();
        Collections.addAll(cs, "A,B,C,D,E,F,G".split(","));
        for (String s : cs) {
            System.out.print(s + " ");
        }
    }
}

/*
 * cs是一个Collection，那为什么Collection可以与foreach一起工作?
 * 	因为在javaSE5.0时，引入了新的接口Iterable，该接口有一个能产生Iterator的iterator()方法，并且Iterable接口被foreach用来在序列中移动。所以可以遍历
 * 	因此如果你创建了任何实现Iterable的类，都可以将它应用于foreach语句中(注意不是Iterator对象)
 */
class ObejctA3 implements Iterable<String> {
    protected String[] words = "A,B,C,D,E,F,G".split(",");

    public Iterator iterator() {
        return new Iterator<String>() {
            private int count = 0;

            public boolean hasNext() {
                return count < words.length;
            }

            public String next() {
                return words[count++];
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        ObejctA3 obejctA3 = new ObejctA3();
        for (String s : obejctA3) {
            System.out.print(s + " ");
        }
    }
}

//反向进行遍历
class ObejctA4<T> implements Iterable<T> {
    protected T[] t;

    public ObejctA4(T[] t) {
        this.t = t;
    }

    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int count = t.length - 1;//这是最后一个数组的下标

            public boolean hasNext() {
                return count != -1;
            }

            public T next() {
                return t[count--];//先返回值，再对本身进行减一
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7};
        ObejctA4 obejctA4 = new ObejctA4(arr);
        for (Object o : obejctA4) {
            System.out.print(o + " ");
        }
    }
}

/*	foreach可以应用在任何和Iterable上(是Iterable对象)
 * 但是这种反向只是覆盖原来的iterator()方法，这样的话正向遍历就没有了。如果你想一个类中有多个迭代器的话(比如正向和反向都有的话)
 * 	一种解决方案就是适配器方法的惯用法。适配器 部分来自设计模式。当你有一个接口并需要另一个接口时，编写适配器就可以解决问题。
 * 	·在这里可以在有向前迭代器的基础上，再添加一个向后的迭代器，因此你不能使用覆盖，而是再添加一个能够产生Iterable对象的方法(与原来接口Iterable的iterator方法不冲突)
 */
class ObejctA5 extends ObejctA4 {

    public ObejctA5(Object[] t) {
        super(t);
    }

    public Iterable reversed() {     //泛型是为了保证类型转化是不会出错的。是只允许当前的类型调用
        return new Iterable() {
            ;

            public Iterator iterator() {
                return new Iterator() {
                    private int count = t.length - 1;

                    public boolean hasNext() {
                        return count != -1;
                    }

                    public Object next() {
                        return t[count--];
                    }

                    public void remove() {
                        throw new UnsupportedOperationException();
                    }
                };
            }
        };
    }

    //还可以创建一个可以正向遍历的
    public Iterable ordered() {
        return new Iterable() {
            public Iterator iterator() {
                return new Iterator() {
                    private int count = 0;

                    public boolean hasNext() {
                        return count < t.length;
                    }

                    public Object next() {
                        return t[count++];
                    }

                    public void remove() {
                        throw new UnsupportedOperationException();
                    }
                };
            }
        };
    }

    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        ObejctA5 obejctA5 = new ObejctA5(arr);
        //两个方法都可以进行方向遍历
        for (Object o : obejctA5) {
            System.out.print(o);
        }
        System.out.println();
        for (Object o : obejctA5.reversed()) {
            System.out.print(o);
        }
        System.out.println();
        //还可以创建一个正向遍历的
        for (Object o : obejctA5.ordered()) {
            System.out.print(o);
        }
    }
}
























