package exam;

/**
 * ClassName:ShuiXianHua
 * Package:exam
 *
 * @Author 86183
 * @Create 2024/4/7 15:01
 */
//输出所有水仙花数
public class ShuiXianHua {
    public static void main(String[] args) {
        //定义个、十、百位数
        int g = 0;
        int s = 0;
        int b = 0;
        for (int i = 100; i <= 999; i++) {
            //获取个、十、百位
            g = i % 10;
            s = i / 10 % 10;
            b = i / 100;
            if (g * g * g + b * b * b + s * s * s == i) {
                System.out.println("水仙花数:" + i);
            }
        }
    }
}
