package day11;

public class homework_day11_Student {
    public String name;//学生姓名
    public int age;//学生年龄
    public String number;//学生学号
    public String sex;//学生性别
    public String dept;//学生系别
    //无参方法：
    public  void decribe() {
        System.out.println("学生的名字是："+name+"\n学生的年龄是："+
                age+"\n学生的性别是："+sex+"\n学生的学号是："+number+
                "\n学生的系别是："+dept);
    }//自我介绍方法 无参数

    //有参方法：
    public void hobby(String hobby) {
        System.out.println("学生："+name+"爱好是："+hobby);
    }//爱好介绍，有参数


}
