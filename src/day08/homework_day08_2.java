package day08;

/**
 * 2012年培养学员25万人，每年增长25%。请问按
 * 此增长速度，到哪一年培训学员人数将达到100万人？
 */
public class homework_day08_2 {
    /*public static void main(String[] args) {
        int year = 2012;
        double student = 250000;
        while (student < 1000000) {//结束条件
            student = student * 1.25;
            year = year + 1;
        }
        System.out.println(year + "可以达到100万学员" + student);

    }*/

    /**
     * 上面是第一种写法
     *while (student < 1000000)
     */

   /* public static void main(String[] args) {
        int year = 2012;
        double student = 250000;
        while (true) {

            student = student * 1.25;
            year = year + 1;
            if (student > 1000000) {
                break;
            }

        }
        System.out.println(year);
    }
    */

    /**
     * 第二种写法
     * while(true)
     * 里面嵌套
     *   if (student > 1000000) {
     *                 break;
     */



    public static void main(String[] args) {
        int year = 2012;
        double student = 250000;
        do {
            year = year + 1;
            student = student * 1.25;

        } while (student < 1000000);
        System.out.println(year);

    }

    /**
     * 第三种可发 用 do while 循环来做
     */
}
