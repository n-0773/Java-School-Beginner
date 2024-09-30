// 新規Java ファイル「ComprehensiveBeginner01_02.java」というファイルを作成し、
// メインメソッドを書き、
// 下記の通りコーディングしてください。

// 1～100までのランダムな 整数 を繰り返して代入し、
// 合計が 100 を超えた場合、または代入が 10 回行われた場合、
// 入力を止め、合計値 と 入力された数値をすべて表示するプログラムを作成してください。
    
import java.util.Random;

class ComprehensiveBeginner01_02 {
    public static void main(String[] args) {
        Random rand = new Random();
        
        int num = 0;
        
        for(int a = 0; a <= 10; a++) {
            int b = rand.nextInt(100) +1;
            num = (num + b);
            System.out.print(b);

            if (num <= 100) {
                System.out.print("+");
            } else if (100 < num) {
                break;
            }
        }
        System.out.print("=" + num);
    }
}
