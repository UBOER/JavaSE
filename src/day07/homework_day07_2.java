package day07;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * 从登陆菜单跳转到主菜单
 * switch 选择结构
 * 实现思路
 * 1。 使用数字标识菜单号
 * 2。 获取用户输入的数字
 * 3。 执行相应的操作
 */
public class homework_day07_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//输入
        //先构建登录菜单页面：
        System.out.println("\t\t\t*****登录菜单*****");
        System.out.println("\t\t\t1.登陆系统");
        System.out.println("\t\t\t2.退出");

        int num=sc.nextInt();//用户输入选择

        if (num == 1) {
            //当用户输入等于1时，进入登录系统页面
            //构建登录系统页面 即主菜单
            System.out.println("\t\t\t*****主菜单*****");
            System.out.println("\t\t\t1.客户信息管理");
            System.out.println("\t\t\t2.购物结算");
            System.out.println("\t\t\t3.真情回馈");
            System.out.println("\t\t\t4.注销");
            num = sc.nextInt();//用户输入


            //这里是等值判断，可以用switch 使用
            switch (num) {
                case 1://进入 客户信息管理 页面
                    //构建客户信息管理页面信息
                    System.out.println("\t\t\t*****主菜单*****");
                    System.out.println("\t\t\t1.显示所有客户信息");
                    System.out.println("\t\t\t2.添加客户信息");
                    System.out.println("\t\t\t3.修改客户信息");
                    System.out.println("\t\t\t4.查询客户信息");
                    //用户输入来判断 进入所示页面 写到这里就可以了，接下来的差不多
                    System.out.println("\t\t\t请输入：");
                    num = sc.nextInt();//客户输入 客户信息判断的需求
                    //无论输入什么 默认退出了
                    break;


                case 2://在主菜单输入2时，进入购物结算页面:
                    //构建购物结算页面信息
                    double totalMoney;//总消费
                    double realPay;//付款金额
                    DecimalFormat df = new DecimalFormat("0.00");//保留两位小数 String
                    totalMoney = 300 + Math.random() * (1300 - 300);
                    //利用随机数生成300-1300的数


                    System.out.println("\t\t\t*****购物结算*****");
                    System.out.println("\t\t\t*您消费的金额是" + df.format(totalMoney));
                    System.out.println("\n" + "\t\t\t*请输入您实付金额：");
                    realPay = sc.nextDouble();//输入的实付金额
                    System.out.println("\t\t\t*购物已经结算：\n\t\t\t找您" + df.format(realPay - totalMoney) + "\n\t\t\t欢迎下次光临！");

                    break;//case2 w购物结算页面 结束 记得break


                case 3:// 主菜单输入3 进入真情回馈环节。
                    System.out.println("\t\t\t*****真情回馈*****");
                    System.out.println("\t\t\t1.幸运大放送");
                    System.out.println("\t\t\t2.幸运抽奖");
                    System.out.println("\t\t\t3.生日问候");
                    //详细功能就不做了写一下 switch 判断 果都是break
                    System.out.println("请输入");
                    num = sc.nextInt();
                    switch (num) {//各个返回都是break
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;//这里就退出内层判断了
                    }
                    break;//这里就是退出真情回馈环节

                default:
                    break;//这里不仅输入4,输入其他的也默认退出
            }


        }//最外层 if 结束的标志

        //最外层 是用if else 写的，所以别忘了登录菜单还有个退出功能
        else {
            System.out.println("谢谢您的支持，已经退出登陆。");
        }

    }
}
