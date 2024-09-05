import java.util.Random;

class ComprehensiveBeginner01_02 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr;
        arr = new int[10];
        int sum = 0;

        for (int i = 0; i <= 9; i++) {
            arr[i] = r.nextInt(100) + 1;
            sum += arr[i];

            if (sum > 100) {
                System.out.println("合計値は" + sum + "です。");
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j] == 0) {
                        break;
                    } else {
                        System.out.println(arr[j]);
                    }
                }
                break;
            }
        }
    }
}
