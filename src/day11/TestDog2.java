package day11;

public class TestDog2 {
    public static void main(String[] args) {
    Dog dog2 = new Dog();//实例化对象
 /*       //调用了方法
        dog2.getNum();//输出第一次

        //调用了方法，并接受到方法所返回的结果
      int num = dog2.getNum();//输出第二次

       System.out.println(num);

        System.out.println(dog2.getNum());//输出第三次
        System.out.println("结束吧");
*/

        /**
         * 调用getStr2，有一个参数方法
         */
      /*  String str2;
       str2= dog2.getStr2("给你一个字符串");
        System.out.println(str2);
        */

        /**
         * 调用getStr3
         */
        String str;
        str=   dog2.getStr3("蛋狗", "二狗");
        System.out.println(str);
    }
}
