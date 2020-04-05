package code_list_two;

public interface Months {
    int
            JAN = 1, FEB = 2, MAR = 3,
            APR = 4, MAY = 5, JUNN = 6,
            JUL = 7, AUG = 8, SEP = 9,
            OCT = 10, NOV = 11, DEC = 12;
    /*
     * 在javaSE5.0之前(就是枚举类型还没有出现之前)，可能会使用这种来创建常量的(这里的域都是自动的被定义为static和final)，
     * 	在阅读旧的代码时，可能会遇到这种旧的习惯用法
     * 在javaSE5.0之后，就有了强大的enum关键字，使用接口来组群常量已经显得没什么意义了
     */
}
