package day10;

public class demo01 {
    public static void main(String[] args) {
        /**
         * 创建数组的三种方式，以后在面试过程中可能会有一些面试官直接让我们定义数组的几种方式
         */
        /**
         * 第一种 一定不能少了[]
         */
        int[] arr1 = {1, 2,   3, 4};//定义同时赋值


        /**
         * 第二种，定义不赋值
         */
        int[] arr2= new int[5];//这样定义 默认是给arr2五个空间的位置
        System.out.println(arr2[0]);//初始化值都是0 int类型
        System.out.println(arr2[1]);//初始化值都是0 int类型
        String[] str2 = new String[5];
        System.out.println(str2[0]);//初始化值都是0 String类型
        System.out.println(str2[1]);//初始化值都是0 String类型

        /**
         * 第三种方式 这种一般没人用
         */

        String[] arr3=new String[]{"a","b","c","d"};
    }
}
