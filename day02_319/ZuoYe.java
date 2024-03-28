public class ZuoYe{
	public static void main(String[] args) {
		//年龄 byte类型
		byte age = 22;
		// 期望薪资 short类型
		short slary = 12000;
		// 班级号 String类型
		String classKey = "Java20240201";
		// 手机号 long类型 注意后缀L
		long phone = 18436694741L;
		// 分数 float 注意后缀F
		float scorce = 90.0F;
		//体重 double类型
		double weight = 150.5;
		// 性别 char类型
		char gender = '男';
		// 是否掌握 boolean类型 返回true/false
		boolean h = true;
		// 自我评价 String类型
		String self = "通过这段时间的学习，让我慢慢入门了Java";

		System.out.println("年龄："+age);
		System.out.println("期望薪资："+slary);
		System.out.println("班级号："+classKey);
		System.out.println("手机号："+phone);
		System.out.println("分数："+scorce);
		System.out.println("体重："+weight);
		System.out.println("性别："+gender);
		System.out.println("是否掌握："+h);
		System.out.println("自我评价："+self);
	}
}