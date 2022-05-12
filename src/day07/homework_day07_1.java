package day07;
/**
 * 张三为他的手机设定了自动拨号
 * 按1：拨爸爸的号
 * 按2：拨妈妈的号
 * 按3：拨爷爷的号
 * 按4：拨奶奶的号
 */

import java.util.Scanner;

public class homework_day07_1 {
    public static void main(String[] args) {
        /**
         * 重在掌握switch 和 if else 的判断
         *不考虑输错情况或其他
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("自动拨号系统，输入快捷键：");
        int button = sc.nextInt();
        switch (button) {//switc 判断
            case 1:
                System.out.println("拨爸爸的号。");
                break;//break要记得写
            case 2:
                System.out.println("拨妈妈的号");
                break;
            case 3:
                System.out.println("拨爷爷的号");
                break;
            case 4:
                System.out.println("拨奶奶的号");
                break;

        }

        /**
         * 用if else 来做
         */
        System.out.println("再次输入快捷键");
        int button2 = sc.nextInt();

        if (button2 == 1) {
            System.out.println("拨爸爸的号");}//号码是1的时候

        else if (button2 == 2) {
            System.out.println("拨妈妈的号");} //快捷键为2时

        else if (button2 == 3) {//快捷键为3时
            System.out.println("拨爷爷的号");
        } else if (button2 == 4) {//快捷键为4时
            System.out.println("拨奶奶的号码");
        }


    }
}
