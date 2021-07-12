/*
用for循环打印完整的九九乘法表
 */

public class ForTest6 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.println(i + " * " + j + " = " + j * i + "");
            }
            System.out.println();
            System.out.println("\n");
        }
    }
}