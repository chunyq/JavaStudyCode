package com.oop.exer3;

import com.oop.exer1.Account;

/**
 * ClassName:Tongji
 * Package:com.oop.exer3
 *
 * @Author 86183
 * @Create 2024/3/30 12:02
 */
public class Tongji {
    public static void main(String[] args) {
        Account[] a = new Account[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = new Account();
            a[i].setBalance((int) (Math.random() * 1001) + 1000);
        }

        //�鿴�������п��Ĵ���ܶ�
        System.out.println(a.length+"�����п��Ĵ���ܶ�:"+sum(a));
        //�鿴�������п���ƽ�����
        System.out.println(a.length+"�����п���ƽ�����:"+avg(a));
        //�鿴�������п��������
        System.out.println(a.length+"�����п�������"+getMax(a));
        //�鿴�������п�����С���
        System.out.println(a.length+"�����п�����С��"+getMin(a));
    }
    public static double sum(Account[] a){
        double sum= 0;
        for (Account account : a) {
            sum += account.getBalance();
        }
        return sum;
    }

    public static double avg(Account[] a){
        double s = sum(a);
        double avg = s / a.length;
        return avg;
    }

    public static double getMax(Account[] a){
        double max = a[0].getBalance();
        for (Account account : a) {
            if (account.getBalance() > max) {
                max = account.getBalance();
            }
        }
        return max;
    }

    public static double getMin(Account[] a){
        double min = a[0].getBalance();
        for (Account account : a) {
            if (account.getBalance() < min) {
                min = account.getBalance();
            }
        }
        return min;
    }

}
