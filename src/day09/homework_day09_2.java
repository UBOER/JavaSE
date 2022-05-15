package day09;

public class homework_day09_2 {
    public static void main(String[] args) {
        /**
         * 9x9乘法表
         */
        for (int i = 1; i <= 9; i++) {//外循环，控制乘号后面那个数，控制有多少列
            for (int j = 1; j <= i; j++) {//内循环，不能超过外循环的数，控制一行有多少个
                System.out.print(j+"x"+i+"="+i*j+"\t");
            }
            System.out.println();//执行完一行 换个行
        }
    }
}
