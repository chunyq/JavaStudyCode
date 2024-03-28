/*
现存在如下两个数组:
		int[] arr1 = {1,2,3};
		int[] arr2 = {4,5,6};
	要求将两个数组合并,形成一个新的数组
		新的数组: arr3 = {1,2,3,4,5,6}
 */
public class HeBing {
	public static void main(String[] args) {
		int[] arr1 = {1,2,3};
		int[] arr2 = {4,5,6};

		//合并数组长度为arr1、arr2数组长度之和
		int[] arr3 = new int[arr1.length+arr2.length];

		//将arr1的元素复制到arr3
		for (int i = 0; i<arr1.length; i++ ) {
			arr3[i] = arr1[i];
		}

		//将arr2的元素复制到arr3剩余位置
		for (int j = 0; j<arr2.length; j++ ) {
			arr3[arr1.length+j] = arr2[j];
		}

		//打印arr3
		for (int value : arr3) {
			System.out.print(value+" ");
		}
	}
}