package day09;

public class demo01 {
    public static void main(String[] args) {
        /**
         * 将for 循环之前 先讲一下while
         * while 可以写死循环，for可以吗？
         */
/*

        while (true) {
            System.out.println("可以写死循环，for可以吗？");
        }
*/

       /* for (; true; ) {//不能里面只写true，第一个分号后可以为true
            System.out.println("这是死循环");

        }*/


       /* boolean b = false;
        for (; b; ) {//写false 会报错 但以布尔变量写不会
            System.out.println("这是死循环");

        }*/

        /**
         * while 循环一般来说是不知道循环的次数，而for循环一般知道循环的次数
         */

        for (int i = 1; i <= 5; i++) {//这就是标准 固定的格式
          //for( 参数初始化;条件判断 ;更新循环变量)
            System.out.println("抄写代码第" + i + "遍");
        }



    }
}
