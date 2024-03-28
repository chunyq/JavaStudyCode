//纸折叠成珠峰的高度
public class PaperFolding {
	public static void main(String[] args) {
		//珠峰高度
		double m = 8844430;
		//纸的厚度
		double i = 0.1;
		//折叠次数
		int count = 0;
		while (i<m) {
			i *= 2;
			count++;
		}
		System.out.println("折叠"+count+"次，可以折成珠穆朗玛峰的高度");
		
	}
}