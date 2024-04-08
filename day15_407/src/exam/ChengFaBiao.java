package exam;

/**
 * ClassName:ChengFaBiao
 * Package:exam
 *
 * @Author 86183
 * @Create 2024/4/7 14:56
 */
//¥Ú”°æ≈æ≈≥À∑®±Ì
public class ChengFaBiao {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + j * i + "\t");
            }
            System.out.println();
        }
    }
}