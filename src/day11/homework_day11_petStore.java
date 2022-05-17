package day11;

import java.util.Scanner;

public class homework_day11_petStore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//输入模块
        System.out.println("欢迎您来到宠物店！");
        System.out.println("请输入您想要领养的宠物的名字：");
        String name = sc.next();//输入宠物姓名
        System.out.println("您想要领养的宠物类型是：1.狗子\t\t2.企鹅子");
        int type = sc.nextInt();//选择领养类型
        if (type == 1) {
            System.out.println("请输入狗子的性别：1.狗哥\t\t2.狗妹");
            String sex = sc.next();
            if (sex.equals("1")) {
                sex = "哥";
            } else if (sex.equals("2")) {
                sex = "妹";
            } else {
                sex = "未知性别=_=";
            }
            homework_day11_Dog dog = new homework_day11_Dog();//实例化狗类
            dog.sex = sex;//更新性别
            dog.name = name;//更新姓名
            dog.print();
        } else if (type == 2) {
            System.out.println("请输入企鹅子的性别：1.Q仔\t\t2.Q妹");
            String sex = sc.next();
            if (sex.equals("1")) {
                sex = "Q仔";
            } else if (sex.equals("2")) {
                sex = "Q妹";
            } else {
                sex = "未知性别=_=";
            }homework_day11_Penguin penguin = new homework_day11_Penguin();//实例化企鹅类
            penguin.name = name;//更新姓名
            penguin.sex = sex;//更新性别
            penguin.print();//print方法输出
        } else {
            System.out.println("您输入的选择有误！");
        }
    }
}
