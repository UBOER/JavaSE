package day04;

/**
 *购物小票的练习
 */
public class homework_day04_1 {
    public static void main(String[] args) {
        String tShirt;//T桖属性
        int price_tShirt;
        int count_tShirt;
        int total_tShirt;

        String shoes;//鞋的属性
        int price_Shoes;
        int count_Shoes;
        int total_Shoes;

        String racket;//网球拍的属性
        int price_Racket;
        int count_Racket;
        int total_Racket;

        tShirt="T恤";//给T恤赋值
        price_tShirt = 245;
        count_tShirt = 2;
        total_tShirt = price_tShirt * count_tShirt;

        shoes = "网球鞋";//给鞋赋值
        price_Shoes = 570;
        count_Shoes = 1;
        total_Shoes = count_Shoes * price_Shoes;

        racket = "网球拍";//给网球拍赋值
        price_Racket = 320;
        count_Racket = 1;
        total_Racket = count_Racket * price_Racket;

        //定义总金额
        double totalprice;
        totalprice = (double) ((total_Racket + total_tShirt + total_Shoes) * 0.8);

        //定义实际缴费，这里写死
        int real_pay_money=1500;

        //定义找零
        double back_customer_money;
        back_customer_money=real_pay_money-totalprice;

        //定义积分
        int point;
        point = (int )totalprice/33;//商场积分都是按照 达到多少来积分的，由题意知道这里只能为33


        /*
        接下来开始打印消费单子
         */
        System.out.println("************消费单************");
        System.out.println("购买物品\t\t单价\t\t个数\t\t金额\t");
        System.out.println(tShirt+"\t\t\t"+price_tShirt+"\t\t"+count_tShirt+"\t\t"+total_tShirt);
        System.out.println(shoes+"\t\t"+price_Shoes+"\t\t"+count_Shoes+"\t\t"+total_Shoes);
        System.out.println(racket+"\t\t"+price_Racket+"\t\t"+count_Racket+"\t\t"+total_Racket);
        System.out.println("\n");
        System.out.println("折扣：\t\t8折");
        System.out.println("消费总金额\t¥"+totalprice);
        System.out.println("实际交费\t\t¥"+real_pay_money);
        System.out.println("找钱\t\t\t¥"+back_customer_money);
        System.out.println("本次购物所获的积分是："+point);


    }
}
