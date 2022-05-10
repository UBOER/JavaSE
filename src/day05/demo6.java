package day05;

import jdk.swing.interop.SwingInterOpUtils;

public class demo6 {
    public static void main(String[] args) {
        //张三的JavaSE 成绩 如果98 分以上 老师奖励一台笔记本电脑
        int javaSE = 98;
        System.out.println(javaSE > 98);
        /**

        if(true){//只要条件是true 则进来
            System.out.println("进来了1"); }
        if (false) {
            System.out.println("请问能不能进来？2");
        }//不能
         */
        // 以后如果使用 if 不理解的时候，就把里面的条件，复制出来输出
        System.out.println(javaSE>98);

        /*
           if(javaSE>98){//这种不包括98 }>=才包括
         */


    }
}
