package day04;

public class demo5 {

    public static void main(String[] args) {
        int i=5;
        System.out.println("i第一次的值为" + i);//此时i为5
        i++;
        System.out.println("i第二次的值为"+i);//此时i为6
        i++;
        System.out.println("i第三次的值为"+i);//此时i为7
        int num=8;
        num+=1;//相当于 num+1=9 //开发会用
        System.out.println("num的值为"+num);

        num+=6;
        System.out.println("此时num的值为"+num);

        int num2=20;
        num2-=4; // 20- 4= 16
        System.out.println(num2);



    }
}
