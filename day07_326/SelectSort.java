import java.util.Scanner;

/**
 * ClassName:SelectSort
 * Package:PACKAGE_NAME
 * Description:
 *
 * @Author zsx(YQ)
 * @Create 2024/3/26 14:58
 * @Version 1.0
 */
/*
简单选择排序：从0索引开始，依次和后面元素比较，小的放前面，第一次完毕，最小值出现在最小索引处
首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置，
然后，再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾。以此类推，直到所有元素均排序完毕。
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] a = {21, 32, 34, 1, 3, 67, 76};
        int tmp = 0;
        //i表示执行的轮数
        for (int i = 0; i < a.length-1; i++) {
            //内层循环从索引值为i+1开始，
            //把当前的i当作最小数下标
            int min = i;
            for (int j = i+1; j < a.length; j++) {
                if (a[j] < a[min]){
                    //缺陷：还没比出最小值,碰到比a[min]小的就交换
                    //tmp = a[j];
                    // a[j] = a[i];
                    // a[i] = tmp;
                    //先记住最小值的索引
                    min = j;
                }
            }

            //如果最小下标不一样,就将这两个下标对应数组的值交换
            if (min != i){
                tmp = a[i];
                a[i] = a[min];
                a[min] = tmp;
            }
        }
        
        //打印数组
        for (int value : a){
            System.out.print(value+" ");
        }
    }
}
