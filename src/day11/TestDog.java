package day11;

public class TestDog {
    public static void main(String[] args) {
        //现在要调用dog中的方法或属性
        //new 对象 实例化 创建对象
        Dog dog = new Dog();//必须和类名一摸一样Dog=Dog
        //调用Dog中的name属性，通过dog.调用
        System.out.println(dog.name);
        System.out.println(dog.health);
        //调用Dog中的run
        dog.run();
        /**
         * main方法可以在任何一个类中
         */


        //修改name属性的值 通过变量名.属性名=你的值
        dog.name = "蛋皮";
        System.out.println(dog.name);
        dog.health = 10;
        System.out.println(dog.health);


    }
}
