package ra.bt1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        sumOfTwo();
    }

    private static void sumOfTwo() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhập vào số thứ nhất: ");
            int firstNumber = Integer.parseInt(sc.nextLine());
            System.out.print("Nhập vào số thứ hai: ");
            int secondNumber = Integer.parseInt(sc.nextLine());
            System.out.print("Tổng của hai số " + firstNumber + " và " +  secondNumber + " là: " + (firstNumber + secondNumber));
        } catch (NumberFormatException e) {
            System.out.println("Bạn phải nhập vào số");
            sumOfTwo();
        }
    }
}
