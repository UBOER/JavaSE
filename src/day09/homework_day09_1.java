package day09;

public class homework_day09_1 {
    /**
     * 求1～100之间不能被3整除的数的和
     */
    public static void main(String[] args) {
        int sum = 0;//定义1～100之间不能被3整除的数的和，并且初始化为0
        for (int i = 1; i < 100; i++) {//不包含100
            if (i % 3 !=0) {
                sum = sum + i;
            }
        }
        System.out.println("1～100之间不能被3整除的数的和:" + sum);
    }
}
