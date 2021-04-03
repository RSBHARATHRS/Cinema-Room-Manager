import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        int bigNum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (bigNum < arr[i][j]) {
                    bigNum = arr[i][j];
                }
            }
        }
        boolean flag = true;
        int row = 0;
        int column = 0;
        for (int i = 0; i < n && flag; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == bigNum) {
                    row = i;
                    column = j;
                    flag = false;
                    break;
                }
            }
        }
        System.out.println(row + " " + column);
    }
}