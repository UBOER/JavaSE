package day04;

/**
 * 类型转换
 * 自动类型转换：就是把小的赋值给大的
 * 强制类型转换：就是为了讲后面的课程
 *  今天做的100%不用 以后开发只会用到一种
 *  后面开发的时候也会讲
 *  讲这个是为了讲后面的OOP 类型转换，讲多态的时候会讲
 *
 */
public class demo6 {
    public static void main(String[] args) {
        //int 类型（4个字节）比 double 类型（八个字节）小
        int num=100;
        //小的可以直接转给大的，自动就转过去了
        double num2=num;//可以看到并不报错
        //以后讲OOP的时候100%会讲，转换。

        //下面这个例子就不能转换，为什么？
        //double num3=100;
        //int num4= num3;
        //可以看到会报错，原 因是因为double8个字节，int4个字节，大容器无法转到小容器

        //开发的时候不会这样转，如果一定需要呢？ 那么也可以进行强制转换，但会损失精度
        double num3=100.99;
        int num4= (int)num3;
        System.out.println("num3实际的大小是"+num3);

        System.out.println("强制转换后的大小是"+num4);

        //接下来这些 能看懂就看 看不懂不用管
        String strNum="1423";
        //把字符串转为了int Integer 是int的包装类型
        Integer num444=Integer.parseInt(strNum);//Integer.parseInt 是一个函数，可以解析字符串
        System.out.println(num444);


        char c='c';
        String str5= String.valueOf(c);//String.valueOf()函数 返回的是字符串
        System.out.println(str5);





    }
}
