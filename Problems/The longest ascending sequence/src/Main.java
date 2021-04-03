import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] intArr = new int[n];

        for (int i = 0; i < n; i++) {
            intArr[i] = sc.nextInt();
        }
        int count = 1;
        int big = 1;
        for (int j = 0; j < n - 1; j++) {
            if (intArr[j] < intArr[j + 1]) {
                count++;
                if (big < count) {
                    big = count;
                }
            } else {
                count = 1;
            }
            //big = count;

        }
        System.out.println(big);

    }
}