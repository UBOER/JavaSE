package day08;

import java.util.Scanner;

public class homework_day08_4 {
    public static void main(String[] args) {
        /**
         *循环输入商品编号，显示对应的商品价格
         * 输入“n“结束循环
         */
        double tShirt=245.0;//定义T恤价格
        double shoes=198.3;//定义鞋价格
        double backet=583.4;//定义拍价格
        double sum=0;//增加了一个当前购物金额
        Scanner sc = new Scanner(System.in);
        int number;//客户需要购买的序号
        String continueOrno;//定义是否继续
        System.out.println("MyShopping管理系统 > 购物结算\n" +
                "****************************************");
        boolean trueOrfalse =true;
        while (trueOrfalse) {//外循环，死循环，由内部是否继续更改trueOrfalse来结束
            System.out.println("请选择购买的商品编号：");
            System.out.println("1.T 恤\t\t2.网球鞋\t\t3.网球拍");
            number = sc.nextInt();
            switch (number) {//switch循环 多个选择
                case 1:
                    System.out.println("T 恤\t\t¥" + tShirt);
                    sum = sum + tShirt;
                    break;
                case 2:
                    System.out.println("网球鞋\t\t¥" + shoes);
                    sum = sum + shoes;
                    break;
                case 3:
                    System.out.println("网球拍\t\t¥" + backet);
                    sum = sum + backet;
                    break;
            }
            System.out.println("当前消费：¥"+sum);
            System.out.println("是否继续(y/n)");
            continueOrno = sc.next();
            if (!continueOrno.equals("y")) {//字符串比较
                trueOrfalse=false;//输入的不是y就更改结束条件为false
            }

        }
        System.out.println("您一共消费：¥"+sum);
        System.out.println("程序结束");

    }
}
