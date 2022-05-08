package day04;

import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        //接受我们输入的值，这个以后开发过程中不用，只是目前学习，需要使用到。
        //这一个等到学了oop自然懂了

        Scanner  sc=new Scanner(System.in);

        System.out.println("请输入一个数字，int类型，前面先定义一个int的变量");
        int num=sc.nextInt();


        System.out.println("接受到的int值为："+num);

        System.out.println("请输入一个double类型数据");

        double num2= sc.nextDouble();

        System.out.println("接受到的double的值为"+num2);


        System.out.println("请输入一个字符串");
        String str=sc.next();

    }
}
