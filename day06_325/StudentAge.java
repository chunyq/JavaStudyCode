//声明一个十个长度的数组，用来存学生的年龄
//1.遍历数组中的每一个元素
//2.把数组中的元素累加求和
//3.求平均年龄
//4.筛选出大于平均年龄的数据
import java.util.*;
public class StudentAge {
	public static void main(String[] args) {
		double sum = 0;
		int[] a = {21,23,17,19,20,24,32,27,28,25};
		for (int i = 0; i<a.length; i++ ) {
			sum += a[i];
		}
		double avg = (sum / a.length);
		System.out.println("平均年龄："+avg);
		
		for (int i = 0; i<a.length; i++ ) {
			if (a[i] > avg) {
				System.out.println("大于平均年龄的："+a[i]);
			}
		}
		
	}
}