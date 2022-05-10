package day06;
import java.util.Scanner;

/**
 * 购物结算
 * 嵌套 if选择结构
 *
 * 实现思路
 * 1。 外层判断是否是会员
 * 2。 内层判断是否达到相应打折要求
 */
public class homework_day06_6 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String yOrf;//判断是否是 一个字符
        double money ;
        double realpay;
        System.out.println("请输入是否是会员；是(y)/否（其他字符）");
        yOrf=sc.next();
        if (yOrf.equals("y")) {
            System.out.println("请输入购物金额");
            money=sc.nextDouble();
            if (money >= 200) {
                realpay=money*0.75;
                System.out.println("实际支付："+realpay);
            } else   {
                realpay=money*0.8;
                System.out.println("实际支付"+realpay);
            }

        } else {
            System.out.println("请输入购物金额");
            money=sc.nextDouble();
            realpay=money*0.9;
            System.out.println("实际支付"+realpay);
        }


    }
}
