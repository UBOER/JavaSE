package day11;

import java.util.Scanner;

public class homework_day11_Testall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//输入模块
        System.out.println("您想获取哪个对象的信息？\t1.学生\t2.手机\t3.电脑");//输入
        int type = sc.nextInt();//接收
        switch (type) {
            case 1://student
                homework_day11_Student student = new homework_day11_Student();//实例化对象学生
                student.age = 21;
                student.dept = "人工智能";
                student.name = "刘波";
                student.sex = "男";
                student.number = "2020413321";
                student.decribe();
                student.hobby("踢足球");
                break;
            case 2://phone
                homework_day11_phone phone = new homework_day11_phone();//实例化手机
                phone.phonePrice = 8999;
                phone.phoneColor = "深空灰";
                phone.phoneMemory = 64;
                phone.phoneType = "Iphone 13 pro max";
                phone.phoneManager = "三网通";
                phone.decribe();//无参方法

                int dicount = 8;//定义折数
                double discountPrice;//定义折后价
                discountPrice=phone.getDiscount(phone.phonePrice, dicount);//折后价
                System.out.println("经过"+dicount+"折后的价格是：¥"+discountPrice);
                break;
            case 3://computer
                homework_day11_Computer computer = new homework_day11_Computer();//实例化电脑
                computer.computerPrice = 9999;
                computer.computerDisk = 256;
                computer.computerMonitor = 13;
                computer.computerMemory = 8;
                computer.computerType = "MacBookAir M1";
                computer.decribe();//电脑基本情况的无参方法
                int discount = 9;//电脑价格折扣
                double discountPirce;//定义折后价
                discountPirce=computer.getDiscount(computer.computerPrice, discount);
                System.out.println("经过"+discount+"折后的价格是：¥"+discountPirce);
                break;

        }
    }
}
