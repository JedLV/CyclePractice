/*
用do-while循环打印100以内的所有奇数和 //DoWhile1是整数和
 */

public class DoWhile3 {
    public static void main(String[] args) {
        int i = 1; int sum = 0;
        do {
            if (i % 2 == 1) {
                System.out.println(i);
            }
            sum += i;
            i++;
        }while (i <= 100);
        System.out.println(sum);

    }


}
