//使用do..while语句输出1-100的偶数

public class OuShu {
	public static void main(String[] args) {
		int m = 0;
		do{
			if (m % 2 == 0) {
				System.out.println(m);
			}
			m++;

		} while(m<=100);
	}
}

/*
关键字
public class static if do while for byte short int long 
float double String switch case default break char boolean
new void .....
 */