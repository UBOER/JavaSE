package day11;

/**
 * 1.发现类 dog
 * 2.发现属性
 */
public  class Dog {
    //2.发现属性 public 是公共公开的意思
    public String name = "昵称1";
    public int health = 100;//健康值
    public int love = 100;//与主人亲密度
    public String strain = "吉娃娃";//品种


    //3.发现行为: 行为就是方法
    //void就是返回值  run是方法名 (以后可以传参数)
    public  void run() {
        System.out.println("跑呀跑");

    }

    public void sleep() {
        System.out.println("睡呀睡");
    }

    /**
     *定义方法
     * int 返回类型
     * @return
     */
    public int getNum() {
        System.out.println("以后开发过程中这里会有很多的代码");
            return 10; //返回值 返回一个int
    }

    public String getStr() {
        return name;
    }

    /**
     *调用就必须要一个参数
     * @param name1 参数一个
     * @return 是String引用类型
     */

    public String getStr2(String name1) {
        return "getStr2";
    }

    /**
     *调用就必须要两个参数
     * @param name1 第一个参数
     * @param name2 第二个参数
     * @return
     */
    public String getStr3(String name1, String name2) {
        return "str+" + name1;
    }


    public  void print() {
        System.out.println("宠物的自白：我的名字叫"+name+"\t"+"与主人亲密度"+love+"\t"+"健康值为"+health);
    }

}