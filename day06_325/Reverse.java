/*
将一个给定的整型数组转置输出， 
例如：源数组，1 2 3 4 5 6
	  转置之后的数组，6 5 4 3 2 1
 */
public class Reverse {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6};
		//设置中间量
		int t = 0;
		//利用for循环开始转置	
		for (int i = 0; i<a.length/2; i++) {
			t = a[i];
			a[i] = a[a.length-1-i];
			a[a.length-1-i] = t;
		}

		//打印反转后的数组
		for (int i = 0; i<a.length; i++) {
			System.out.print(a[i]+"\t");
		}
	}
}