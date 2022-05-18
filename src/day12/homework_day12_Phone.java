package day12;

public class homework_day12_Phone {
    //定义属性
    public String name;//手机型号
    public int memory;//手机内存
    public double price;//手机原价
    public String manager;//手机运营商
    public String color;//手机颜色

    //定义一个静态代码块
    static {
        System.out.println("************下面是手机信息************");
    }

    //定义普通无参方法
    public void decribe() {
        System.out.println("手机型号是：" + name + "\n手机颜色是：" + color +
                "\n手机内存是：" + memory + "G\n手机运营商支持：" + manager +
                "\n手机原价是：" + price);
    }

    //定义普通有参数方法
    public void careForPhone(boolean anotherCare) {
        if (anotherCare) {
            System.out.println("手机已经购买额外1年的保修！\n");
        } else System.out.println("手机保修为基础普通保修\n");
    }

    //在定义一个careForPhone的两个参数的 方便重载一下
    public void careForPhone(boolean anotherCare, int years) {
        if (anotherCare) {
            System.out.println("手机已经额外购买了" + years + "年的保修！\n");
        } else {
            System.out.println("手机保修为基础普通保修\n");
        }
    }


    //定义无参数构造方法
    public homework_day12_Phone() {
        System.out.println("下面是第1台手机的信息：");
    }

    //定义有参数的构造方法
    public homework_day12_Phone(int no) {
        System.out.println("下面是第" + no + "台手机的信息：");
    }

}
