package day10;public class demo02 {
    public static void main(String[] args) {
        /**
         * 最简单的排序 冒泡排序
         */
        int[] arr={9,8,7,6,5,4,3,2,1};//定义一个数组
        int temp;//把大的拿出来的容器
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                /*arr.length-i-1的长度随着外循环的次数，每次都少1
                因为排到最右边就是最大的数了，不用再排了，减少次数。
                 */

                if (arr[j]>arr[j+1]) {
                    temp=arr[j];//把它拿出来放到temp
                    arr[j]=arr[j+1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}

}