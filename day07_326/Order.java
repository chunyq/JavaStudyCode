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
    private String[] menu = {"鱼香肉丝", "宫保鸡丁", "红烧肉", "麻婆豆腐", "糖醋排骨"};
    private int[] price = {15, 18, 20, 16, 22};
    private int[] order = new int[menu.length];
    private int[] quantity = new int[menu.length];

    public void showMenu() {
        System.out.println("菜单：");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + " " + menu[i] + " " + price[i] + "元");
        }
    }

    public void orderFood() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入菜品编号（输入88退出）：");
            int index = scanner.nextInt();
            if (index == 88) {
                break;
            }
            System.out.println("请输入购买数量：");
            int num = scanner.nextInt();
            order[index - 1] = index;
            quantity[index - 1] += num;
        }
    }

    public void showOrder() {
        System.out.println("订单：");
        int totalPrice = 0;
        for (int i = 0; i < menu.length; i++) {
            if (order[i] != 0) {
                System.out.println(order[i] + " " + menu[i] + " " + quantity[i] + "份 单价" + price[i] + "元");
                totalPrice += price[i] * quantity[i];
            }
        }
        System.out.println("共" + totalPrice + "元");
    }

    public static void main(String[] args) {
        Order system = new Order();
        system.showMenu();
        system.orderFood();
        system.showOrder();
    }
}
