package com.homework.exer3;

/**
 * ClassName:StudentTest
 * Package:com.homework.exer3
 *
 * @Author 86183
 * @Create 2024/4/8 20:46
 */
public class StudentTest {
    public static void main(String[] args) {
        Student[] students = new Student[]{
                new Student("张三", 17, '男', 90),
                new Student("李四", 16, '女', 85),
                new Student("王五", 18, '男', 88),
                new Student("赵六", 15, '女', 92),
                new Student("周杰", 17, '男', 89)
        };

        // （1）请查询是否包含"张三"同学？
        boolean containsZhangSan = false;
        for (Student student : students) {
            if (student.getName().equals("张三")) {
                containsZhangSan = true;
                break;
            }
        }
        System.out.println("是否包含张三：" + containsZhangSan);

        // （2）请找出所有未成年的学生
        System.out.println("未成年的学生：");
        for (Student student : students) {
            if (student.getAge() < 18) {
                System.out.println(student);
            }
        }

        // （3）请列出所有女生的姓名
        System.out.println("女生姓名：");
        for (Student student : students) {
            if (student.getSex() == '女') {
                System.out.println(student.getName());
            }
        }

        // （4）请把"周杰"同学的名字修改为“周杰伦”，然后打印这个学生的所有信息
        for (Student student : students) {
            if (student.getName().equals("周杰")) {
                student.setName("周杰伦");
                System.out.println("修改后的学生信息：" + student);
                break;
            }
        }

    }
}
