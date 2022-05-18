package day12;

public class StaticDemo02 {
    /*
  这就是普通属性，成员变量
     */
    public int i = 0;

    //这是静态属性
    public static int b = 0;

    //通过构造方法进行业务操作
    public  StaticDemo02() {
        i++;//i=i+1
        b++;
    }

}
