import java.util.Scanner;

/**
 * ClassName:SelectSort
 * Package:PACKAGE_NAME
 * Description:
 *
 * @Author zsx(YQ)
 * @Create 2024/3/26 14:58
 * @Version 1.0
 */
/*
��ѡ�����򣺴�0������ʼ�����κͺ���Ԫ�رȽϣ�С�ķ�ǰ�棬��һ����ϣ���Сֵ��������С������
������δ�����������ҵ���С����Ԫ�أ���ŵ��������е���ʼλ�ã�
Ȼ���ٴ�ʣ��δ����Ԫ���м���Ѱ����С����Ԫ�أ�Ȼ��ŵ����������е�ĩβ���Դ����ƣ�ֱ������Ԫ�ؾ�������ϡ�
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] a = {21, 32, 34, 1, 3, 67, 76};
        int tmp = 0;
        //i��ʾִ�е�����
        for (int i = 0; i < a.length-1; i++) {
            //�ڲ�ѭ��������ֵΪi+1��ʼ��
            //�ѵ�ǰ��i������С���±�
            int min = i;
            for (int j = i+1; j < a.length; j++) {
                if (a[j] < a[min]){
                    //ȱ�ݣ���û�ȳ���Сֵ,������a[min]С�ľͽ���
                    //tmp = a[j];
                    // a[j] = a[i];
                    // a[i] = tmp;
                    //�ȼ�ס��Сֵ������
                    min = j;
                }
            }

            //�����С�±겻һ��,�ͽ��������±��Ӧ�����ֵ����
            if (min != i){
                tmp = a[i];
                a[i] = a[min];
                a[min] = tmp;
            }
        }
        
        //��ӡ����
        for (int value : a){
            System.out.print(value+" ");
        }
    }
}
