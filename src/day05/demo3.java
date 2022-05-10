package day05;

public class demo3 {
    public static void main(String[] args) {
        /**
         * 正常情况下
         * 2/4=0 应该是整数
         * 0*100不还是0.0
         * 以后开发也不会这样写，是在学思路
         * (double)2强制转换
         */
        double num=2/4.0*100;
        System.out.println(num);//50.0 先被转成double类
        //那接下来这个呢？

        double num2=2/4*100;//2/4的时候已经为0 了 int是可以转换double 但2/4为0

        System.out.println(num2);

        //怎么修改呢？
        double num3=(double)2/3;//先把2转化为double 再进行运算
        System.out.println(num3);


        //接下来这个算数对吗？
        System.out.println(9999999*9999999);
        //很明显有问题，出现错误了。

        
    }
}
