/*
�����λ�������е�ˮ�ɻ���,�������Ǵ�ӡ������̨��.
�������ˮ�ɻ����ĺ�,��ͳ�ƹ��ж��ٸ�ˮ�ɻ���
 */
public class ShuiXian {
	public static void main(String[] args) {
		int g,s,b,sum = 0;
		// ��Ǹ���
		int count = 0;
		for (int i = 100; i<=999; i++ ) {
			g = i % 10;
			s = i / 10 % 10;
			b = i / 100;
			if (g*g*g + s*s*s + b*b*b == i) {
				System.out.println("��λ����ˮ�ɻ�����"+i);
				sum += i;
				count++;
			}
		}
		System.out.println("��λ����ˮ�ɻ����ܺͣ�"+sum);
		System.out.println("��λ����ˮ�ɻ���������"+count);
	}
}