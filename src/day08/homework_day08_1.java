package day08;

import java.util.Scanner;

public class homework_day08_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int insert = sc.nextInt();
        if (insert == 1) {//输入1 则进行循环打印试卷
            int turn = 1;//初始值为1
            while (turn <= 50) {
                System.out.println("打印第" + turn + "张卷子");
                turn++;//turn每次+1，+50次

            }

        } else {//否则就是跑操场
            int turn = 1;//初始值为1
            while (turn<=10) {//turn>10停止
                System.out.println("跑了第" + turn + "圈");
                turn++;//同上
            }
        }

    }
}
