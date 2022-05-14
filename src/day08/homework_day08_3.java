package day08;

import java.util.Scanner;

public class homework_day08_3 {
    public static void main(String[] args) {
        /**
         * 编程实现：计算100以内（包括100）的偶数之和
         * 设置断点并调试程序，观察每一次循环中变量值的变化
         */

        int sum;//定义数和
        sum = 0;//初始化数和
        int turn;//定义循环次数
        turn = 0;//初始化
        int number;//2*n 的值 方便调试的时候看到 turn对应的偶数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入偶数和/(奇数和)");
        String in = sc.next();
        if (in.equals("偶数和")) {//因为turn是从0开始，所以一共有101个数 偶数51 奇数50

            while (true) {
                number = 2 * turn;
                sum = number + sum;
                turn++;//2*turn<=100 等价于  (turn <= 50)
                if (!(turn<=50)) {// !(turn <=50) 等价于turn>50
    //可以理解为当turn不小于50时，当turn=50时其实经历了51次了
                    break;
                }
            }
            System.out.println("0-100的偶数和是:" + sum);
        } else {
            while (true) {
                number = 2 * turn + 1;
                turn++;
                sum = sum + number;
                if (!(turn <= 49)) {//奇数50个，所以当turn 不小于等于49时 实际上49的时候已经50次了

                    break;
                }
            }
            System.out.println("0-100的奇数和为：" + sum);

        }

    }
}
