/*
��3��
��ӡ1��100֮�ڵ��������������а���3��Ҫ����
    ÿ�����5����������������֮���ÿո�ָ�
    �磺1 2 4 5 6
     7 8 9 10 11
 */
public class HanSanGuo {
	public static void main(String[] args) {
		 int count = 0; // ���ڼ���ÿ�д�ӡ�����ָ���  
        for (int i = 1; i <= 100; i++) {  
            // ��������Ƿ����3  
            boolean containsThree = false;  
            int temp = i;  
            while (temp > 0) {  
                if (temp % 10 == 3) {  
                    containsThree = true;  
                    break;  
                }  
                temp /= 10;  
            }  
            // ������ְ���3��������  
            if (containsThree) {  
                continue;  
            }  
            // ��ӡ���֣������Ӽ�����  
            System.out.print(i);  
            count++;  
            // �������ÿ�е����һ������������ո�  
            if (count < 5) {  
                System.out.print(" ");  
            } else {  
                // �����ÿ�е����һ��������������з��������ü�����  
                System.out.println();  
                count = 0;  
            }  
        }  
        // ������һ�����ֲ���5����Ҳ������з�����ѡ��ȡ�����Ƿ��ϸ�Ҫ��ÿ�б�����5�����֣�  
        if (count > 0) {  
            System.out.println();  
        }  
	}
}