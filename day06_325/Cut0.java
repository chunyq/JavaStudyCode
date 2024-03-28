/*
现在有如下的一个数组：
		int oldArr[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
	要求将以上数组中值为0的项去掉，将不为0的值存入一个新的数组，生成的新数组为：
		int newArr[]={1,3,4,5,6,6,5,4,7,6,7,5} ;
 */
public class Cut0 {
	public static void main(String[] args) {
		int[] oldArr={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
		//统计oldArr的非零元素数量
		int count = 0;
		for (int i = 0; i<oldArr.length; i++) {
			if (oldArr[i] != 0) {
				count++;
			}
		}
		//创建新数组
		int[] newArr = new int[count];
		//将不为0的值存入一个新的数组
		//此处新数组和旧数组的索引不该相同,否则容易引起索引越界
		int index = 0;
		for (int i = 0; i<oldArr.length; i++) {
			if (oldArr[i] != 0) {
				newArr[index++] = oldArr[i];
			}
		}
		System.out.print("新数组为：");
		System.out.print("[");
		for (int i = 0; i<newArr.length; i++) {
			System.out.print(newArr[i]+" ");
		}
		System.out.print("]");

	}
}