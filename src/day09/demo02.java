package day09;

import java.util.Scanner;

/**
 * 循环输入某同学结业考试的五门课程的成绩，并计算平均分
 */
public class demo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //循环输入王二同学，计算机结业考试的5门课成绩，并计算平均分
        double count = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.println("请输入王二同学的第" + i + "门成绩");
            //接受用户成绩的输入
            double score = sc.nextDouble();
            //每次把分数加上
            count = count + score;
        }
        System.out.println("王二的总分是：" + count);
        System.out.println("王二的平均分是："+count/5);

    }
}
