package day08;

/**
 * 一些写循环的时候注意的地方
 */
public class demo02 {
    public static void main(String[] args) {
        //这个里面的代码，以后开发过程中 100%不会用
        int num=1;
        int num2=1;
        while (num == num2) {//不要在这个里面写很多&& || 在while中用if else结束
            System.out.println("不要这样用");
            break;
        }2

        while (num != num2) {
            System.out.println("不能进来");

        }

        String str1 = "好人";
        String str2 = "好人";
        while (str2.equals(str1)) {
            System.out.println("死循环，可以进入");
        }
    }
}
