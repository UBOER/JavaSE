package day04;

/**
 * 学习了：判断运算符，判断运算符判断后返回布尔类型。
 */
public class demo7 {
    public static void main(String[] args) {
        int zhangSan=10;//张三
        int lisi=80;//李四
        //请问 张三>李四 ？  得到的结果是真 true 还是假 false
        System.out.println(zhangSan>lisi);//false
        System.out.println(zhangSan<lisi);//true
        System.out.println(zhangSan==lisi);//false
        //zhangSan 的成绩也修改为80
        zhangSan=80;
        //请问 张三==李四，得到的结果是真 true 还是假false
        System.out.println(zhangSan==lisi);//true



    }
}
