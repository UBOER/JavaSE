package day04;

/**
 * 学写了："！"取反符号，巩固了boolean类型的要点。
 */
public class demo9 {
    public static void main(String[] args) {
        int num=100;
        int num2=100;
        boolean b = num==num2;//boolean 只能赋值为 ture false
        System.out.println(b);//true

        boolean b1=num!=num2;// 本来结果为true 加了 "！" 就取反面，false
        System.out.println(b1);// false

        System.out.println("再次强调，必须把这个boolean搞懂，还有这个符号 ！");
        System.out.println(!"aa".equals("aa"));//false

        boolean b2=!"aa".equals("aa");
        System.out.println(b2);

    }
}
