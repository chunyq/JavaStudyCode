public class DataType2{
	public static void main(String[]args){
		
		byte b=10;
		b=11;
		b=127;//-128  127
		System.out.println("b="+b);
		
		short sh=1111;
		System.out.println("sh="+sh);
		
		//���� Ĭ�� int����
		int in=233456789;
		System.out.println("in="+in);
		
		// long ���͵����� L/l
		long lo=13203820569L;
		lo=123;
		lo=12L;
		System.out.println("lo="+lo);
		
		// ��������Ĭ�� ��double
		double d=12.3;
		d=12;
		d=123456789.9876543211234d;
		System.out.println("d="+d);
		
		// float ��Ҫ��F/f
		float f=12.3f;
		f=123456789.9876543211234f;
		System.out.println("f="+f);
		
		//�ַ����� '' ���ҽ���һ���ַ�
		char cc='a';
		cc='��';
		cc='*';
		cc=' ';
		cc='x';
		System.out.println("cc="+cc);
		
		//�������ͣ�ֵֻ����true/false
		boolean bb=true;
		bb=false;
		System.out.println("�Ƿ���꣺"+bb);
		
		// String:���ǻ�����������  �����������е�������
		//String���ַ�����	
		String str="��ã������ַ���";
		System.out.println("str��"+str);
		
		String d2="xxx";
	
	}
}