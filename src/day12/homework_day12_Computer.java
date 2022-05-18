package day12;

public class homework_day12_Computer {
    //设置电脑各类属性
    public String name;//电脑牌子
    public float price;//电脑价格
    public int memory;//电脑内存
    public String color;//电脑颜色
    public String type;//电脑类型


    //定义一个静态代码块
    static {
        System.out.println("************下面是电脑信息************");
    }

    //定义无参数构造方法
    public homework_day12_Computer() {
        System.out.println("下面是第1台电脑信息：");
    }

    //定义有参数构造方法：
    public homework_day12_Computer(int no) {
        System.out.println("下面是第" + no + "台电脑信息");
    }

    //定义无参数普通方法
    public void describe() {
        System.out.println("电脑型号是：" + name);
        System.out.println("电脑内存是：" + memory+"G");
        System.out.println("电脑颜色是：" + color+"色");
        System.out.println("电脑类型是：" + type);
        System.out.println("电脑原价是：¥" + price);
    }

    //定义有参数普通方法
    public String discount(int discount) {
        return "您的等级为普通会员，打9折，折后价格为：¥"+((double) (discount) * (price) / 10);
    }

    //定义重载的有参数普通方法
    public String discount(String cardOfvip, int numbers) {
        String messageReturn = null;
        switch (cardOfvip) {
            case "金卡":
                messageReturn= "您的等级为" + cardOfvip + "，购买数量为：" + numbers + "台，可打7折，折后价格为：¥" + ((double) (7) * (price * numbers) / 10);
            break;
            case "白金卡":
                messageReturn= "您的等级为" + cardOfvip + "，购买数量为：" + numbers + "台，可打5折，折后价格为：¥" + ((double) (5) * (price * numbers) / 10);
            break;
        }
        return messageReturn;
    }
}


