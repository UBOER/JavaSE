package day11;

public class homework_day11_phone {
    public String phoneType;//手机类型
    public  float phonePrice;//手机价格
    public  int phoneMemory;//手机大小
    public  String phoneManager;//手机运营商
    public String phoneColor;//手机颜色
    //无参数方法：
    public  void decribe() {
        System.out.println("手机类型是：" + phoneType);
        System.out.println("手机内存是：" + phoneMemory + " G");
        System.out.println("手机颜色是：" + phoneColor + "色");
        System.out.println("手机的运营商是：" + phoneManager);
        System.out.println("手机价格是：¥" + phonePrice);
    }//无参数的手机基本信息介绍构造完成

    //有参数的构造
    public double getDiscount(double price,int dicount) {
        return ((price * dicount) / 10);
    }//返回double类型的折后价格

}
