package day08;

import java.util.Scanner;

public class demo05 {
    public static void main(String[] args) {
        /**
         * 李四 上午阅读教材，学习理论 下午上机操作
         * 然后老师检查，完成了就不用再阅读教材，学习理论，上机操作
         * 如果没完成 继续阅读教材 学习理论 上机操作
         *
         */
        Scanner sc = new Scanner(System.in);
        String answer;
        do {
            System.out.println("阅读教材，学习理论，上机操作");
            System.out.println("老师检查，是否写完了？y/n");
            answer = sc.next();

        } while (!answer.equals("y"));
        System.out.println("程序结束");

    }
}
