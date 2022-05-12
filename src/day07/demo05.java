package day07;

/**
 * default的位置影响判断的结果吗？
 * 不影响，switch严格遵守：先找到case,再找break,再找case...最后再找default
 */

public class demo05 {
    public static void main(String[] args) {
        int num=1;
        switch (num) {// switch后面的数字是与下面的 case进行判断，如果相等就进入下一个条件
            default:   //default 的功能类似于case 也要注意break，如果进入了default 会继续接下来的代码 直到break出现
                System.out.println("啥都没有");

            case 1: //相当于if else
                System.out.println("奖励一个月夏令营");
                break;      //判断完要写break 进入后会执行下面case2 的代码
            case  2:
                System.out.println("奖励惠普笔记本电脑一部");
                break;

            case 3:
                System.out.println("奖励移动硬盘");
                break;


        }

    }
}
