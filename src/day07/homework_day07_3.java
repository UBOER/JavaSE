package day07;

import java.util.Scanner;

public class homework_day07_3 {
    public static void main(String[] args) {
        /**
         * 请输入消费金额：500
         * 是否参加优惠换购活动：
         * 1：满50元：加2元换购百事可乐饮料1罐
         * 2：满100元，加3元换购500ml可乐一瓶
         * 3：满100元，加10元换购5公斤面粉
         * 4：满200元：加10元可换购1个苏泊尔炒菜锅
         * 5：满200元，加20元可换购欧菜雅爽肤水一瓶
         * 0：不换购
         * 请选择：4
         *
         * 本次消费总金额：510.0
         * 成功换购：1个苏泊尔炒菜锅。
         */
        Scanner sc = new Scanner(System.in);//输入模块
        System.out.print("请输入消费金额：");
        int firstMoney = sc.nextInt();
        /**
         * 是否参加换购活动了。
         */
        System.out.println("* 1：满50元：加2元换购百事可乐饮料1罐");
        System.out.println("* 2：满100元，加3元换购500ml可乐一瓶");
        System.out.println("* 3：满100元，加10元换购5公斤面粉");
        System.out.println("* 4：满200元：加10元可换购1个苏泊尔炒菜锅");
        System.out.println("* 5：满200元，加20元可换购欧菜雅爽肤水一瓶");
        System.out.println("* 0：不换购");
        System.out.print("请输入：");
        int num;//客户输入
        num = sc.nextInt();
        double totalMoney;//总金额（加上换购的

        switch (num) {
            case 1://选择第一种换购
                if (firstMoney >= 50) {
                    totalMoney = firstMoney + 2;
                    System.out.println("本次消费总金额：" + totalMoney);
                    System.out.println("成功换购百事可乐饮料1罐");
                } /*满足换购金额才行*/ else {
                    System.out.println("对不起，您的消费金额未达到！");
                }
                break;


            case 2://选择第二种换购
                if (firstMoney >= 100) {
                    totalMoney = firstMoney + 3;
                    System.out.println("本次消费总金额：" + totalMoney);
                    System.out.println("成功换购500ML百事可乐饮料1瓶");
                } /*需要满足换购金额*/else {
                    System.out.println("对不起，您的消费金额未达到！");
                }
                break;

            case 3://第三种换购
                if (firstMoney >= 100) {
                    totalMoney = firstMoney + 10;
                    System.out.println("本次消费总金额：" + totalMoney);
                    System.out.println("成功换购5公斤面粉");
                } /*需要满足换购金额*/else {
                    System.out.println("对不起，您的消费金额未达到！");
                }
                break;

            case 4://第四种换购
                if (firstMoney >= 200) {
                    totalMoney = firstMoney + 10;
                    System.out.println("本次消费总金额：" + totalMoney);
                    System.out.println("成功换购苏泊尔炒菜锅");
                } /*需要满足换购金额*/else {
                    System.out.println("对不起，您的消费金额未达到！");
                }
                break;

            case 5://第五种换购
                if (firstMoney >= 200) {
                    totalMoney = firstMoney + 20;
                    System.out.println("本次消费总金额：" + totalMoney);
                    System.out.println("成功换购欧莱雅爽肤水一瓶");
                } /*需要满足换购金额*/else {
                    System.out.println("对不起，您的消费金额未达到！");
                }
                break;

            case 0://不换购
                System.out.println("本次消费总金额：" + firstMoney);
                break;
        }









    }
}
