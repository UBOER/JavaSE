package day07;

/**
 * 如果没有 break会发生什么呢？

 */
public class demo04 {
    public static void main(String[] args) {

        int num=2;
        switch (num) {        // switch后面的数字是与下面的 case进行判断，如果相等就进入下一个条件
            case 1: //相当于if else
                System.out.println("奖励一个月夏令营");
                /**
                 * 没有break，下一个判断会失效，直接进入，直到运行到下一个break 才停止。
                 * 系统认为break 1 进去了 就还没出来，所以一个判断停止的标准就是break
                 */
            case  2:
                System.out.println("奖励惠普笔记本电脑一部");
                break;

            case 3:
                System.out.println("奖励移动硬盘");
                break;
            default:   //就相当于else
                System.out.println("啥都没有");


        }
    }
}
