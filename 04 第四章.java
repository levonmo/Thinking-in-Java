public class 第四章 {

    /*
     * 第四章：控制流程
     * 	·迭代：
     * 	  ·while，do-while和for用来控制循环，有时将它们划分为迭代语句。语句会重复执行，直到起控制作用的布尔表达式等到"假"的结果为止。
     * 	·java有多个关键字表示无条件分支
     * 	  ·return用途有两个方面
     * 	  	·指定一个方法返回的值
     * 	  	·会导致当前方法的退出
     * 	  ·break和continue：在任何的迭代语句的主体部分，都可以使用break和continue控制循环的流程。
     * 		其中，break用于强行退出循环，而continue则停止执行当前的迭代(停止执行continue语句下面的代码)，然后退回循环起始处，开始下一次迭代
     *    ·goto：java中没有goto。然而，java也能完成一些类似于跳转(goto)的方法，结合break和continue结合使用。
     *    	标签是后面跟有冒号的标识符，就像下面这样  labell1:
     *    	在java中，标签器作用的唯一的地方刚好是在迭代语句之前。"刚好之前"的意思表明，在标签和迭代之间置入任何语句都不好。
     *  	而在迭代之前设置标签的唯一理由是：我们希望在其中嵌套另一个迭代或者开关。这是由于break和continue关键字通常只中断当前循环，随标签一起使用，它们就会中断循环，直到标签的地方
     *  	例如：
     *  		labell1：
     *  		outer-iteration{
     *  			inner-iteration{
     *  				break;//中断内部循环，跳到外部循环
     *  				continue;//使执行点移到内部迭代的起始处
     *  				continue labell1;//同时中断内部迭代和外部迭代，直接转到labell1处，随后，它实际上上市继续迭代的过程，从外部迭代开始
     *  				break labell1;//同时中断内部和外部迭代，直接转到labell1处，但不重新进入迭代，实际上是中止两个迭代
     *  			}
     *  		}
     */

    public static void main(String[] args) {
        labellWhile();

        /*
         * switch(只能支持整数)
         * 	·switch有时被划为一种选择语言，根据整数表达式的值，switch语句可以从一系列代码中选出一段去执行。格式如下
         * 		 switch(integral-selector) {//integral-selector这个表达式产生的只能是整数
         * 			case integral-value1 : statement; break;
         * 			case integral-value1 : statement; break;
         * 			case integral-value1 : statement; break;
         *			//...
         *			default: statement;
         * 		}
         * 	·其中integral-selector(只支持整数)是一个能产生整数的表达式，switch将表达式的结果与每个integral-value进行比较。相符，执行对应的语句，没有相符，执行default语句。
         * 	  case语句中的break是可选的，如果省略break，会继续执行后面的case语句，知道遇到break为止。
         * 	·注意：default后面不用显示配置break(显示配置也可以)，默认会break。
         */
    }

    private static void labellWhile() {
            int i = 0;
            outer:
            while (true) {
                System.out.println("Outer while loop");
                while (true) {
                    i++;
                    System.out.println("i=" + i);
                    if (i == 1) {
                        System.out.println("continue");
                        continue;//跳到内部循环的头部(即从i++开始执行)
                    }
                    if (i == 3) {
                        System.out.println("continue outer");
                        continue outer;//跳转到outer的位置。重新进入外部循环
                    }
                    if (i == 5) {
                        System.out.println("break");
                        break;//跳出内部循环，从System.out.println("Outer while loop");开始执行，
                    }
                    if (i == 7) {
                        System.out.println("break outer");
                        break outer;//调出到outer标签(即外部循环)，不再进入外部循环
                    }
                }
                /*
                 *	·一般的 continue会退回最内层循环的开头(顶部)，并继续执行
                 *	·带标签的continue会到达标签的位置，并重新进入紧接在那个标签后面的循环
                 *	·一般的break会中断并跳出当前循环
                 *	·带标签的break会中断并跳出标签所指的循环，并不会重新进入循环
                 */
            }
    }

}
