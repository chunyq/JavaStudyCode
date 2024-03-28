/*
含3过
打印1到100之内的整数，但数字中包含3的要跳过
    每行输出5个满足条件的数，之间用空格分隔
    如：1 2 4 5 6
     7 8 9 10 11
 */
public class HanSanGuo {
	public static void main(String[] args) {
		 int count = 0; // 用于计数每行打印的数字个数  
        for (int i = 1; i <= 100; i++) {  
            // 检查数字是否包含3  
            boolean containsThree = false;  
            int temp = i;  
            while (temp > 0) {  
                if (temp % 10 == 3) {  
                    containsThree = true;  
                    break;  
                }  
                temp /= 10;  
            }  
            // 如果数字包含3，则跳过  
            if (containsThree) {  
                continue;  
            }  
            // 打印数字，并增加计数器  
            System.out.print(i);  
            count++;  
            // 如果不是每行的最后一个数，则输出空格  
            if (count < 5) {  
                System.out.print(" ");  
            } else {  
                // 如果是每行的最后一个数，则输出换行符，并重置计数器  
                System.out.println();  
                count = 0;  
            }  
        }  
        // 如果最后一行数字不足5个，也输出换行符（可选，取决于是否严格要求每行必须有5个数字）  
        if (count > 0) {  
            System.out.println();  
        }  
	}
}