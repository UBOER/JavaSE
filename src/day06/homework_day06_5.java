package day06;

import java.util.Scanner;

/**
 * 输入小明的考试成绩，显示所获奖励
 * 成绩==100分，爸爸给他买辆车
 * 100分>成绩>=90分，妈妈给他买MP4
 * 90分>成绩>=60分，妈妈给他买本参考书
 * 成绩<60分，什么都不买
 */
public class homework_day06_5 {
    public static void main(String[] args) {
        int score;//成绩
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入小明的考试成绩！");
        score = sc.nextInt();

        if (score == 100) {
            System.out.println("爸爸给他买辆车");
        } else if (score >= 60 && score < 100) {
            System.out.println("妈妈给他买MP4");
        } else if (score >= 60 && score < 90) {
            System.out.println("妈妈给他买本参考书");
        } else if (score>100) {
            System.out.println("考试成绩输入错误，请重新输入！(0-100)");
        } else {
            System.out.println("什么都不买");
        }

    }

}
