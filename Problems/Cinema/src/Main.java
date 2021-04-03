import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int rowNo = 0;
        boolean flag = true;
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int k = sc.nextInt();
        for (int i = 1; i <= n && flag; i++) {
            int availableSeats = 0;
            int c = 0;
            for (int j = 0; j < m; j++) {
                if (arr[i - 1][j] == 0) {
                    if (j == c + 1 || j == c) {
                        availableSeats++;
                        if (availableSeats >= k) {
                            rowNo = i;
                            flag = false;
                            break;
                        }
                        c = j;
                    } else {
                        availableSeats = 1;
                        if (availableSeats >= k) {
                            rowNo = i;
                            flag = false;
                            break;
                        }
                        c = j;
                    }
                }

            }
        }
        System.out.println(rowNo);


    }
}