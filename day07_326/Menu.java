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
定义两个数组：
	String[] menu= {"鱼香肉丝","番茄炒蛋","饺子","包子","牛奶"};
	double[]price= {15.5 ,13,12,1.5,2};
	遍历数组得到如下结果：
        本店最新菜品
        菜名	价位
        =========================
        编号	菜名		价位
        1		鱼香肉丝	15.5
        2		番茄鸡蛋盖饭13.0
        3		饺子		12.0
        4		包子		1.5
        5		牛奶		2.0
 */
public class Menu {
    public static void main(String[] args) {
        String[] menu = {"鱼香肉丝","番茄炒蛋","饺子","包子","牛奶"};
        double[] price = {15.5 ,13,12,1.5,2};

        System.out.println("本店最新菜品");
        System.out.println("=========================");
        System.out.println("编号\t菜名\t\t价位");
        System.out.println("=========================");

        for (int i = 0; i < menu.length; i++) {
            System.out.println((i+1) + "\t" + menu[i] + "\t\t" + price[i]);
        }
    }
}
