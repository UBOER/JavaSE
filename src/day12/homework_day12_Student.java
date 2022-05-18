package day12;

public class homework_day12_Student {
    public String name;//姓名
    public String number;//学号
    public String dept;//院系
    public String sex;//性别
    public int age;//岁数
    //public String hobby;//兴趣爱好

    //静态代码块搞一个上去：
    static {
        System.out.println("************学生信息介绍************");
    }


    //普通无参方法：
    public  void describe() {
        System.out.println("学生的名字是：" + name + "\n学生的学号是：" + number
                + "\n学生的性别是：" + sex + "\n学生的岁数是：" + age + "\n学生院系是：" + dept);
    }

    //普通带参数方法：
    public String hobby(String hobby) {
        return "爱好："+hobby+"很不错\n\n";
    }

    //这里搞一个重载上去，万一别人有几个爱好呢对吧？
    public String hobby(String hobby, String hobby2) {
        return "爱好："+hobby+"还可以" +"、"+ hobby2+"很擅长\n\n";
    }

    //无参数的构造方法
    public  homework_day12_Student () {

        System.out.println("下面是第1个同学的信息：");
    }

    //有参数的构造方法
    public homework_day12_Student(int turn) {
        System.out.println("下面是第"+turn+"个同学信息：");
    }
}
