package exam;

/**
 * ClassName:ShuiXianHua
 * Package:exam
 *
 * @Author 86183
 * @Create 2024/4/7 15:01
 */
//�������ˮ�ɻ���
public class ShuiXianHua {
    public static void main(String[] args) {
        //�������ʮ����λ��
        int g = 0;
        int s = 0;
        int b = 0;
        for (int i = 100; i <= 999; i++) {
            //��ȡ����ʮ����λ
            g = i % 10;
            s = i / 10 % 10;
            b = i / 100;
            if (g * g * g + b * b * b + s * s * s == i) {
                System.out.println("ˮ�ɻ���:" + i);
            }
        }
    }
}
