package day11;

public class homework_day11_Penguin {//创建企鹅类
    String name ;//定义名字
    int health = 98;//定义企鹅健康度
    int love = 80;//定义与主人亲密度
    String sex ;//定义性别

    public  void print() {
        System.out.println("我的名字叫" + name + ",健康值是"
                + health + ",与主人的亲密度是" + love
                + ",企鹅的性别是：" + sex);
    }
}
