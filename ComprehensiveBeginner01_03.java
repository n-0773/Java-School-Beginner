// 新規Java ファイル「ComprehensiveBeginner01_03.java」というファイルを作成し、
// メインメソッドを書き、
// 下記の通りコーディングしてください。

// 以下の 条件分岐文を作成してください
// 1 ~ 3 のランダムな 変数 man, woman, child を宣言
// 3つの変数には以下の性質があります
// 3 は 2 に強く、2 は 1 に強く、1 は 3 に強い
// 強い値がでた変数名を「変数名 が勝ちました」と表示させる
// 強い値が複数出た場合「変数名A と 変数名B が勝ちました」と表示させる
// 全ての変数が同じ値の場合、「あいこです」と表示させる
// 全ての変数が違う値の場合、「あいこです」と表示させる
    
import java.util.Random;

class ComprehensiveBeginner01_03 {
    public static void main(String[] args) {
        Random rand = new Random(); 
        int man = rand.nextInt(3) +1;
        int woman = rand.nextInt(3) +1;
        int child = rand.nextInt(3) +1;

        if ((man == woman && woman == child) 
            || man != woman && man != child && woman != child ){
            System.out.println("あいこです");
        } else if (man == 1 ) {
            if (woman == 3 && child == 3) {
                System.out.println("man が勝ちました");
            } else if (woman == 3 && man == child) {
                System.out.println("man と child が勝ちました");
            } else if (child == 3 && man == woman) {
                System.out.println("man と woman が勝ちました");
            } else if (woman == 2 && woman == child) {
                System.out.println("woman と child が勝ちました");
            } else if (woman == 2 && woman != child) {
                System.out.println("woman が勝ちました");
            } else {
                System.out.println("child が勝ちました");
            }
        } else if (man ==  2) {
            if (woman == 1 && child == 1) {
                System.out.println("man が勝ちました");
            } else if (woman == 1 && man == child) {
                System.out.println("man と child が勝ちました");
            } else if (child == 1 && man == woman) {
                System.out.println("man と woman が勝ちました");
            } else if (woman == 3 && woman == child) {
                System.out.println("woman と child が勝ちました");
            } else if (woman == 3 && woman != child) {
                System.out.println("woman が勝ちました");
            } else {
                System.out.println("child が勝ちました");
            }
        } else if (man ==  3) {
            if (woman == 2 && child == 2) {
                System.out.println("man が勝ちました");
            } else if (woman == 2 && man == child) {
                System.out.println("man と child が勝ちました");
            } else if (child == 2 && man == woman) {
                System.out.println("man と woman が勝ちました");
            } else if (woman == 1 && woman == child) {
                System.out.println("woman と child が勝ちました");
            } else if (woman == 1 && woman != child) {
                System.out.println("woman が勝ちました");
            } else {
                System.out.println("child が勝ちました");
            }
        }
    }
}
