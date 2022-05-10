package day06;

import java.util.Scanner;

public class homework_day06_3 {
    public static void main(String[] args) {
        System.out.println("我行我素购物管理系统 > 幸运抽奖");
        int customerNumber;

        System.out.println("请输入您的会员号百位数：");
        Scanner sc = new Scanner(System.in);
        customerNumber=sc.nextInt();
        int random = (int) (Math.random() * 10);

        if (random == customerNumber) {
            System.out.println("会员号百位数为：" + customerNumber + "的客户是幸运客户，你中奖了！" + "获精美Mp3一个。");

        } else {
            System.out.println("这次的获奖百位数为："+random);
            System.out.println("会员号百位数为：" + customerNumber+"的客户，您未中奖，谢谢您的支持！");

        }
    }

}
