package day11;

import java.util.Scanner;

public class TestDog3 {
    public static void main(String[] args) {
        System.out.println("欢迎来到XXX宠物世界");
        Scanner sc = new Scanner(System.in);
        System.out.println("请给宠物取一个名吧");
        String name = sc.next();
        System.out.println("请选择需要领养的类型:1.狗狗 \t 2:企鹅");
        int type = sc.nextInt();
        if (type == 1) {
            System.out.println("领养狗狗");
            //1.创建狗狗对象
            Dog dog = new Dog();
            //2.给dog赋值
            dog.name = name;
            //3.调用方法
            dog.print();

        } else if (type == 2) {
            System.out.println("领养企鹅");
        } else {
            System.out.println("输入有误");
        }


    }
}
