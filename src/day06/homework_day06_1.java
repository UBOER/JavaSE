package day06;

/**
 * 买彩票
 * 如果体彩中了500万，我买车、资助希望工程、去
 * 欧洲旅游
 * 如果没中，我买下一期体彩，继续烧高香
 */

public class homework_day06_1 {
    public static void main(String[] args) {
        String answer;//定义彩票是否中奖
        answer = "中奖";
        if (answer.equals("中奖")) {
            System.out.println("我买车、资助希望工程、去欧洲旅游!");
        } else {
            System.out.println("我买下一期体彩，继续烧高香");
        }

        answer = "没中";
        if (answer.equals("中奖")) {
            System.out.println("我·买车、资助希望工程、去欧洲旅游!");
        } else {
            System.out.println("我买下一期体彩，继续烧高香");
        }
    }
}
