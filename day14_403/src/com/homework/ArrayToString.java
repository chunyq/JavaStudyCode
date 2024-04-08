package com.homework;

/**
 * ClassName:ArrayToString
 * Package:com.homework
 *
 * @Author 86183
 * @Create 2024/4/3 17:23
 */
public class ArrayToString {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        String result = arrayToString(arr);
        System.out.println("½á¹ûÎª£º" + result);
    }

    public static String arrayToString(int[] array) {
        if (array == null || array.length == 0) {
            return "[]";
        }

        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        sb.append(']');
        return sb.toString();
    }
}
