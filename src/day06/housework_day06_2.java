package day06;

import java.util.Scanner;

public class housework_day06_2 {
    //求各个位数

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个四位数：");
        int num = sc.nextInt();
        int gewei = num % 10;//求个位
        int shiwei= num/10%10;
        int baiwei=num/100%10;
        int qianwei=num/1000%10;
        System.out.println(num + "这个数的个位是；" + gewei + "，十位是：" + shiwei + "，百位是：" + baiwei + "，千位是：" + qianwei);

    }
}
