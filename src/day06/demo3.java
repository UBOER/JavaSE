package day06;

public class demo3 {
    public static void main(String[] args) {


        /**
         * 王二的Java 成绩 大于 98 并且 音乐成绩 大于80 老师奖励一台电脑
         * 或者 王二的Java 成绩 等于100 并且mysql 成绩大于70 老师奖励电脑一台
         */

        int javaSE = 99;
        int mysql = 81;
        if (javaSE > 98 && mysql > 80) {
            System.out.println("有电脑了");
        }
        if (javaSE ==100 && mysql > 70) {
            System.out.println("有电脑了");//不满足条件 false  不走这条程序
        }

        /**
         * 小王 mysql成绩 大于88 奖励电脑一台
         * 否则 抄代码100便
         */
        int mysql_wang = 70;
        if (mysql_wang > 88) {
            System.out.println("奖励电脑一台");
        } else {
            System.out.println("抄代码一百遍");
        }
        /**
         *  if else 在开发过程中非常重要 需要重视
         */
    }
}
