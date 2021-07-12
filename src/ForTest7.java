/*
用for循环打印100以内的所有质数（素数）
 */

public class ForTest7 {
    public static void main(String[] args) {

        for (int i = 2; i <= 100; i++){
            boolean isFlag = true;
            for (int j = 2; j < i; j++){
                if (i % j == 0){
                    isFlag = false;
                    break;
                }
            }
            if (isFlag = true){
                System.out.println(i);
            }
            isFlag = true;

        }


    }
}
