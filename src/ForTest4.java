/*
用for循环打印100以内的所有整数的和
 */

public class ForTest4 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++){
            System.out.println(i);
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
