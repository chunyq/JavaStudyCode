/*
某公司入职10名新员工，
请定义一个包含十个元素的数组,记录员工工资。
	1.遍历打印出数组元素
	2.求出员工数组当中的最小工资打印出来
	3.求出员工数组当中的最大工资打印出来
    4.求员工数组的平均工资；
 */
public class Salary {
	public static void main(String[] args) {
		//记录工资 以k为单位
		double[] s = {9.5,8.7,12.3,13,10.5,10.9,14.2,10.4,12.7,8.7};
		double sum = 0;
		//定义一个变量，用于保存最值
        //取数组中第一个数据作为变量的初始值
        double max = s[0];
        double min = s[9];
		for (int i = 0; i<s.length; i++) {
			System.out.println("第"+(i+1)+"位员工的工资为："+s[i]+"K");
			if (s[i] > max) {
				max = s[i];
			}
			
			if (s[i] < min) {
				min = s[i];
			}
			
			sum += s[i];
		}
		double avg = sum / (s.length);
		System.out.println("最大工资为："+max+"K");
		System.out.println("最小工资为："+min+"K");
		System.out.println("平均工资为："+(float)avg+"K");
	}
}