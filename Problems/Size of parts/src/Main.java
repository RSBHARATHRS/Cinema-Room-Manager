import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int shipped = 0;
        int fixed = 0;
        int reject = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                shipped++;
            } else if (arr[i] == 1) {
                fixed++;
            } else {
                reject++;
            }
        }

        System.out.println(shipped + " " + fixed + " " + reject);
    }
}