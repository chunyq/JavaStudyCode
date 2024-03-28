/**
 * ClassName:GongZiSort Package:PACKAGE_NAME Description:
 *
 * @Author zsx(YQ)
 * @Create 2024/3/26 18:31
 * @Version 1.0
 */
/*
场景：某公司员工考核成绩分别为87,98,67,45,100,
请定义数组，存储其成绩，使用冒泡排序和选择排序对其进行排序；
 */
public class GongZiSort {
    public static void main(String[] args) {
        int[] s = {87, 98, 67, 45, 100};
        // 冒泡排序
        // 第一层循环的i表示比较的轮数
        /*for (int i = 0; i < s.length-1; i++) {
            //第二层表示每轮比较的次数
            for (int j = 0; j < s.length-1-i; j++) {
                if (s[j] > s[j+1]){
                    int tmp = s[j];
                    s[j] = s[j+1];
                    s[j+1] = tmp;
                }
            }
        }*/

        // 选择排序
        // i表示执行的轮数
        for (int i = 0; i < s.length; i++) {
            // 内层循环从索引值为i+1开始，
            // 把当前的i当作最小数下标
            int min = i;
            for (int j = i + 1; j < s.length; j++) {
                if (s[j] < s[min]) {
                    min = j;
                }
            }
            if (min != i){
                int tmp = s[i];
                s[i] = s[min];
                s[min] = tmp;
            }
        }

        // 输出排序后的数组
        System.out.print("{");
        for (int value : s) {
            System.out.print(value + " ");
        }
        System.out.println("}");

    }
}
