/**
 * @author Yang Zuqiang
 * @version 1.0
 */
public class FloatDetail{
	public static void main(String[] args) {
		//����float�ͳ�������������F
		float n1 = 1.1F;
		double n2 = 2.3;
		double n3 = .234; //�ȼ�0.234
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(5.12e2); //512.0
		System.out.println(5.12E-2); //0.0512

		//������ʹ������
		double n4 = 2.7;
		double n5;
		n5 = 8.1/3;
		System.out.println(n4);
		System.out.println(n5); //�ӽ�2.7��С��������2.7

		/*
		�������������ڸ������ľ������⵼�µġ�
		�ڼ�����У��������ı�ʾ�����޵ģ��޷�׼ȷ�ر�ʾ���е�ʵ����
		��ˣ��ڽ��и���������ʱ�����ܻ����һЩ������
		 */
		// Ҫ�ж������������Ƿ���ȣ���Ӧ��ʮ���Ƶķ���ֱ�ӱȽϣ�
		// Ӧ�������������Ĳ�ֵ�ľ���ֵ����ĳ�����Ƚ����ж�
		// ����д��
		/*if(n4 == n5){
			System.out.println("���");
		}*/


		// ��ȷд��
		if(Math.abs(n4 - n5)<0.00000001){
			System.out.println("��ֵ�ǳ�С�����ҵĹ涨���ȣ���Ϊ���");
		}
	}
}