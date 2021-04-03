import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int[][] arr = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int i = sc.nextInt();
        int j = sc.nextInt();
//        int y = j;
//        if (j == 0) {
//            y = columns;
//        }
        int temp;
        for (int k = 0; k < rows; k++) {
            temp = arr[k][i];
            arr[k][i] = arr[k][j];
            arr[k][j] = temp;
        }
        for (int l = 0; l < rows; l++) {
            for (int m = 0; m < columns; m++) {
                System.out.print(arr[l][m] + " ");
            }
            System.out.println();
        }
    }
}