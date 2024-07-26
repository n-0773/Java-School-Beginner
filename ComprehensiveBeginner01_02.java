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
