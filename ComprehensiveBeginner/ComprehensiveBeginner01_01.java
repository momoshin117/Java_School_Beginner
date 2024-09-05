import java.util.Scanner;

class ComprehensiveBeginner01_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr;
        arr = new int[3];

        for (int i = 0; i <= 2; i++) {

            System.out.print((i + 1) + "番目の数字を入力してください ＞ ");

            arr[i] = sc.nextInt();

            System.out.println(
                    (i + 1) + "番目の要素の値は" + arr[i] + "で、2倍にすると" + (2 * arr[i]) + "になり、3で割ったあまりは" + (arr[i] % 3) + "です。");
        }
        sc.close();
    }
}
