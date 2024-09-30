// 新規Java ファイル「ComprehensiveBeginner01_04.java」というファイルを作成し、
// メインメソッドを書き、
// 下記の通りコーディングしてください。

// 下記の例文を参考に、2重for 文を利用して以下の結果となるようなプログラムを完成させてください

// コンソール(ターミナル)に 1 ~ 5 までの整数を入力し、[Enter]
// 1 ~ 5 以外の数値が入力された場合、「 1 ~ 5 までの整数を入力してください」と出力させ、プログラムを終了させる
// 入力された値の高さの階段を描画（表示）する
    
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
