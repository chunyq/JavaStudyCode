/*
���������µ�һ�����飺
		int oldArr[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
	Ҫ������������ֵΪ0����ȥ��������Ϊ0��ֵ����һ���µ����飬���ɵ�������Ϊ��
		int newArr[]={1,3,4,5,6,6,5,4,7,6,7,5} ;
 */
public class Cut0 {
	public static void main(String[] args) {
		int[] oldArr={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
		//ͳ��oldArr�ķ���Ԫ������
		int count = 0;
		for (int i = 0; i<oldArr.length; i++) {
			if (oldArr[i] != 0) {
				count++;
			}
		}
		//����������
		int[] newArr = new int[count];
		//����Ϊ0��ֵ����һ���µ�����
		//�˴�������;����������������ͬ,����������������Խ��
		int index = 0;
		for (int i = 0; i<oldArr.length; i++) {
			if (oldArr[i] != 0) {
				newArr[index++] = oldArr[i];
			}
		}
		System.out.print("������Ϊ��");
		System.out.print("[");
		for (int i = 0; i<newArr.length; i++) {
			System.out.print(newArr[i]+" ");
		}
		System.out.print("]");

	}
}