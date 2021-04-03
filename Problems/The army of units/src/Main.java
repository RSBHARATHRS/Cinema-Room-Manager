import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 1) {
            System.out.println("no army");
        } else if (1 <= n && n <= 19) {
            System.out.println("pack");
        } else if (20 <= n && n <= 249) {
            System.out.println("throng");
        } else if (250 <= n && n <= 999) {
            System.out.println("zounds");
        } else if (n >= 1000) {
            System.out.println("legion");
        }
    }
}