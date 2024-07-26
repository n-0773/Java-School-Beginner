import java.util.Scanner;

class ComprehensiveBeginner01_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("何段>");
        int inputNum = new java.util.Scanner(System.in).nextInt();
        // 2. 終了させるための処理を書く
        if (inputNum < 1 || inputNum > 5) {
            System.out.println("1 ~ 5 までの整数を入力してください");
        // 3. の処理を書く
        } else {
            for (int a = 1; a <= 5; a++) {
                for (int b = 4; a <= b; b--) {
                    System.out.print(" ");
                }
                for (int c = 2; c <= a; c++) {
                    System.out.print("*");
                }
                    System.out.println("*");
                if (a == inputNum) {
                    break;
                }
            }
        }
    }
}