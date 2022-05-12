package day07;

/**
 * 韩嫣参加计算机编程大赛
 * 如果获得第一名，将参加麻省理工大学组织的1个月夏令营
 * 如果获得第二名，将奖励惠普笔记本电脑一部
 * 如果获得第三名，将奖励移动硬盘一个
 * 否则，不给任何奖励
 *
 * 运用if else 也可以完成
 */

public class demo02 {
    public static void main(String[] args) {
        int num=1;
        if (num == 1) {//获得一等奖则奖励一个月的夏令营
            System.out.println("奖励一个月的夏令营");
        } else if (num == 2) {
            System.out.println("奖励电脑一台");
        } else if (num == 3) {
            System.out.println("奖励移动硬盘一个");
        } else {
            System.out.println("没有任何奖励！");
        }

    }
}
