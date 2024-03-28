import java.util.Scanner;

/**
 * ClassName:App Package:PACKAGE_NAME Description:
 *
 * @Author zsx(YQ)
 * @Create 2024/3/26 20:11
 * @Version 1.0
 */
/*
外卖点餐系统：
	模拟外卖点餐APP:
	声明两个数组：分别用来表示 菜单和对应的价位
	实现：
		1.显示菜单
			比如： 1 鱼香肉丝  15元
		2.点餐：
			需要再声明两个数组
			分别用来保存购买的商品(编号)及对应的数量：
			可无限次点餐(输入特定指令表示退出 比如88 )
		3.显示订单
			1 鱼香肉丝  3份  单价15元	共45元
 */
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] menu = {"鱼香肉丝", "番茄炒蛋", "饺子", "包子", "牛奶"};
        double[] price = {15.5, 13, 12, 1.5, 2};
        // 创建数组保存购买的商品数量
        int[] quan = new int[menu.length];
        int in = 0;
        while (true) {
            // 显示菜单
            System.out.println("本店最新菜品");
            System.out.println("=========================");
            System.out.println("编号\t菜名\t\t价位");
            System.out.println("=========================");
            for (int i = 0; i < menu.length; i++) {
                System.out.println((i + 1) + "\t" + menu[i] + "\t\t" + price[i]);
            }
            // 点餐功能
            System.out.println("==========点餐的过程===============");
            System.out.println("请点餐：输入 88点餐结束");
            in = sc.nextInt();
            if (in == 88) {
                System.out.println("欢迎下次光临！");
                break;
            } else {
                int index = in - 1;
                if (index >= 0 && index < menu.length) {
                    System.out.println("请输入数量：");
                    int o = sc.nextInt();
                    quan[index] += o;

                } else {
                    System.out.println("无效的菜单选项！");
                }

            }
        }

        // 生成订单
        System.out.println("=====生成订单=====");
        System.out.println("商品名称\t商品单价\t购买数量\t 小计");
        int total = 0;
        for (int i = 0; i < menu.length; i++) {
            if (quan[i] > 0) {
                total += quan[i] * price[i];
                System.out.println(menu[i] + "\t\t" + price[i] + "\t" + quan[i] + "\t" + quan[i] * price[i]);
            }
        }
        System.out.println("-------------------------------总计：" + total + "元");

        // 选择支付方式
        System.out.println("请选择支付方式  1支付宝  2 微信支付");
        int pay = sc.nextInt();
        if (pay == 1) {
            System.out.println(" >>>> 跳转到支付宝支付页面.....");
        } else if (pay == 2) {
            System.out.println(">>>> 跳转到微信支付页面.....");
        } else {
            System.out.println("输入错误，请重新输入");
        }

    }
}
