/**
 * ClassName:GongZiSort Package:PACKAGE_NAME Description:
 *
 * @Author zsx(YQ)
 * @Create 2024/3/26 18:31
 * @Version 1.0
 */
/*
������ĳ��˾Ա�����˳ɼ��ֱ�Ϊ87,98,67,45,100,
�붨�����飬�洢��ɼ���ʹ��ð�������ѡ����������������
 */
public class GongZiSort {
    public static void main(String[] args) {
        int[] s = {87, 98, 67, 45, 100};
        // ð������
        // ��һ��ѭ����i��ʾ�Ƚϵ�����
        /*for (int i = 0; i < s.length-1; i++) {
            //�ڶ����ʾÿ�ֱȽϵĴ���
            for (int j = 0; j < s.length-1-i; j++) {
                if (s[j] > s[j+1]){
                    int tmp = s[j];
                    s[j] = s[j+1];
                    s[j+1] = tmp;
                }
            }
        }*/

        // ѡ������
        // i��ʾִ�е�����
        for (int i = 0; i < s.length; i++) {
            // �ڲ�ѭ��������ֵΪi+1��ʼ��
            // �ѵ�ǰ��i������С���±�
            int min = i;
            for (int j = i + 1; j < s.length; j++) {
                if (s[j] < s[min]) {
                    min = j;
                }
            }
            if (min != i){
                int tmp = s[i];
                s[i] = s[min];
                s[min] = tmp;
            }
        }

        // �������������
        System.out.print("{");
        for (int value : s) {
            System.out.print(value + " ");
        }
        System.out.println("}");

    }
}
