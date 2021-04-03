import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        if (n * m >= k) {
            if (m <= k && m <= k) {
                if (k % Math.min(n, m) == 0 || k % Math.max(n, m) == 0 || (m * n) % k == 0) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            } else {
                System.out.println("NO");
            }

        } else {
            System.out.println("NO");
        }
    }
}