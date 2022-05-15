package day09;

import java.util.Scanner;

public class homework_day09_3 {
    public static void main(String[] args) {
        /**
         * 计算顾客比例
         * 需求说明
         * 商场对顾客的年龄层次进行调查
         * 计算各年龄层次的顾客比例
         * 请输入第1位顾客的年龄：23
         * 请输入第2位顾客的年龄：34
         * 请输入第3位顾客的年龄：45
         * 请输入第4位顾客的年龄：25
         * 请输入第5位顾客的年龄：36
         * 请输入第6位顾客的年龄：24
         * 请输入第7位顾客的年龄：21
         * 请输入第8位顾客的年龄：28
         * 请输入第9位顾客的年龄：37
         * 请输入第10位顾客的年龄：3
         * 30岁以下的比例是：60.0%
         * 30岁以上的比例是：40.0%
         */

        Scanner sc = new Scanner(System.in);//输入
        float age;//定义年龄
        float bigger30=0;//大于三十岁及三十岁的人个数
        float lower30=0;//小于三十岁的人的个数
        float biggerRate;//大于30的比率
        float lowerRate;//小于30的比率
        for (int i = 1; i < 11; i++) {
            System.out.print("请输入第"+i+"位顾客的年龄：");
            age = sc.nextInt();
            if (age >= 30) {
                bigger30 += 1;//>30 人数+1
            } else {
                lower30 += 1;//<30 +1
            }
        }
        biggerRate = bigger30 / 10;
        lowerRate=lower30/10;
        System.out.println("30岁以下的比例是：" + lowerRate*100+"%");
        System.out.println("30岁以上的比例是：" + biggerRate*100+"%");


    }
}
