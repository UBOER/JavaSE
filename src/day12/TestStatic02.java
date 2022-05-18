package day12;

public class TestStatic02 {
    public static void main(String[] args) {
        StaticDemo02  s = new StaticDemo02();//调用构造函数 i=1 b=1
        StaticDemo02  s2 = new StaticDemo02();//调用构造函数i=1 b=2
        StaticDemo02  s3= new StaticDemo02();//调用构造函数 i=1 b=3
/**
 * 调用三次
 *
 */
        System.out.println(s.i);//1  因为每一次构造都会置i为0
        System.out.println(s2.i);//1
        System.out.println(s3.i);//1

        System.out.println(s.b); //3  因为静态成员变量。第一次为0 以后 后面都不会执行int b=0
        System.out.println(s2.b);//3
        System.out.println(s3.b);//3

    }
}
