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
        String str = "朋友不曾孤单过,一声朋友你会懂,还有伤还有痛,还要走还有我,朋友一生一起走";
        // 找到第一个"朋友"的位置
        int firstPosition = str.indexOf("朋友");
        if (firstPosition != -1) {
            // 从第一个"朋友"之后的位置开始搜索第二个"朋友"
            int secondPosition = str.indexOf("朋友", firstPosition + 2); // +2 是因为我们要跳过已经找到的第一个"朋友"
            if (secondPosition != -1) {
                System.out.println("第二个'朋友'所在的位置是: 第" + (secondPosition - 1) + "个位置");
            } else {
                System.out.println("没有找到第二个'朋友'。");
            }
        } else {
            System.out.println("没有找到'朋友'。");
        }

    }
}
