package day04;

import java.util.Scanner;

class demo2{
    public static void main(String[] args) {
        //接收我们输入的值，这个以后开发不用
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字，int，前面先定义一个Int的变量");
        int num = sc.nextInt();
        System.out.println("接收到的int的值为" + num);

        System.out.println("请输入一个double数据");
        double num2 = sc.nextDouble();
        System.out.println("该double的值为" + num2);

        System.out.println("请输入一个字符串");
        String str = sc.next();

        System.out.println("该字符串的值为：" + str);
    }
}