/*
用for循环打印100以内的所有奇数的和
 */

public class ForTest3 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i<= 100;i++){
            if (i % 2 == 1){
                System.out.println(i);
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}
