/*
�ִ���������������:
		int[] arr1 = {1,2,3};
		int[] arr2 = {4,5,6};
	Ҫ����������ϲ�,�γ�һ���µ�����
		�µ�����: arr3 = {1,2,3,4,5,6}
 */
public class HeBing {
	public static void main(String[] args) {
		int[] arr1 = {1,2,3};
		int[] arr2 = {4,5,6};

		//�ϲ����鳤��Ϊarr1��arr2���鳤��֮��
		int[] arr3 = new int[arr1.length+arr2.length];

		//��arr1��Ԫ�ظ��Ƶ�arr3
		for (int i = 0; i<arr1.length; i++ ) {
			arr3[i] = arr1[i];
		}

		//��arr2��Ԫ�ظ��Ƶ�arr3ʣ��λ��
		for (int j = 0; j<arr2.length; j++ ) {
			arr3[arr1.length+j] = arr2[j];
		}

		//��ӡarr3
		for (int value : arr3) {
			System.out.print(value+" ");
		}
	}
}