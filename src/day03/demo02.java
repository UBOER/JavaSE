package day03;

import jdk.swing.interop.SwingInterOpUtils;

class demo02{
    public static void main(String[] args) {
        //以后的开发中输出一般不用
        System.out.println(888);
        /**
         * 定义变量，声明=赋值；
         *int 变量类型 int 只能存整数
         * num变量名
         * 888值
         *
         * 每一行代码写完必须分号结束
         *
         */
        int num=888;
        System.out.println(num);

        int num2;//定义了变量 并没有赋值
        int num3 ;
        num3=999;
        System.out.println(num3);
        num3=1000;
        System.out.println(num3);


        System.out.println("*****double 存小数");
        //成绩 有小数位

        double score=99.99;
        System.out.println(score);


        System.out.println("char存一个字符");


        char sex='男';//用单引号

        System.out.println("存布尔类型, 只能存 false 代表假 true 代表真");

        boolean b=false;
        System.out.println(b);


        String str="跟着曾老师学java，高薪就业";

        System.out.println( str);


        System.out.println("链接输出信息");
        System.out.println("aaa"+"bbb"+"ccc");

        String str2="aaa";
        String str3="bbb";
        String str4="ccc";

        System.out.println(str2+str3+str4);
        System.out.println("dd"+"vv"+str2+str4+1);
    }
    //第三遍

}