package code_list_one;

public class BlankFinal {

    private final int i = 0;//这里在域的定义处赋值
    private final int j;//可以先不用赋值，但是必须要在  构造中  中进行赋值

    public BlankFinal(int j) {
        this.j = j;//这里就对final的域赋值
    }

    public static void main(String[] args) {
        BlankFinal blankFinal = new BlankFinal(1);//可以在使用前进行赋值，提供了很大的灵活性
//		blankFinal.j = 1;//同样也是不可变的
    }

}
