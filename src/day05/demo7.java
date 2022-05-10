package day05;

public class demo7 {
    public static void main(String[] args) {//这一句万年不变
        //&&  表示而且 两个条件必须为真 才能进来  false在前在后不进行判断
        //逻辑运算符 只要见到一个false 就无法进来
        if(true && true && true){
            System.out.println("能否进来？1");//可以 条件全真
        }

        if(true && false &&true)
        {
            System.out.println("能否进来呢？2");//无法进来，条件有一个假 不满足全真
        }

        //  || 或者， 有一个是真就可以进来。
        //&& ||是开发必用的，
        if(true||false||false){
            System.out.println("能否进来呢？3");
        }

    }
}
