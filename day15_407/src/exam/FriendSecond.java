package exam;

/**
 * ClassName:FriendSecond
 * Package:exam
 *
 * @Author 86183
 * @Create 2024/4/7 15:46
 */
public class FriendSecond {
    public static void main(String[] args) {
        String str = "���Ѳ����µ���,һ��������ᶮ,�����˻���ʹ,��Ҫ�߻�����,����һ��һ����";
        // �ҵ���һ��"����"��λ��
        int firstPosition = str.indexOf("����");
        if (firstPosition != -1) {
            // �ӵ�һ��"����"֮���λ�ÿ�ʼ�����ڶ���"����"
            int secondPosition = str.indexOf("����", firstPosition + 2); // +2 ����Ϊ����Ҫ�����Ѿ��ҵ��ĵ�һ��"����"
            if (secondPosition != -1) {
                System.out.println("�ڶ���'����'���ڵ�λ����: ��" + (secondPosition - 1) + "��λ��");
            } else {
                System.out.println("û���ҵ��ڶ���'����'��");
            }
        } else {
            System.out.println("û���ҵ�'����'��");
        }

    }
}
