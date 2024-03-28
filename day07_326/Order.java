import java.util.Scanner;

/**
 * ClassName:Order
 * Package:PACKAGE_NAME
 * Description:
 *
 * @Author zsx(YQ)
 * @Create 2024/3/27 8:09
 * @Version 1.0
 */
public class Order {
    private String[] menu = {"������˿", "��������", "������", "���Ŷ���", "�Ǵ��Ź�"};
    private int[] price = {15, 18, 20, 16, 22};
    private int[] order = new int[menu.length];
    private int[] quantity = new int[menu.length];

    public void showMenu() {
        System.out.println("�˵���");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + " " + menu[i] + " " + price[i] + "Ԫ");
        }
    }

    public void orderFood() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("�������Ʒ��ţ�����88�˳�����");
            int index = scanner.nextInt();
            if (index == 88) {
                break;
            }
            System.out.println("�����빺��������");
            int num = scanner.nextInt();
            order[index - 1] = index;
            quantity[index - 1] += num;
        }
    }

    public void showOrder() {
        System.out.println("������");
        int totalPrice = 0;
        for (int i = 0; i < menu.length; i++) {
            if (order[i] != 0) {
                System.out.println(order[i] + " " + menu[i] + " " + quantity[i] + "�� ����" + price[i] + "Ԫ");
                totalPrice += price[i] * quantity[i];
            }
        }
        System.out.println("��" + totalPrice + "Ԫ");
    }

    public static void main(String[] args) {
        Order system = new Order();
        system.showMenu();
        system.orderFood();
        system.showOrder();
    }
}
