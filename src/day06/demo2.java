package day06;

import java.util.Scanner;

/**
 * 这个demo主要还是巩固上期学的
 * equals 比较字符串的值
 * == 比较数字得值
 */
public class demo2 {
    public static void main(String[] args) {
        String str1 = "字符串";
        System.out.println("请输入：字符串");
        Scanner sc = new Scanner(System.in);
        String str2 = sc.next();//这一步是输入一个字符串，sc.next()字符串 nextInt()数字，nextDouble()double类型

        if (str1 == str2) {
            System.out.println("出现这段话就代表str1等于str2");
        } else {
            System.out.println("不相等！ 为什么呢？");
        }
        /**
         * 等OOP学了 就知道什么是地址值了
         * 目前只需要记住，以后公司开发字符串都不这样写，
         */
        //比较字符串是：
        if ("字符串".equals("字符串")) {
            System.out.println("看见没 进入了！");
        }


    }



}
