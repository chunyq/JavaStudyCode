/*
ĳ��˾��ְ10����Ա����
�붨��һ������ʮ��Ԫ�ص�����,��¼Ա�����ʡ�
	1.������ӡ������Ԫ��
	2.���Ա�����鵱�е���С���ʴ�ӡ����
	3.���Ա�����鵱�е�����ʴ�ӡ����
    4.��Ա�������ƽ�����ʣ�
 */
public class Salary {
	public static void main(String[] args) {
		//��¼���� ��kΪ��λ
		double[] s = {9.5,8.7,12.3,13,10.5,10.9,14.2,10.4,12.7,8.7};
		double sum = 0;
		//����һ�����������ڱ�����ֵ
        //ȡ�����е�һ��������Ϊ�����ĳ�ʼֵ
        double max = s[0];
        double min = s[9];
		for (int i = 0; i<s.length; i++) {
			System.out.println("��"+(i+1)+"λԱ���Ĺ���Ϊ��"+s[i]+"K");
			if (s[i] > max) {
				max = s[i];
			}
			
			if (s[i] < min) {
				min = s[i];
			}
			
			sum += s[i];
		}
		double avg = sum / (s.length);
		System.out.println("�����Ϊ��"+max+"K");
		System.out.println("��С����Ϊ��"+min+"K");
		System.out.println("ƽ������Ϊ��"+(float)avg+"K");
	}
}