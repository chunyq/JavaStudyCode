/*
��һ����������������ת������� 
���磺Դ���飬1 2 3 4 5 6
	  ת��֮������飬6 5 4 3 2 1
 */
public class Reverse {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6};
		//�����м���
		int t = 0;
		//����forѭ����ʼת��	
		for (int i = 0; i<a.length/2; i++) {
			t = a[i];
			a[i] = a[a.length-1-i];
			a[a.length-1-i] = t;
		}

		//��ӡ��ת�������
		for (int i = 0; i<a.length; i++) {
			System.out.print(a[i]+"\t");
		}
	}
}