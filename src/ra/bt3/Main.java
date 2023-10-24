package ra.bt3;

public class Main {
    public static void main(String[] args) {
        Object[] arr = {0,"abc",1,2,3,4};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            try {
                sum += (int) arr[i];
            } catch (Exception e) {
                System.out.println("Phần tử không phải số");
                sum += 0;
            }
        }
        System.out.println(sum);
    }
}
