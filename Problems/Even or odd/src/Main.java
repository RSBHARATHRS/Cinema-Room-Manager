import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 20;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] == 0) {
                break;
            }
        }
        for (int j = 0; j < n; j++) {
            if (arr[j] != 0) {
                if (arr[j] % 2 == 0) {
                    System.out.println("even");
                } else {
                    System.out.println("odd");
                }
            } else {
                break;
            }
        }
    }
}