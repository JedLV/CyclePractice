/*用while循环打印100以内的所有奇数和

 */

public class WhileTest2 {
    public static void main(String[] args) {
        int i = 1; int sum = 1;
        while (i < 100){
            i++;
            if (i % 2 == 1){
                sum = sum + i;
                System.out.println(i);
            }
        }
        System.out.println(sum);

    }
}