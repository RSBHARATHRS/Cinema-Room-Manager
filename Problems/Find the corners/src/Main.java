import java.util.Scanner;

class ArrayOperations {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        printCorners(arr);

    }
    public static void printCorners(int[][] twoDimArray) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if ((i == 0 && j == 0) || (i == 0 && j == 2) || (j == 0 && i == 2) || (i == 2 && j == 2)){
                    System.out.print(twoDimArray[i][j]+" ");
                }
            }
        }
        System.out.println();
    }
}