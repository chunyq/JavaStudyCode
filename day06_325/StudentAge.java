//����һ��ʮ�����ȵ����飬������ѧ��������
//1.���������е�ÿһ��Ԫ��
//2.�������е�Ԫ���ۼ����
//3.��ƽ������
//4.ɸѡ������ƽ�����������
import java.util.*;
public class StudentAge {
	public static void main(String[] args) {
		double sum = 0;
		int[] a = {21,23,17,19,20,24,32,27,28,25};
		for (int i = 0; i<a.length; i++ ) {
			sum += a[i];
		}
		double avg = (sum / a.length);
		System.out.println("ƽ�����䣺"+avg);
		
		for (int i = 0; i<a.length; i++ ) {
			if (a[i] > avg) {
				System.out.println("����ƽ������ģ�"+a[i]);
			}
		}
		
	}
}