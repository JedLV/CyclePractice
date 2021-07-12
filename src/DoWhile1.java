/*
用do-while循环打印100以内的所有奇数和
 */

public class DoWhile1 {
    public static void main(String[] args) {
        int i = 1; int sum = 0;
        do {
            sum += i;
            i++;
        }while (i <= 100);
            System.out.println(sum);

    }
}
