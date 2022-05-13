package day08;

/**
 * 循环
 * while
 * do while
 * for
 */
public class demo01 {
    /*
    do while循环 开发一般不用。 面试可能会有
     */
    public static void main(String[] args) {
        //打印输出 抄写代码100编
        int i =1;
        while (i<=100) {
            System.out.println("抄写代码第" + i + "遍");
            i++;
        }


        while (true/*死循环*/) {//cpu瞬间达到100%
            System.out.println("死循环");
                break;//不要break的话 就会死循环
        }

        /**
         * 开发过程中如何跳出死循环？标准的跳出写法。
         */
        boolean b=true;
        while(b) {
            System.out.println("这是个死循环吗？");
            //在实际开发过程中，这里会有 if else操作，根据不同的结果给b赋值
            b = false;
        }
        /**
         * 今后开发过程中，还有一种标准写法，暂时不说，因为要调用方法
         */
    /*    while (这里调用方法。以后将，调用方法的时候返回boolean) {
        }
*/
        /**
         * 几种特殊情况
         *
         */
        //不能while false
        /*while (false) {
            System.out.println("fdsfs");
        }*/

        boolean c= false;
        while (c) {
            System.out.println("不报错。但可以运行吗？");
        }//不进入循环

        while (!c) {
            System.out.println("现在就可以循环了，不过是死循环。");
            c=true;//加true结束
        }





    }
}


