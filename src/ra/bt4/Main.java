package ra.bt4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nhập vào một số");
        String input = new Scanner(System.in).nextLine();
        int result = 0;
        int count = 1;
        for (int i = 0; i < input.length(); i++) {
            try {
                int number = Integer.parseInt(String.valueOf(input.charAt(i)));
                result = result * 10 + number;
            } catch (NumberFormatException e) {
                System.out.println("Có " + count + " ký tự không phải số nguyên được thay thế bằng 0");
                count++;
                result *= 10;
            }
        }
        System.out.println(result);
    }
}
