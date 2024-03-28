//九九乘法表
public class ChengFaBiao  {
	public static void main(String[] args) {
		for (int i = 1; i<10; i++ ) {
			for (int j = 1; j<i+1; j++ ) {
				System.out.print(j+"*"+i+"="+j*i+"\t");
			}
			System.out.println();
		}
		System.out.println("=========================================================");
		//倒置乘法表
		/*for (int i = 9; i>=1; i-- ) {
			for (int j = 1; j<i+1; j++ ) {
				System.out.print(j+"*"+i+"="+j*i+"\t");
			}
			System.out.println();
		}
*/


	}
}