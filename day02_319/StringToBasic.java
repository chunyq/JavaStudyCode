// �����������ͺ�String���͵Ļ�ת
// String������������������
public class StringToBasic{
	public static void main(String[] args) {
		// Basic --> String
		int n1 = 120;
		float n2 = 1.3f;
		double n3 = 3.14;
		boolean b1 = true;
		String str1 = n1 + "";
		String str2 = n2 + "";
		String str3 = n3 + "";
		String str4 = b1 + "";

		System.out.println(str1 + " " + str2 + " " +str3 + " " + str4);

		// String --> Basic
		// ͨ���������͵İ�װ�����parseXX��������
		String s5 = "123";
		int num1 = Integer.parseInt(s5);
		double num2 = Double.parseDouble(s5);
		float num3 = Float.parseFloat(s5);
		long num4 = Long.parseLong(s5);
		byte num5 = Byte.parseByte(s5);
		boolean b2 = Boolean.parseBoolean(s5);
		short num6 = Short.parseShort(s5);

		System.out.println("=====================");
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		System.out.println(num6);
		System.out.println(b2);

		// Stringת��Ϊ������������ʱ��Ҫȷ��String�ܹ�תΪ��Ч������
		// �����ʽ����ȷ���ͻ��׳��쳣������ͻ���ֹ�����������쳣�����½ڻᴦ��
		String s6 = "hello";
		/*int n = Integer.parseInt(s6); �˴����׳��쳣 �޷�ת��*/

	}
}