package day06;
/**
 * 录入会员信息
 * 判断录入的会员号是否合法
 */

import java.util.Scanner;


/**
 * 判断会员号是4位数就可以，不需要判断输入中文，以后在前面会讲
 */
public class homework_day06_4 {
    public static void main(String[] args) {
        int vipNumber ;//四位会员号
        String  custmerBirthday;//会员生日
        int vipPoint;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入会员号(<4位整数>)：");
        vipNumber = sc.nextInt();
        if ((vipNumber / 1000 <= 9) && (vipNumber > 0)) {
            System.out.println("请输入会员生日(月/日<用两位数表示>)：");
            custmerBirthday=sc.next();

            System.out.println("请输入积分：");
            vipPoint=sc.nextInt();

            System.out.println("已录入的会员信息是：");
            System.out.println(vipNumber+"\t\t"+custmerBirthday+"\t\t"+vipPoint);
        } else {
            System.out.println("会员号不是4位数！请重新输入！");


        }
    }
}
