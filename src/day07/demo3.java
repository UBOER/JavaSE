package day07;

public class demo3 {
    public static void main(String[] args) {
        /**
         * 韩嫣参加计算机编程大赛
         * 如果获得第一名，将参加麻省理工大学组织的1个月夏令营
         * 如果获得第二名，将奖励惠普笔记本电脑一部
         * 如果获得第三名，将奖励移动硬盘一个
         * 否则，不给任何奖励
         *
         * 运用swich 完成
         */

        int num=3;
        switch (num) {
            case 1:
                System.out.println("奖励一个月夏令营");
                break;
            case 2:
                System.out.println("奖励惠普笔记本电脑一部");
                break;

            case 3:
                System.out.println("奖励移动硬盘");
                break;
            default:
                System.out.println("啥都没有");
               

        }

    }
}
