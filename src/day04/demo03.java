package day04;

import java.util.Scanner;

/**
 * 学习了：Scanner输入时 不同类型变量的方法
 */
public class demo03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("请输入好人的JavaSe 成绩");
        double javeSe=sc.nextDouble();

        System.out.println("请输入好人的JavaWeb的成绩");
        double javaWeb=sc.nextDouble();


        System.out.println("请输入好人的mysql成绩");
        double mySql=sc.nextDouble();


        System.out.println("================");
        System.out.println("\tJavaSe \t JavaWeb \t mysal");
        System.out.println();
    }
}
