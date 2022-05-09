package day04;
/**
 * 学写了：如何比较两个相同数据类型的值，其中字符串比较特殊，以后要注意字符串比较尽量用str.equals(str2);
 */

import java.util.Scanner;

public class demo8 {
    public static void main(String[] args) {
        //只是数字判断 是否相等 必须要用== 如果是字符串可以直接使用 equals
        String name="刘波";
        String name2 = "ubo";

        System.out.println( name.equals(name2));

        /**
         * 在讲后面OOP的时候会 画内存图，就可以懂了
         * 记住就好，以后开发只要是字符串比较直接用equals，以后会经常写
         */

        Scanner sc=new Scanner(System.in);
        String str="aa";//定义String类型
        System.out.println("请输入我们的值");
        String str2=sc.next();//定义输入的str2类型

        System.out.println(str.equals(str2));//判断str与str2的值相同与否
        System.out.println("aa".equals(str));//true



    }

}
