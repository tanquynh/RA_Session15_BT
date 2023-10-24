package ra.bt2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào độ dài của mảng");
        int arrLength = Integer.parseInt(sc.nextLine());
        int[] arr = new int[arrLength];
        if (arr.length == 0) {
            throw new NullPointerException("Mảng rỗng");
        } else {
            for (int i = 0; i < arr.length; i++) {
                System.out.println("Nhập vào số thứ " + (i + 1) + ": ");
                arr[i] = Integer.parseInt(sc.nextLine());
            }
            int max = searchMax(arr);
            System.out.println("Số lớn nhất trong mảng là: " + max);
        }

    }

    private static int searchMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
