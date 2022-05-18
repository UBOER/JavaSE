package day12;

public class StaticTest {
    public static void main(String[] args) {
         StaticDemo01 s1 = new StaticDemo01();
         //先会执行哪一条语句？
        /**
         * 事实证明 先调用静态代码块
         *
         * 类只会加载一次。new的时候就已经被加载了
         * 再调用这个函数不会再输出 静态代码块
         */
        StaticDemo01 s2 = new StaticDemo01();

    }
}
