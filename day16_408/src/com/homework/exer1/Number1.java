package com.homework.exer1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ClassName:Number1
 * Package:com.homework.exer1
 *
 * @Author 86183
 * @Create 2024/4/8 18:28
 */
/*
�ѵ�ǰ���ڶ����ʽ��Ϊ ָ����ʽ(2024��03��08�� 16ʱ40��20�� )
 */
public class Number1 {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd�� HHʱmm��ss��");
        //��ʽ������
        Date date = new Date();
        String strDate = sdf.format(date);
        System.out.println(strDate);
    }
}
