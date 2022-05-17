package day11;

public class homework_day11_Computer {
        public String computerType;//电脑品牌
        public  float computerPrice;//电脑价格
        public  int computerMemory;//电脑内存
        public  int computerDisk;//电脑硬盘大小
        public double computerMonitor;//电脑显示器尺寸
        //无参数方法：
        public  void decribe() {
            System.out.println("电脑品牌是：" + computerType);
            System.out.println("电脑内存是：" + computerMemory + " G");
            System.out.println("电脑硬盘大小：" + computerDisk + " G");
            System.out.println("电脑显示器尺寸：" + computerMonitor+"寸");
            System.out.println("电脑价格是：¥" + computerPrice);
        }//无参数电脑的基本信息介绍构造完成

        //有参数的构造
        public double getDiscount(double price,int dicount) {
            return ((price * dicount) / 10);
        }//返回double类型的折后价格

    }


