/*
用while循环打印100以内的所有奇数
 */

public class WhileTest1 {
    public static void main(String[] args) {
        int i = 1;
        while (i < 100){
            i++;
            if (i % 2 == 1){
                System.out.println(i);
            }
        }

    }
}
