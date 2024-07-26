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