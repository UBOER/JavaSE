package day08;

public class demo04 {
    /**
     * do while
     */
    public static void main(String[] args) {
        //while是先判断，再执行
        //do while 是先执行一边 再判断 条件为真再执行
        do {
            System.out.println("不管条件成不成立，都会执行一次 ");
        } while (false);

        boolean c = true;
        do {
            System.out.println("跳出死循环");
            c = false;//这句话执行一次
        } while (c);


        String str = "y";
        do {
            System.out.println("这种情况 执行几次？");
            str = "no";//1次 就是理解到先执行 再判断
        } while (!"y".equals(str));//!"y".equals(str)，死循环

    }
}