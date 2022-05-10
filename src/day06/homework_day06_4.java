package day06;

import java.util.Scanner;


/**
 * 判断会员号是4位数就可以，不需要判断输入中文，以后在前面会讲
 */
public class homework_day06_4 {
    public static void main(String[] args) {
        int vipNumber ;//四位
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入4位数检测");
        vipNumber = sc.nextInt();
        if ((vipNumber / 1000 <= 9) && (vipNumber > 0)) {
            System.out.println("会员号是4位数！");

        } else {
            System.out.println("会员号不是4位数！");

        }
    }
}
