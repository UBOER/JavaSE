package day12;

public class homework_day12_Testall {
    public static void main(String[] args) {
        homework_day12_Student student = new homework_day12_Student();//无参数调用构造方法
        student.name = "张三";//设置属性值
        student.age = 21;
        student.dept = "计算机科学";
        student.sex = "男";
        student.number = "2020413331";

        student.describe();//调用介绍信息（普通无参数方法
        String hobby = "打篮球";
        System.out.println(student.hobby(hobby));//调用爱好参数并输出（普通有参有返回方法
        /**
         * 开始重载调用构造方法
         */
        homework_day12_Student student2 = new homework_day12_Student(2);
        /*
        有参数构造方法，同时是重载
         */
        student2.name = "李茗";
        student2.age = 20;
        student2.sex = "女";
        student2.number = "2020413322";
        student2.dept = "现代艺术设计";
        //student2属性设置完毕

        student2.describe();//普通方法无参数

        String hobby1 = "写生";
        String hobby2 = "写作";
        System.out.println(student2.hobby(hobby1, hobby2));//有参普通方法的重载

        /**
         *——————————————————————————接下来是Phone类测试——————————————————————————————
         */
        homework_day12_Phone phone = new homework_day12_Phone();//先是无参数构造
        phone.price = 8999;
        phone.name = "iphone 13 pro max ";
        phone.manager = "三网通";
        phone.memory = 64;
        phone.color = "天蓝色";

        //调用无参数普通方法
        phone.decribe();
        //调用有参数普通方法
        boolean careOrNo = false;
        phone.careForPhone(careOrNo);
        //第二台机器--------------------------
        //调用有参数构造方法 也相当于重载了
        homework_day12_Phone phone2 = new homework_day12_Phone(2);
        //设置第二台机器的相关属性
        phone2.name = "小米13";
        phone2.price = 3299;
        phone2.memory = 256;
        phone2.color = "雪山白";
        phone2.manager = "三网通";

        //调用无参数普通方法
        phone2.decribe();
        //调用有参数普通方法
        careOrNo = true;
        int years = 3;//定义需要的参数 保险年份
        phone2.careForPhone(careOrNo, years);//有参数普通方法
/**
 * ———————————————————————————————接下来测试computer类—————————————————————————————————————————————————
 */


        homework_day12_Computer computer = new homework_day12_Computer();//先无参构造

        computer.color = "深空灰";
        computer.memory = 256;
        computer.price = 9999;
        computer.type = "轻薄本";
        computer.name = "MacBook Air M1";
        //调用无参数方法
        computer.describe();
        //调用有参数方法
        int discont = 9;//参数 折扣
        System.out.println(computer.discount(discont)+"\n");//输出

        //有参构造方法
        homework_day12_Computer computer2 = new homework_day12_Computer(2);
        computer2.color = "银";
        computer2.memory = 1024;
        computer2.price = 7999;
        computer2.type = "游戏本";
        computer2.name = "玩家国度";

        //无参数普通方法
        computer2.describe();
        //有参数 重载两个参数使用
        System.out.println(computer2.discount("白金卡", 3));
    }
}
