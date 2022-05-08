package day03;

public class homework_day03_4<day> {
    /**
     * 给一个数46天    求  等于？周   剩余 ?多少天
     */

    public static void main(String[] args) {


        int num = 46;
        int week;//定义变量int 周数
        int day;//定义变量 int 剩余天数
        week=num/7;//  "/"得到是商
        day=num%7; //得到的是余数
        System.out.println("等于第"+week+"周" +
                "剩余"+day+"天");
    }
}
