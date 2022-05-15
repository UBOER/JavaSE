package day09;

public class demo04 {
    public static void main(String[] args) {
        /**
         * continue的用法，跳出本次循环，后续不执行
         * break是跳出当前整个循环，如果外面还有一个循环，不会跳出外面的循环。
         */
  /*      for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;

            }
            System.out.println(i);
        }*/
        int num = 1;
        while (num <= 5) {
            if (num == 3) {
                System.out.println("死循环");
                continue;
            }

            num++;
        }
    }
}
