// 新規Java ファイル「ComprehensiveBeginner01_01.java」というファイルを作成し、
// メインメソッドを書き、
// 下記の通りコーディングしてください。

// 配列arrayを使用し、1、50、10を入力させ、入力された各々の数値を演算した結果を表示するプログラムを作成してください。
// また、出力する際は以下のような文章で全ての要素に対して出力をしてください。

// 「1番目の要素の値は 1 で、2倍にすると 2 になり、3 で割ったあまりは 1 です」

class ComprehensiveBeginner01_01 {
    public static void main(String[] args) {
        int[] array ={1, 50, 10};

        for (int i = 0; i <= 2; i++) {
            System.out.println(
                (i + 1) + "番目の要素の値は " + array[i] + " で、2倍にすると " + (array[i] * 2)
                + " になり、3 で割ったあまりは " + (array[i] % 3) + " です");
        }        
    }
}
