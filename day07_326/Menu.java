/**
 * ClassName:Menu
 * Package:PACKAGE_NAME
 * Description:
 *
 * @Author zsx(YQ)
 * @Create 2024/3/26 18:57
 * @Version 1.0
 */
/*
�����������飺
	String[] menu= {"������˿","���ѳ���","����","����","ţ��"};
	double[]price= {15.5 ,13,12,1.5,2};
	��������õ����½����
        �������²�Ʒ
        ����	��λ
        =========================
        ���	����		��λ
        1		������˿	15.5
        2		���Ѽ����Ƿ�13.0
        3		����		12.0
        4		����		1.5
        5		ţ��		2.0
 */
public class Menu {
    public static void main(String[] args) {
        String[] menu = {"������˿","���ѳ���","����","����","ţ��"};
        double[] price = {15.5 ,13,12,1.5,2};

        System.out.println("�������²�Ʒ");
        System.out.println("=========================");
        System.out.println("���\t����\t\t��λ");
        System.out.println("=========================");

        for (int i = 0; i < menu.length; i++) {
            System.out.println((i+1) + "\t" + menu[i] + "\t\t" + price[i]);
        }
    }
}
