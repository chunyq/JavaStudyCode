// �Զ�����ת��ϸ��
public class AutoConvert{
	public static void main(String[] args) {
		// ϸ��1���ж������͵����ݻ������ʱ
		// ϵͳ�����Զ������е�����ת���ɾ��������Ǹ�����
		char c1 = 'b';
		int n1 = 20;
		/*float f1 = n1+2.1;  ���� ������*/
		float f2 = c1 + n1 + 2.1F;
		System.out.println(f2); // ���������float
		// 'b'(char)-->98.0(float) 20(int) --> 20.0(float)
		
		//ϸ��2�������ǰѾ��ȴ�����͸�ֵ������С������ʱ���ᱨ��
		//��֮�������Զ�����ת��
		/*int n2 = 3.14;  double --> int ����*/

		//ϸ��3���Զ�����ת������
		//byte,short(char) --> int -->long -->float -->double 
		//����Խ��Խ��,boolean����������ת��
		//ע��:byte,short��char�����໥�Զ�ת��,���ǿ����໥����
		//��������ʱҪ��ת��Ϊint����
		byte b1 = 1;
		byte b2 = 2;
		short s1 = 1;
		// short s2 = b1 + s1;  ���� ��Ϊb1+s1 -->int
		int s2 = b1 + s1; //��
		// byte b3 = b1+b2; ���� b1 + b2 -->int
		
		/*byte n2 = 128;  ���� 
		����byte������ֵʱ�����ж��Ƿ���byte��Χ(-128-127)��
		*/

	}
}