import java.util.*;

public class QiGuo {
	public static void main(String[] args) {
		//·êÆß¹ý
		for (int i = 1; i<=100; i++ ) {
			if (i % 7 == 0 || i%10 == 7 || i/10%10 == 7) {
				System.out.println("¹ý£¡");
				continue;
			}
			System.out.println(i);
		}
	}
}