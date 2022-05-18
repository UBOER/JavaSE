package day12;

public class StaticDemo01 {
    public  StaticDemo01() {
        System.out.println("我是new对象时被调用的构造方法。");
    }




    //代码块..虽然不用 但要提一下 在new 对象之前被调用
   /* {
        System.out.println("在newz之前被调用");
    }*/




    //静态代码块，在类加载之前被调用
    //static属于类
    static{
        System.out.println("在类加载之前被调用");
    }
}
