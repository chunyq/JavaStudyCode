package com.homework;

/**
 * ClassName:ProduceTest
 * Package:com.homework
 *
 * @Author 86183
 * @Create 2024/3/28 19:30
 */
/*
1.按照以上要求定义Manager类和Coder类,生成空参、有参构造
2.定义测试类,在main方法中创建每个类的对象并给属性赋值
3.调用每个对象的成员方法,打印格式如下:
工号为123基本工资为15000奖金为6000的项目经理周扒皮正在努力的做着管理工作,分配任务,检查员工提交上来的代码.....
工号为135基本工资为10000的程序员杨白劳正在努力的写着代码......
 */
public class ProduceTest {
    public static void main(String[] args) {
        //创建对象并初始化属性
        Manager manager = new Manager("周扒皮","123",15000,6000);
        Coder coder = new Coder("杨白劳","135",10000);

        manager.work();
        coder.work();

    }
}
