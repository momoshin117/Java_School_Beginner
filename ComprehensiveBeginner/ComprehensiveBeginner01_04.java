import java.util.Scanner;

class ComprehensiveBeginner01_04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("何段>");
        int inputNum;
        inputNum = sc.nextInt();

        if (inputNum > 5 || inputNum < 1) {

            System.out.print("1～5までの整数を入力してください");
        } else {

            for (int i = 1; i <= inputNum; i++) {

                for (int j = 1; j < inputNum; j++) {
                    if (j <= inputNum - i) {
                        System.out.print(" ");

                    } else {
                        System.out.print("*");
                    }
                }
                System.out.println("*");
            }
            sc.close();
        }

    }
}
