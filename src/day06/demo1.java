package day06;

public class demo1 {

    public static void main(String[] args) {
        //请问这个返回的结果是什么？
        System.out.println(6==6);//返回布尔值 判断
        if(8==8){ //括号内的应该是布尔值，true才能进入if中 false不进入
            System.out.println("等于8");
        }
        if (!true) {
            System.out.println("能不能进来？2");//不能进来因为! 代表取反，！true恒假

        }

        if (!true && true && !true) {
            System.out.println("能不能进来呢？");//不能进来，&&且连接，有一个假都不行，！true恒假
        }


    }
}
