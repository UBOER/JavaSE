package day04;

public class demo4 {
    public static void main(String[] args) {
        //求商  取余数
        // %取余数

        int num=5%2;
        System.out.println(num);
        System.out.println(6%3);
        System.out.println(11%2);



        //48天 等于？周 剩余？天
        int day=48;

        int week=day/7;//取商 求周数

        int leftday=day%7;//取余 求剩余天数

        System.out.println(day+"天等于"+week+"周剩余"+leftday+"天");
    }

}
