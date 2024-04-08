package com.teacher.exception;

import com.teacher.exception.LargeThan120Exception;
import com.teacher.exception.LessThan0Exception;

/**
 * @Author yh
 * @create 15:41
 */
public class Student {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws LargeThan120Exception, LessThan0Exception {//0-120
        //public void setAge(int age)  {//运行期异常：方法后不需要声明异常，只需要在条件后 抛出异常对象即可！
        if (age < 0) {
            //    抛出年龄小于0的异常
            throw new LessThan0Exception();
        } else if (age > 120) {
            //    抛出年大于120的异常
            throw new LargeThan120Exception(" 年龄太大了，不合适！！");
        } else {
            this.age = age;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
