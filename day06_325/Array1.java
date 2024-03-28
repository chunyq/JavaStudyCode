//初识数组
public class Array1 {
	public static void main(String[] args) {
		//数据类型：遵循自动类型转换原则
		//1.1下面属于静态初始化
		double[] a = {23,41,43,43,45,26,64,756,32,423};
		//1.2动态初始化 是定义数组时只给定数组的长度，由系统给出默认初始化值
		//长度一旦指定，无法更改
		int[] b = new int[5]; //整数类型默认元素值为0
		float[] c = new float[6]; //浮点类型默认为0.0
		boolean[] d = new boolean[7]; //boolean类型默认为false
		//打印数组首地址
		System.out.println(a);
		//遍历数组
		for (int i = 0; i<=6; i++ ) {
			System.out.println(d[i]);
		}
		
	}
}